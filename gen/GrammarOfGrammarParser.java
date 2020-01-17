// Generated from /home/galina13/IdeaProjects/MT/parserGenerator2/src/GrammarOfGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarOfGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AtrCode=11, TokenName=12, Rgx=13, WS=14;
	public static final int
		RULE_start = 0, RULE_strings = 1, RULE_atrType = 2, RULE_nullValue = 3, 
		RULE_rule_ = 4, RULE_atrCode = 5, RULE_mainNotTerminal = 6, RULE_notTerminal = 7, 
		RULE_expr = 8, RULE_token = 9, RULE_terminalExpr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "strings", "atrType", "nullValue", "rule_", "atrCode", "mainNotTerminal", 
			"notTerminal", "expr", "token", "terminalExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "';'", "'Integer'", "'Boolean'", "'Double'", "':'", 
			"'|'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "AtrCode", 
			"TokenName", "Rgx", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammarOfGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarOfGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarOfGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			strings();
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringsContext extends ParserRuleContext {
		public Rule_Context rule_() {
			return getRuleContext(Rule_Context.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public AtrTypeContext atrType() {
			return getRuleContext(AtrTypeContext.class,0);
		}
		public NullValueContext nullValue() {
			return getRuleContext(NullValueContext.class,0);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_strings);
		int _la;
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TokenName:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(25);
					match(T__0);
					setState(26);
					atrType();
					setState(27);
					nullValue();
					setState(28);
					match(T__1);
					setState(29);
					match(T__2);
					}
				}

				setState(33);
				rule_();
				setState(34);
				match(T__2);
				setState(35);
				strings();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtrTypeContext extends ParserRuleContext {
		public AtrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterAtrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitAtrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitAtrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrTypeContext atrType() throws RecognitionException {
		AtrTypeContext _localctx = new AtrTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullValueContext extends ParserRuleContext {
		public NullValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitNullValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitNullValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueContext nullValue() throws RecognitionException {
		NullValueContext _localctx = new NullValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nullValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(42);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_Context extends ParserRuleContext {
		public MainNotTerminalContext mainNotTerminal() {
			return getRuleContext(MainNotTerminalContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AtrCodeContext> atrCode() {
			return getRuleContexts(AtrCodeContext.class);
		}
		public AtrCodeContext atrCode(int i) {
			return getRuleContext(AtrCodeContext.class,i);
		}
		public Rule_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterRule_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitRule_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitRule_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_Context rule_() throws RecognitionException {
		Rule_Context _localctx = new Rule_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			mainNotTerminal();
			setState(48);
			match(T__6);
			setState(49);
			expr(0);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AtrCode) {
				{
				setState(50);
				atrCode();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(53);
				match(T__7);
				setState(54);
				expr(0);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AtrCode) {
					{
					setState(55);
					atrCode();
					}
				}

				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtrCodeContext extends ParserRuleContext {
		public TerminalNode AtrCode() { return getToken(GrammarOfGrammarParser.AtrCode, 0); }
		public AtrCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterAtrCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitAtrCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitAtrCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrCodeContext atrCode() throws RecognitionException {
		AtrCodeContext _localctx = new AtrCodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atrCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(AtrCode);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainNotTerminalContext extends ParserRuleContext {
		public NotTerminalContext notTerminal() {
			return getRuleContext(NotTerminalContext.class,0);
		}
		public MainNotTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainNotTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterMainNotTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitMainNotTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitMainNotTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainNotTerminalContext mainNotTerminal() throws RecognitionException {
		MainNotTerminalContext _localctx = new MainNotTerminalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainNotTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			notTerminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotTerminalContext extends ParserRuleContext {
		public TerminalNode TokenName() { return getToken(GrammarOfGrammarParser.TokenName, 0); }
		public NotTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterNotTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitNotTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitNotTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotTerminalContext notTerminal() throws RecognitionException {
		NotTerminalContext _localctx = new NotTerminalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_notTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(TokenName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokenName:
			case Rgx:
				{
				setState(70);
				token();
				}
				break;
			case T__8:
				{
				setState(71);
				match(T__8);
				setState(72);
				expr(0);
				setState(73);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(77);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(78);
					expr(2);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TokenContext extends ParserRuleContext {
		public NotTerminalContext notTerminal() {
			return getRuleContext(NotTerminalContext.class,0);
		}
		public TerminalExprContext terminalExpr() {
			return getRuleContext(TerminalExprContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_token);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokenName:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				notTerminal();
				}
				break;
			case Rgx:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				terminalExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalExprContext extends ParserRuleContext {
		public TerminalNode Rgx() { return getToken(GrammarOfGrammarParser.Rgx, 0); }
		public TerminalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterTerminalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitTerminalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarOfGrammarVisitor ) return ((GrammarOfGrammarVisitor<? extends T>)visitor).visitTerminalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalExprContext terminalExpr() throws RecognitionException {
		TerminalExprContext _localctx = new TerminalExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_terminalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Rgx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3)\n\3\3\4\3\4\3\5\6\5.\n\5\r\5\16\5/\3\6\3\6\3\6\3\6\5\6\66\n\6"+
		"\3\6\3\6\3\6\5\6;\n\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\nN\n\n\3\n\3\n\7\nR\n\n\f\n\16\nU\13\n\3\13"+
		"\3\13\5\13Y\n\13\3\f\3\f\3\f\2\3\22\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3"+
		"\2\6\b\2Z\2\30\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f"+
		"A\3\2\2\2\16C\3\2\2\2\20E\3\2\2\2\22M\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2"+
		"\30\31\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\7\3\2\2\34\35\5\6\4\2"+
		"\35\36\5\b\5\2\36\37\7\4\2\2\37 \7\5\2\2 \"\3\2\2\2!\33\3\2\2\2!\"\3\2"+
		"\2\2\"#\3\2\2\2#$\5\n\6\2$%\7\5\2\2%&\5\4\3\2&)\3\2\2\2\')\3\2\2\2(!\3"+
		"\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\t\2\2\2+\7\3\2\2\2,.\13\2\2\2-,\3\2\2\2"+
		"./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61\62\5\16\b\2\62\63\7\t"+
		"\2\2\63\65\5\22\n\2\64\66\5\f\7\2\65\64\3\2\2\2\65\66\3\2\2\2\66>\3\2"+
		"\2\2\678\7\n\2\28:\5\22\n\29;\5\f\7\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<\67"+
		"\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@>\3\2\2\2AB\7\r\2\2"+
		"B\r\3\2\2\2CD\5\20\t\2D\17\3\2\2\2EF\7\16\2\2F\21\3\2\2\2GH\b\n\1\2HN"+
		"\5\24\13\2IJ\7\13\2\2JK\5\22\n\2KL\7\f\2\2LN\3\2\2\2MG\3\2\2\2MI\3\2\2"+
		"\2NS\3\2\2\2OP\f\3\2\2PR\5\22\n\4QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2T\23\3\2\2\2US\3\2\2\2VY\5\20\t\2WY\5\26\f\2XV\3\2\2\2XW\3\2\2\2Y"+
		"\25\3\2\2\2Z[\7\17\2\2[\27\3\2\2\2\13!(/\65:>MSX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}