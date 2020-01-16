import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.HashSet;

public class FollowMakingVisitor extends GrammarOfGrammarBaseVisitor {
    public static Boolean changed;
    public static HashMap<String, HashSet<String>> followByToken;
    public static Boolean foundStart;

    public ParseTree findRightmostToken(GrammarOfGrammarParser.ExprContext ctx){
        if (ctx.getChildCount() == 1) {
            if (!TerminalListMakingVisitor.notTerminals.contains(ctx.getChild(0).getChild(0).getText()))
                return null;
            else
                return ctx.getChild(0).getChild(0);
        }
        if (ctx.getChildCount() == 2){
            ParseTree foundToken = findRightmostToken((GrammarOfGrammarParser.ExprContext) ctx.getChild(1));
            return foundToken;
            //if (foundToken == null){
            //    findRightmostToken((GrammarOfGrammarParser.ExprContext) ctx.getChild(0));
            //}
        }
        if (ctx.getChildCount() == 3){
            return findRightmostToken((GrammarOfGrammarParser.ExprContext) ctx.getChild(1));
        }
        return null;
    }

    public ParseTree findLefter(ParseTree ctx){
        ParseTree cur = ctx;
        cur = cur.getParent();
        while (true) {
            if (cur.getChildCount() > 2 && cur.getChild(1).getText() == ":")
                return null;
            if (cur.getChildCount() == 2){
                return findRightmostToken((GrammarOfGrammarParser.ExprContext) cur.getChild(0));
            }
            cur = cur.getParent();
        }
    }
    @Override public HashSet<String> visitExpr(GrammarOfGrammarParser.ExprContext ctx) {
        //expr : token |
        //        '(' expr ')' |
        //        expr expr;
        if (ctx.getChildCount() == 2){
            //expr : expr expr;
            GrammarOfGrammarParser.ExprContext leftExprCtx = (GrammarOfGrammarParser.ExprContext) ctx.getChild(0);
            ParseTree rightMostTokenCtx = findRightmostToken(leftExprCtx);
            if (rightMostTokenCtx == null) // A -> (B ';') (C D)
                return null;
            String rightMostToken = rightMostTokenCtx.getText();
            GrammarOfGrammarParser.ExprContext nextCtx = (GrammarOfGrammarParser.ExprContext) ctx.getChild(1);
            HashSet<String> nextFirst = FirstMakingVisitor.firstByExprCtx.get(nextCtx);
            if (!followByToken.containsKey(rightMostToken)){
                followByToken.put(rightMostToken, new HashSet<>());
            }
            nextFirst.removeAll(followByToken.get(rightMostToken));
            if (!nextFirst.isEmpty()){ //FOLLOW[B] ∪= FIRST(γ)∖{ε}
                followByToken.get(rightMostToken).addAll(nextFirst);
                if (followByToken.get(rightMostToken).contains("''")) {
                    followByToken.get(rightMostToken).remove("''");
                }
                changed = true;
            }
        }
        return null;
    }

    @Override public HashSet<String> visitRule_(GrammarOfGrammarParser.Rule_Context ctx){
        String tokenName = ctx.getChild(0).getText();
        if (!foundStart){
            foundStart = true;
            followByToken.put(tokenName, new HashSet<>());
            followByToken.get(tokenName).add("$");
        }
        Integer nextChildNum = 2;
        while (nextChildNum < ctx.getChildCount()){
            //HashSet<String> curChildFirst = FirstMakingVisitor.firstByExprCtx.get(ctx.getChild(nextChildNum));
            // if ε ∈ FIRST(γ)
            //    FOLLOW[B] ∪= FOLLOW[A]
            ParseTree rightMostTokenCtx = findRightmostToken((GrammarOfGrammarParser.ExprContext) ctx.getChild(nextChildNum));
            String rightMostToken = rightMostTokenCtx.getText();
            while (true) {
                if (rightMostToken == null)
                    break;
                HashSet<String> curChildFirst = FirstMakingVisitor.firstByExprCtx.get(ctx.getChild(nextChildNum));
                if (!followByToken.containsKey(rightMostToken)) {
                    followByToken.put(rightMostToken, new HashSet<>());
                }
                if (followByToken.containsKey(tokenName)) { //
                    HashSet<String> mainTokenFollow = followByToken.get(tokenName);
                    mainTokenFollow.removeAll(followByToken.get(rightMostToken));
                    if (!mainTokenFollow.isEmpty()) {
                        changed = true;
                        followByToken.get(rightMostToken).addAll(mainTokenFollow);
                    }
                }
                if (!followByToken.containsKey("''"))
                    break;
                rightMostTokenCtx = findLefter(rightMostTokenCtx);
                rightMostToken = rightMostTokenCtx.getText();
            }
            nextChildNum += 2;
        }
        return (HashSet<String>) visitChildren(ctx);
    }
}
