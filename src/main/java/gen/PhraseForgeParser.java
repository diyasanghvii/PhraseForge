// Generated from C:/Users/dsanghv3/IdeaProjects/SER502-Spring2023-Team13/src/main/Antlr\PhraseForge.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PhraseForgeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, PHRASE_NUM=30, PHRASE_BOOL=31, 
		Addition=32, Subtraction=33, Multiplication=34, Division=35, Logical_AND=36, 
		Logical_OR=37, Logical_NOT=38, LesserThan=39, GreaterThan=40, LesserThanOrEqualTo=41, 
		GreaterThanOrEqualTo=42, NotEqualTo=43, EqualTo=44, FORGE_VAR=45, PHRASE_STR=46, 
		EQT=47, FORGE_SPACES=48, FORGE_COMMENT=49;
	public static final int
		RULE_forge_pgm = 0, RULE_phrase_blk = 1, RULE_forge_cmd = 2, RULE_forge_asrt = 3, 
		RULE_asrts = 4, RULE_asrt_bool = 5, RULE_asrt_cmp = 6, RULE_asrt_num = 7, 
		RULE_asrt_eval = 8, RULE_forge_if = 9, RULE_else_forge_if = 10, RULE_forge_else = 11, 
		RULE_forge_while = 12, RULE_echo_forge = 13, RULE_forge_enh = 14, RULE_forgeRange = 15, 
		RULE_forge_loop = 16, RULE_forge_var = 17, RULE_dec_asrt = 18, RULE_inc_asrt = 19, 
		RULE_asrt_tern = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"forge_pgm", "phrase_blk", "forge_cmd", "forge_asrt", "asrts", "asrt_bool", 
			"asrt_cmp", "asrt_num", "asrt_eval", "forge_if", "else_forge_if", "forge_else", 
			"forge_while", "echo_forge", "forge_enh", "forgeRange", "forge_loop", 
			"forge_var", "dec_asrt", "inc_asrt", "asrt_tern"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pf_launch'", "'pf_abort'", "'{'", "'}'", "'quant'", "'logic'", 
			"'phrase'", "'('", "')'", "'test'", "'forge-test'", "'routeTest'", "'forge-routeTest'", 
			"'route'", "'forge-route'", "'while'", "'forge-while'", "'reveal'", "','", 
			"'for'", "'in'", "'the'", "'range'", "';;'", "'forge-for'", "'--'", "'++'", 
			"'??'", "'::'", null, null, "'+'", "'-'", "'*'", "'/'", "'$&'", "'$|'", 
			"'$!'", "'$<'", "'$>'", "'$<='", "'$>='", "'$!='", "'$=='", null, null, 
			"'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PHRASE_NUM", "PHRASE_BOOL", "Addition", 
			"Subtraction", "Multiplication", "Division", "Logical_AND", "Logical_OR", 
			"Logical_NOT", "LesserThan", "GreaterThan", "LesserThanOrEqualTo", "GreaterThanOrEqualTo", 
			"NotEqualTo", "EqualTo", "FORGE_VAR", "PHRASE_STR", "EQT", "FORGE_SPACES", 
			"FORGE_COMMENT"
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
	public String getGrammarFileName() { return "PhraseForge.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PhraseForgeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_pgmContext extends ParserRuleContext {
		public Phrase_blkContext phrase_blk() {
			return getRuleContext(Phrase_blkContext.class,0);
		}
		public Forge_pgmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_pgm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_pgm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_pgm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_pgm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_pgmContext forge_pgm() throws RecognitionException {
		Forge_pgmContext _localctx = new Forge_pgmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_forge_pgm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			phrase_blk();
			setState(44);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Phrase_blkContext extends ParserRuleContext {
		public List<Forge_cmdContext> forge_cmd() {
			return getRuleContexts(Forge_cmdContext.class);
		}
		public Forge_cmdContext forge_cmd(int i) {
			return getRuleContext(Forge_cmdContext.class,i);
		}
		public Phrase_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase_blk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterPhrase_blk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitPhrase_blk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitPhrase_blk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Phrase_blkContext phrase_blk() throws RecognitionException {
		Phrase_blkContext _localctx = new Phrase_blkContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_phrase_blk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__2);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				forge_cmd();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35184373466336L) != 0) );
			setState(52);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_cmdContext extends ParserRuleContext {
		public Forge_ifContext forge_if() {
			return getRuleContext(Forge_ifContext.class,0);
		}
		public Forge_whileContext forge_while() {
			return getRuleContext(Forge_whileContext.class,0);
		}
		public Forge_enhContext forge_enh() {
			return getRuleContext(Forge_enhContext.class,0);
		}
		public Forge_loopContext forge_loop() {
			return getRuleContext(Forge_loopContext.class,0);
		}
		public Echo_forgeContext echo_forge() {
			return getRuleContext(Echo_forgeContext.class,0);
		}
		public Forge_asrtContext forge_asrt() {
			return getRuleContext(Forge_asrtContext.class,0);
		}
		public Forge_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_cmdContext forge_cmd() throws RecognitionException {
		Forge_cmdContext _localctx = new Forge_cmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forge_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(54);
				forge_if();
				}
				break;
			case 2:
				{
				setState(55);
				forge_while();
				}
				break;
			case 3:
				{
				setState(56);
				forge_enh();
				}
				break;
			case 4:
				{
				setState(57);
				forge_loop();
				}
				break;
			case 5:
				{
				setState(58);
				echo_forge();
				}
				break;
			case 6:
				{
				setState(59);
				forge_asrt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_asrtContext extends ParserRuleContext {
		public Forge_asrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_asrt; }
	 
		public Forge_asrtContext() { }
		public void copyFrom(Forge_asrtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PhraseAssignmentContext extends Forge_asrtContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode EQT() { return getToken(PhraseForgeParser.EQT, 0); }
		public TerminalNode PHRASE_STR() { return getToken(PhraseForgeParser.PHRASE_STR, 0); }
		public Asrt_ternContext asrt_tern() {
			return getRuleContext(Asrt_ternContext.class,0);
		}
		public PhraseAssignmentContext(Forge_asrtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterPhraseAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitPhraseAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitPhraseAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAssignmentContext extends Forge_asrtContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode EQT() { return getToken(PhraseForgeParser.EQT, 0); }
		public Asrt_boolContext asrt_bool() {
			return getRuleContext(Asrt_boolContext.class,0);
		}
		public Asrt_ternContext asrt_tern() {
			return getRuleContext(Asrt_ternContext.class,0);
		}
		public LogicAssignmentContext(Forge_asrtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterLogicAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitLogicAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitLogicAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuantAssignmentContext extends Forge_asrtContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode EQT() { return getToken(PhraseForgeParser.EQT, 0); }
		public Asrt_numContext asrt_num() {
			return getRuleContext(Asrt_numContext.class,0);
		}
		public Asrt_ternContext asrt_tern() {
			return getRuleContext(Asrt_ternContext.class,0);
		}
		public QuantAssignmentContext(Forge_asrtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterQuantAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitQuantAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitQuantAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_asrtContext forge_asrt() throws RecognitionException {
		Forge_asrtContext _localctx = new Forge_asrtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forge_asrt);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new QuantAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__4);
				setState(63);
				match(FORGE_VAR);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQT) {
					{
					setState(64);
					match(EQT);
					setState(65);
					asrt_num(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new QuantAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__4);
				setState(69);
				match(FORGE_VAR);
				setState(70);
				match(EQT);
				setState(71);
				asrt_tern();
				}
				break;
			case 3:
				_localctx = new LogicAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__5);
				setState(73);
				match(FORGE_VAR);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQT) {
					{
					setState(74);
					match(EQT);
					setState(75);
					asrt_bool(0);
					}
				}

				}
				break;
			case 4:
				_localctx = new LogicAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(T__5);
				setState(79);
				match(FORGE_VAR);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQT) {
					{
					setState(80);
					match(EQT);
					setState(81);
					asrt_tern();
					}
				}

				}
				break;
			case 5:
				_localctx = new PhraseAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(T__6);
				setState(85);
				match(FORGE_VAR);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQT) {
					{
					setState(86);
					match(EQT);
					setState(87);
					match(PHRASE_STR);
					}
				}

				}
				break;
			case 6:
				_localctx = new PhraseAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				match(T__6);
				setState(91);
				match(FORGE_VAR);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQT) {
					{
					setState(92);
					match(EQT);
					setState(93);
					asrt_tern();
					}
				}

				}
				break;
			case 7:
				_localctx = new QuantAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				match(FORGE_VAR);
				setState(97);
				match(EQT);
				setState(98);
				asrt_num(0);
				}
				break;
			case 8:
				_localctx = new LogicAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				match(FORGE_VAR);
				setState(100);
				match(EQT);
				setState(101);
				asrt_bool(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsrtsContext extends ParserRuleContext {
		public Asrt_numContext asrt_num() {
			return getRuleContext(Asrt_numContext.class,0);
		}
		public Asrt_boolContext asrt_bool() {
			return getRuleContext(Asrt_boolContext.class,0);
		}
		public AsrtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterAsrts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitAsrts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitAsrts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsrtsContext asrts() throws RecognitionException {
		AsrtsContext _localctx = new AsrtsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asrts);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				asrt_num(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				asrt_bool(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Asrt_boolContext extends ParserRuleContext {
		public Asrt_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt_bool; }
	 
		public Asrt_boolContext() { }
		public void copyFrom(Asrt_boolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpressionInBracketsContext extends Asrt_boolContext {
		public Asrt_boolContext asrt_bool() {
			return getRuleContext(Asrt_boolContext.class,0);
		}
		public LogicExpressionInBracketsContext(Asrt_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterLogicExpressionInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitLogicExpressionInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitLogicExpressionInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicLogicalExpressionContext extends Asrt_boolContext {
		public Token op;
		public List<Asrt_boolContext> asrt_bool() {
			return getRuleContexts(Asrt_boolContext.class);
		}
		public Asrt_boolContext asrt_bool(int i) {
			return getRuleContext(Asrt_boolContext.class,i);
		}
		public TerminalNode Logical_AND() { return getToken(PhraseForgeParser.Logical_AND, 0); }
		public TerminalNode Logical_OR() { return getToken(PhraseForgeParser.Logical_OR, 0); }
		public TerminalNode EqualTo() { return getToken(PhraseForgeParser.EqualTo, 0); }
		public TerminalNode NotEqualTo() { return getToken(PhraseForgeParser.NotEqualTo, 0); }
		public LogicLogicalExpressionContext(Asrt_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterLogicLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitLogicLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitLogicLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicValContext extends Asrt_boolContext {
		public TerminalNode PHRASE_BOOL() { return getToken(PhraseForgeParser.PHRASE_BOOL, 0); }
		public LogicValContext(Asrt_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterLogicVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitLogicVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitLogicVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicComparisonExpressionContext extends Asrt_boolContext {
		public Asrt_cmpContext asrt_cmp() {
			return getRuleContext(Asrt_cmpContext.class,0);
		}
		public LogicComparisonExpressionContext(Asrt_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterLogicComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitLogicComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitLogicComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicNotContext extends Asrt_boolContext {
		public Token op;
		public Asrt_boolContext asrt_bool(int i) {
			return getRuleContext(Asrt_boolContext.class,0);
		}
		public TerminalNode Logical_NOT() { return getToken(PhraseForgeParser.Logical_NOT, 0); }
		public LogicNotContext(Asrt_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterLogicNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitLogicNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitLogicNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicVarExpressionContext extends Asrt_boolContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public LogicVarExpressionContext(Asrt_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterLogicVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitLogicVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitLogicVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asrt_boolContext asrt_bool() throws RecognitionException {
		return asrt_bool(0);
	}

	private Asrt_boolContext asrt_bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Asrt_boolContext _localctx = new Asrt_boolContext(_ctx, _parentState);
		Asrt_boolContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_asrt_bool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				((LogicNotContext)_localctx).op = match(Logical_NOT);
				setState(110);
				asrt_bool(5);
				}
				break;
			case 2:
				{
				_localctx = new LogicComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				asrt_cmp();
				}
				break;
			case 3:
				{
				_localctx = new LogicExpressionInBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(T__7);
				setState(113);
				asrt_bool(0);
				setState(114);
				match(T__8);
				}
				break;
			case 4:
				{
				_localctx = new LogicValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(PHRASE_BOOL);
				}
				break;
			case 5:
				{
				_localctx = new LogicVarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(FORGE_VAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicLogicalExpressionContext(new Asrt_boolContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_asrt_bool);
					setState(120);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(121);
					((LogicLogicalExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 26594437496832L) != 0)) ) {
						((LogicLogicalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(122);
					asrt_bool(7);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Asrt_cmpContext extends ParserRuleContext {
		public Asrt_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt_cmp; }
	 
		public Asrt_cmpContext() { }
		public void copyFrom(Asrt_cmpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuantComparisonExpressionContext extends Asrt_cmpContext {
		public Token op;
		public List<Asrt_numContext> asrt_num() {
			return getRuleContexts(Asrt_numContext.class);
		}
		public Asrt_numContext asrt_num(int i) {
			return getRuleContext(Asrt_numContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(PhraseForgeParser.GreaterThan, 0); }
		public TerminalNode LesserThan() { return getToken(PhraseForgeParser.LesserThan, 0); }
		public TerminalNode GreaterThanOrEqualTo() { return getToken(PhraseForgeParser.GreaterThanOrEqualTo, 0); }
		public TerminalNode LesserThanOrEqualTo() { return getToken(PhraseForgeParser.LesserThanOrEqualTo, 0); }
		public TerminalNode EqualTo() { return getToken(PhraseForgeParser.EqualTo, 0); }
		public TerminalNode NotEqualTo() { return getToken(PhraseForgeParser.NotEqualTo, 0); }
		public QuantComparisonExpressionContext(Asrt_cmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterQuantComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitQuantComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitQuantComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asrt_cmpContext asrt_cmp() throws RecognitionException {
		Asrt_cmpContext _localctx = new Asrt_cmpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asrt_cmp);
		int _la;
		try {
			_localctx = new QuantComparisonExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			asrt_num(0);
			setState(129);
			((QuantComparisonExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616274944L) != 0)) ) {
				((QuantComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			asrt_num(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Asrt_numContext extends ParserRuleContext {
		public Asrt_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt_num; }
	 
		public Asrt_numContext() { }
		public void copyFrom(Asrt_numContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuantMultiplyDivideExpressionContext extends Asrt_numContext {
		public Token op;
		public List<Asrt_numContext> asrt_num() {
			return getRuleContexts(Asrt_numContext.class);
		}
		public Asrt_numContext asrt_num(int i) {
			return getRuleContext(Asrt_numContext.class,i);
		}
		public TerminalNode Multiplication() { return getToken(PhraseForgeParser.Multiplication, 0); }
		public TerminalNode Division() { return getToken(PhraseForgeParser.Division, 0); }
		public QuantMultiplyDivideExpressionContext(Asrt_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterQuantMultiplyDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitQuantMultiplyDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitQuantMultiplyDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuantBracketsExpressionContext extends Asrt_numContext {
		public Asrt_numContext asrt_num() {
			return getRuleContext(Asrt_numContext.class,0);
		}
		public QuantBracketsExpressionContext(Asrt_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterQuantBracketsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitQuantBracketsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitQuantBracketsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuantOnlyContext extends Asrt_numContext {
		public TerminalNode PHRASE_NUM() { return getToken(PhraseForgeParser.PHRASE_NUM, 0); }
		public TerminalNode Subtraction() { return getToken(PhraseForgeParser.Subtraction, 0); }
		public QuantOnlyContext(Asrt_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterQuantOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitQuantOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitQuantOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuantIdentifierOnlyContext extends Asrt_numContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode Subtraction() { return getToken(PhraseForgeParser.Subtraction, 0); }
		public QuantIdentifierOnlyContext(Asrt_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterQuantIdentifierOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitQuantIdentifierOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitQuantIdentifierOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuantAdditionSubtractionExpressionContext extends Asrt_numContext {
		public Token op;
		public List<Asrt_numContext> asrt_num() {
			return getRuleContexts(Asrt_numContext.class);
		}
		public Asrt_numContext asrt_num(int i) {
			return getRuleContext(Asrt_numContext.class,i);
		}
		public TerminalNode Addition() { return getToken(PhraseForgeParser.Addition, 0); }
		public TerminalNode Subtraction() { return getToken(PhraseForgeParser.Subtraction, 0); }
		public QuantAdditionSubtractionExpressionContext(Asrt_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterQuantAdditionSubtractionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitQuantAdditionSubtractionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitQuantAdditionSubtractionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asrt_numContext asrt_num() throws RecognitionException {
		return asrt_num(0);
	}

	private Asrt_numContext asrt_num(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Asrt_numContext _localctx = new Asrt_numContext(_ctx, _parentState);
		Asrt_numContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_asrt_num, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new QuantBracketsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(133);
				match(T__7);
				setState(134);
				asrt_num(0);
				setState(135);
				match(T__8);
				}
				break;
			case 2:
				{
				_localctx = new QuantOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Subtraction) {
					{
					setState(137);
					match(Subtraction);
					}
				}

				setState(140);
				match(PHRASE_NUM);
				}
				break;
			case 3:
				{
				_localctx = new QuantIdentifierOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Subtraction) {
					{
					setState(141);
					match(Subtraction);
					}
				}

				setState(144);
				match(FORGE_VAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new QuantMultiplyDivideExpressionContext(new Asrt_numContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_asrt_num);
						setState(147);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(148);
						((QuantMultiplyDivideExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Multiplication || _la==Division) ) {
							((QuantMultiplyDivideExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						asrt_num(6);
						}
						break;
					case 2:
						{
						_localctx = new QuantAdditionSubtractionExpressionContext(new Asrt_numContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_asrt_num);
						setState(150);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(151);
						((QuantAdditionSubtractionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Addition || _la==Subtraction) ) {
							((QuantAdditionSubtractionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						asrt_num(5);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Asrt_evalContext extends ParserRuleContext {
		public Asrt_boolContext asrt_bool() {
			return getRuleContext(Asrt_boolContext.class,0);
		}
		public Asrt_evalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterAsrt_eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitAsrt_eval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitAsrt_eval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asrt_evalContext asrt_eval() throws RecognitionException {
		Asrt_evalContext _localctx = new Asrt_evalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asrt_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__7);
			setState(159);
			asrt_bool(0);
			setState(160);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_ifContext extends ParserRuleContext {
		public Asrt_evalContext asrt_eval() {
			return getRuleContext(Asrt_evalContext.class,0);
		}
		public Phrase_blkContext phrase_blk() {
			return getRuleContext(Phrase_blkContext.class,0);
		}
		public List<Else_forge_ifContext> else_forge_if() {
			return getRuleContexts(Else_forge_ifContext.class);
		}
		public Else_forge_ifContext else_forge_if(int i) {
			return getRuleContext(Else_forge_ifContext.class,i);
		}
		public Forge_elseContext forge_else() {
			return getRuleContext(Forge_elseContext.class,0);
		}
		public Forge_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_ifContext forge_if() throws RecognitionException {
		Forge_ifContext _localctx = new Forge_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forge_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__9);
			setState(163);
			asrt_eval();
			setState(164);
			phrase_blk();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(165);
				else_forge_if();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(171);
				forge_else();
				}
			}

			setState(174);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_forge_ifContext extends ParserRuleContext {
		public Asrt_evalContext asrt_eval() {
			return getRuleContext(Asrt_evalContext.class,0);
		}
		public Phrase_blkContext phrase_blk() {
			return getRuleContext(Phrase_blkContext.class,0);
		}
		public Else_forge_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_forge_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterElse_forge_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitElse_forge_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitElse_forge_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_forge_ifContext else_forge_if() throws RecognitionException {
		Else_forge_ifContext _localctx = new Else_forge_ifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_forge_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__11);
			setState(177);
			asrt_eval();
			setState(178);
			phrase_blk();
			setState(179);
			match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_elseContext extends ParserRuleContext {
		public Phrase_blkContext phrase_blk() {
			return getRuleContext(Phrase_blkContext.class,0);
		}
		public Forge_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_elseContext forge_else() throws RecognitionException {
		Forge_elseContext _localctx = new Forge_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forge_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__13);
			setState(182);
			phrase_blk();
			setState(183);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_whileContext extends ParserRuleContext {
		public Asrt_evalContext asrt_eval() {
			return getRuleContext(Asrt_evalContext.class,0);
		}
		public Phrase_blkContext phrase_blk() {
			return getRuleContext(Phrase_blkContext.class,0);
		}
		public Forge_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_whileContext forge_while() throws RecognitionException {
		Forge_whileContext _localctx = new Forge_whileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forge_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__15);
			setState(186);
			asrt_eval();
			setState(187);
			phrase_blk();
			setState(188);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Echo_forgeContext extends ParserRuleContext {
		public TerminalNode PHRASE_NUM() { return getToken(PhraseForgeParser.PHRASE_NUM, 0); }
		public TerminalNode PHRASE_BOOL() { return getToken(PhraseForgeParser.PHRASE_BOOL, 0); }
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public Asrt_numContext asrt_num() {
			return getRuleContext(Asrt_numContext.class,0);
		}
		public Asrt_boolContext asrt_bool() {
			return getRuleContext(Asrt_boolContext.class,0);
		}
		public List<TerminalNode> PHRASE_STR() { return getTokens(PhraseForgeParser.PHRASE_STR); }
		public TerminalNode PHRASE_STR(int i) {
			return getToken(PhraseForgeParser.PHRASE_STR, i);
		}
		public Echo_forgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo_forge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterEcho_forge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitEcho_forge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitEcho_forge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Echo_forgeContext echo_forge() throws RecognitionException {
		Echo_forgeContext _localctx = new Echo_forgeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_echo_forge);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__17);
				setState(191);
				match(T__7);
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(192);
					match(PHRASE_NUM);
					}
					break;
				case 2:
					{
					setState(193);
					match(PHRASE_BOOL);
					}
					break;
				case 3:
					{
					setState(194);
					match(FORGE_VAR);
					}
					break;
				case 4:
					{
					setState(195);
					asrt_num(0);
					}
					break;
				case 5:
					{
					setState(196);
					asrt_bool(0);
					}
					break;
				case 6:
					{
					setState(197);
					match(PHRASE_STR);
					}
					break;
				}
				setState(200);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__17);
				setState(202);
				match(T__7);
				setState(203);
				match(PHRASE_STR);
				setState(204);
				match(T__18);
				setState(205);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 105556337491968L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				match(T__8);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_enhContext extends ParserRuleContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public List<ForgeRangeContext> forgeRange() {
			return getRuleContexts(ForgeRangeContext.class);
		}
		public ForgeRangeContext forgeRange(int i) {
			return getRuleContext(ForgeRangeContext.class,i);
		}
		public Phrase_blkContext phrase_blk() {
			return getRuleContext(Phrase_blkContext.class,0);
		}
		public Forge_enhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_enh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_enh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_enh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_enh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_enhContext forge_enh() throws RecognitionException {
		Forge_enhContext _localctx = new Forge_enhContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forge_enh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__19);
			setState(210);
			match(FORGE_VAR);
			setState(211);
			match(T__20);
			setState(212);
			match(T__21);
			setState(213);
			match(T__22);
			setState(214);
			match(T__7);
			setState(215);
			forgeRange();
			setState(216);
			match(T__23);
			setState(217);
			forgeRange();
			setState(218);
			match(T__8);
			setState(219);
			phrase_blk();
			setState(220);
			match(T__24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForgeRangeContext extends ParserRuleContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode PHRASE_NUM() { return getToken(PhraseForgeParser.PHRASE_NUM, 0); }
		public ForgeRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forgeRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForgeRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForgeRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForgeRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForgeRangeContext forgeRange() throws RecognitionException {
		ForgeRangeContext _localctx = new ForgeRangeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forgeRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==PHRASE_NUM || _la==FORGE_VAR) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_loopContext extends ParserRuleContext {
		public Forge_asrtContext forge_asrt() {
			return getRuleContext(Forge_asrtContext.class,0);
		}
		public Asrt_boolContext asrt_bool() {
			return getRuleContext(Asrt_boolContext.class,0);
		}
		public Forge_varContext forge_var() {
			return getRuleContext(Forge_varContext.class,0);
		}
		public Phrase_blkContext phrase_blk() {
			return getRuleContext(Phrase_blkContext.class,0);
		}
		public Forge_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_loopContext forge_loop() throws RecognitionException {
		Forge_loopContext _localctx = new Forge_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forge_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__19);
			setState(225);
			match(T__7);
			setState(226);
			forge_asrt();
			setState(227);
			match(T__23);
			setState(228);
			asrt_bool(0);
			setState(229);
			match(T__23);
			setState(230);
			forge_var();
			setState(231);
			match(T__8);
			setState(232);
			phrase_blk();
			setState(233);
			match(T__24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Forge_varContext extends ParserRuleContext {
		public Inc_asrtContext inc_asrt() {
			return getRuleContext(Inc_asrtContext.class,0);
		}
		public Dec_asrtContext dec_asrt() {
			return getRuleContext(Dec_asrtContext.class,0);
		}
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode EQT() { return getToken(PhraseForgeParser.EQT, 0); }
		public Asrt_numContext asrt_num() {
			return getRuleContext(Asrt_numContext.class,0);
		}
		public Forge_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forge_varContext forge_var() throws RecognitionException {
		Forge_varContext _localctx = new Forge_varContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forge_var);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				inc_asrt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				dec_asrt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(FORGE_VAR);
				setState(238);
				match(EQT);
				setState(239);
				asrt_num(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_asrtContext extends ParserRuleContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public Dec_asrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_asrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterDec_asrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitDec_asrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitDec_asrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_asrtContext dec_asrt() throws RecognitionException {
		Dec_asrtContext _localctx = new Dec_asrtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dec_asrt);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORGE_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(FORGE_VAR);
				setState(243);
				match(T__25);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__25);
				setState(245);
				match(FORGE_VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Inc_asrtContext extends ParserRuleContext {
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public Inc_asrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_asrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterInc_asrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitInc_asrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitInc_asrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_asrtContext inc_asrt() throws RecognitionException {
		Inc_asrtContext _localctx = new Inc_asrtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inc_asrt);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORGE_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(FORGE_VAR);
				setState(249);
				match(T__26);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__26);
				setState(251);
				match(FORGE_VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Asrt_ternContext extends ParserRuleContext {
		public Asrt_evalContext asrt_eval() {
			return getRuleContext(Asrt_evalContext.class,0);
		}
		public List<AsrtsContext> asrts() {
			return getRuleContexts(AsrtsContext.class);
		}
		public AsrtsContext asrts(int i) {
			return getRuleContext(AsrtsContext.class,i);
		}
		public List<TerminalNode> PHRASE_BOOL() { return getTokens(PhraseForgeParser.PHRASE_BOOL); }
		public TerminalNode PHRASE_BOOL(int i) {
			return getToken(PhraseForgeParser.PHRASE_BOOL, i);
		}
		public List<TerminalNode> PHRASE_STR() { return getTokens(PhraseForgeParser.PHRASE_STR); }
		public TerminalNode PHRASE_STR(int i) {
			return getToken(PhraseForgeParser.PHRASE_STR, i);
		}
		public Asrt_ternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt_tern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterAsrt_tern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitAsrt_tern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitAsrt_tern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asrt_ternContext asrt_tern() throws RecognitionException {
		Asrt_ternContext _localctx = new Asrt_ternContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asrt_tern);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				asrt_eval();
				setState(255);
				match(T__27);
				setState(256);
				asrts();
				setState(257);
				match(T__28);
				setState(258);
				asrts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				asrt_eval();
				setState(261);
				match(T__27);
				setState(262);
				match(PHRASE_BOOL);
				setState(263);
				match(T__28);
				setState(264);
				match(PHRASE_BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				asrt_eval();
				setState(267);
				match(T__27);
				setState(268);
				match(PHRASE_STR);
				setState(269);
				match(T__28);
				setState(270);
				match(PHRASE_STR);
				}
				break;
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
		case 5:
			return asrt_bool_sempred((Asrt_boolContext)_localctx, predIndex);
		case 7:
			return asrt_num_sempred((Asrt_numContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean asrt_bool_sempred(Asrt_boolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean asrt_num_sempred(Asrt_numContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u00011\b\u0001"+
		"\u000b\u0001\f\u00012\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003S\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003_\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003g\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004k\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005w\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008b\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u008f\b\u0007\u0001\u0007\u0003\u0007\u0092"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u009a\b\u0007\n\u0007\f\u0007\u009d\t\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a7"+
		"\b\t\n\t\f\t\u00aa\t\t\u0001\t\u0003\t\u00ad\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c7\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d0\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00f1\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00f7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00fd\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0111\b\u0014\u0001\u0014\u0000\u0002"+
		"\n\u000e\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(\u0000\u0006\u0002\u0000$%+,\u0001\u0000"+
		"\',\u0001\u0000\"#\u0001\u0000 !\u0002\u0000\u001e\u001f-.\u0002\u0000"+
		"\u001e\u001e--\u0129\u0000*\u0001\u0000\u0000\u0000\u0002.\u0001\u0000"+
		"\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006f\u0001\u0000\u0000\u0000"+
		"\bj\u0001\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000"+
		"\u0000\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u009e\u0001\u0000"+
		"\u0000\u0000\u0012\u00a2\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000"+
		"\u0000\u0000\u0016\u00b5\u0001\u0000\u0000\u0000\u0018\u00b9\u0001\u0000"+
		"\u0000\u0000\u001a\u00cf\u0001\u0000\u0000\u0000\u001c\u00d1\u0001\u0000"+
		"\u0000\u0000\u001e\u00de\u0001\u0000\u0000\u0000 \u00e0\u0001\u0000\u0000"+
		"\u0000\"\u00f0\u0001\u0000\u0000\u0000$\u00f6\u0001\u0000\u0000\u0000"+
		"&\u00fc\u0001\u0000\u0000\u0000(\u0110\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0001\u0000\u0000+,\u0003\u0002\u0001\u0000,-\u0005\u0002\u0000\u0000"+
		"-\u0001\u0001\u0000\u0000\u0000.0\u0005\u0003\u0000\u0000/1\u0003\u0004"+
		"\u0002\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0005\u0004\u0000\u00005\u0003\u0001\u0000\u0000\u00006=\u0003\u0012"+
		"\t\u00007=\u0003\u0018\f\u00008=\u0003\u001c\u000e\u00009=\u0003 \u0010"+
		"\u0000:=\u0003\u001a\r\u0000;=\u0003\u0006\u0003\u0000<6\u0001\u0000\u0000"+
		"\u0000<7\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0005"+
		"\u0001\u0000\u0000\u0000>?\u0005\u0005\u0000\u0000?B\u0005-\u0000\u0000"+
		"@A\u0005/\u0000\u0000AC\u0003\u000e\u0007\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000Cg\u0001\u0000\u0000\u0000DE\u0005\u0005\u0000"+
		"\u0000EF\u0005-\u0000\u0000FG\u0005/\u0000\u0000Gg\u0003(\u0014\u0000"+
		"HI\u0005\u0006\u0000\u0000IL\u0005-\u0000\u0000JK\u0005/\u0000\u0000K"+
		"M\u0003\n\u0005\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"Mg\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000\u0000OR\u0005-\u0000\u0000"+
		"PQ\u0005/\u0000\u0000QS\u0003(\u0014\u0000RP\u0001\u0000\u0000\u0000R"+
		"S\u0001\u0000\u0000\u0000Sg\u0001\u0000\u0000\u0000TU\u0005\u0007\u0000"+
		"\u0000UX\u0005-\u0000\u0000VW\u0005/\u0000\u0000WY\u0005.\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Yg\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0007\u0000\u0000[^\u0005-\u0000\u0000\\]\u0005/\u0000"+
		"\u0000]_\u0003(\u0014\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_g\u0001\u0000\u0000\u0000`a\u0005-\u0000\u0000ab\u0005/\u0000\u0000"+
		"bg\u0003\u000e\u0007\u0000cd\u0005-\u0000\u0000de\u0005/\u0000\u0000e"+
		"g\u0003\n\u0005\u0000f>\u0001\u0000\u0000\u0000fD\u0001\u0000\u0000\u0000"+
		"fH\u0001\u0000\u0000\u0000fN\u0001\u0000\u0000\u0000fT\u0001\u0000\u0000"+
		"\u0000fZ\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000g\u0007\u0001\u0000\u0000\u0000hk\u0003\u000e\u0007\u0000"+
		"ik\u0003\n\u0005\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"k\t\u0001\u0000\u0000\u0000lm\u0006\u0005\uffff\uffff\u0000mn\u0005&\u0000"+
		"\u0000nw\u0003\n\u0005\u0005ow\u0003\f\u0006\u0000pq\u0005\b\u0000\u0000"+
		"qr\u0003\n\u0005\u0000rs\u0005\t\u0000\u0000sw\u0001\u0000\u0000\u0000"+
		"tw\u0005\u001f\u0000\u0000uw\u0005-\u0000\u0000vl\u0001\u0000\u0000\u0000"+
		"vo\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000w}\u0001\u0000\u0000\u0000xy\n\u0006\u0000"+
		"\u0000yz\u0007\u0000\u0000\u0000z|\u0003\n\u0005\u0007{x\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u000b\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0003\u000e\u0007\u0000\u0081\u0082\u0007\u0001\u0000"+
		"\u0000\u0082\u0083\u0003\u000e\u0007\u0000\u0083\r\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0006\u0007\uffff\uffff\u0000\u0085\u0086\u0005\b\u0000\u0000"+
		"\u0086\u0087\u0003\u000e\u0007\u0000\u0087\u0088\u0005\t\u0000\u0000\u0088"+
		"\u0092\u0001\u0000\u0000\u0000\u0089\u008b\u0005!\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u0092\u0005\u001e\u0000\u0000\u008d\u008f"+
		"\u0005!\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0005"+
		"-\u0000\u0000\u0091\u0084\u0001\u0000\u0000\u0000\u0091\u008a\u0001\u0000"+
		"\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0092\u009b\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\n\u0005\u0000\u0000\u0094\u0095\u0007\u0002\u0000"+
		"\u0000\u0095\u009a\u0003\u000e\u0007\u0006\u0096\u0097\n\u0004\u0000\u0000"+
		"\u0097\u0098\u0007\u0003\u0000\u0000\u0098\u009a\u0003\u000e\u0007\u0005"+
		"\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000"+
		"\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u000f\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\b\u0000\u0000\u009f"+
		"\u00a0\u0003\n\u0005\u0000\u00a0\u00a1\u0005\t\u0000\u0000\u00a1\u0011"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\n\u0000\u0000\u00a3\u00a4\u0003"+
		"\u0010\b\u0000\u00a4\u00a8\u0003\u0002\u0001\u0000\u00a5\u00a7\u0003\u0014"+
		"\n\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0003\u0016\u000b\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005\u000b\u0000\u0000\u00af\u0013\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005\f\u0000\u0000\u00b1\u00b2\u0003\u0010\b\u0000"+
		"\u00b2\u00b3\u0003\u0002\u0001\u0000\u00b3\u00b4\u0005\r\u0000\u0000\u00b4"+
		"\u0015\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000e\u0000\u0000\u00b6"+
		"\u00b7\u0003\u0002\u0001\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8"+
		"\u0017\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0010\u0000\u0000\u00ba"+
		"\u00bb\u0003\u0010\b\u0000\u00bb\u00bc\u0003\u0002\u0001\u0000\u00bc\u00bd"+
		"\u0005\u0011\u0000\u0000\u00bd\u0019\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\u0012\u0000\u0000\u00bf\u00c6\u0005\b\u0000\u0000\u00c0\u00c7\u0005"+
		"\u001e\u0000\u0000\u00c1\u00c7\u0005\u001f\u0000\u0000\u00c2\u00c7\u0005"+
		"-\u0000\u0000\u00c3\u00c7\u0003\u000e\u0007\u0000\u00c4\u00c7\u0003\n"+
		"\u0005\u0000\u00c5\u00c7\u0005.\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00d0\u0005\t\u0000\u0000\u00c9\u00ca\u0005\u0012\u0000\u0000"+
		"\u00ca\u00cb\u0005\b\u0000\u0000\u00cb\u00cc\u0005.\u0000\u0000\u00cc"+
		"\u00cd\u0005\u0013\u0000\u0000\u00cd\u00ce\u0007\u0004\u0000\u0000\u00ce"+
		"\u00d0\u0005\t\u0000\u0000\u00cf\u00be\u0001\u0000\u0000\u0000\u00cf\u00c9"+
		"\u0001\u0000\u0000\u0000\u00d0\u001b\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0014\u0000\u0000\u00d2\u00d3\u0005-\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0015\u0000\u0000\u00d4\u00d5\u0005\u0016\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0017\u0000\u0000\u00d6\u00d7\u0005\b\u0000\u0000\u00d7\u00d8\u0003\u001e"+
		"\u000f\u0000\u00d8\u00d9\u0005\u0018\u0000\u0000\u00d9\u00da\u0003\u001e"+
		"\u000f\u0000\u00da\u00db\u0005\t\u0000\u0000\u00db\u00dc\u0003\u0002\u0001"+
		"\u0000\u00dc\u00dd\u0005\u0019\u0000\u0000\u00dd\u001d\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0007\u0005\u0000\u0000\u00df\u001f\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0014\u0000\u0000\u00e1\u00e2\u0005\b\u0000\u0000"+
		"\u00e2\u00e3\u0003\u0006\u0003\u0000\u00e3\u00e4\u0005\u0018\u0000\u0000"+
		"\u00e4\u00e5\u0003\n\u0005\u0000\u00e5\u00e6\u0005\u0018\u0000\u0000\u00e6"+
		"\u00e7\u0003\"\u0011\u0000\u00e7\u00e8\u0005\t\u0000\u0000\u00e8\u00e9"+
		"\u0003\u0002\u0001\u0000\u00e9\u00ea\u0005\u0019\u0000\u0000\u00ea!\u0001"+
		"\u0000\u0000\u0000\u00eb\u00f1\u0003&\u0013\u0000\u00ec\u00f1\u0003$\u0012"+
		"\u0000\u00ed\u00ee\u0005-\u0000\u0000\u00ee\u00ef\u0005/\u0000\u0000\u00ef"+
		"\u00f1\u0003\u000e\u0007\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f1"+
		"#\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005-\u0000\u0000\u00f3\u00f7\u0005"+
		"\u001a\u0000\u0000\u00f4\u00f5\u0005\u001a\u0000\u0000\u00f5\u00f7\u0005"+
		"-\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f7%\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005-\u0000\u0000"+
		"\u00f9\u00fd\u0005\u001b\u0000\u0000\u00fa\u00fb\u0005\u001b\u0000\u0000"+
		"\u00fb\u00fd\u0005-\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\'\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0003\u0010\b\u0000\u00ff\u0100\u0005\u001c\u0000\u0000\u0100\u0101\u0003"+
		"\b\u0004\u0000\u0101\u0102\u0005\u001d\u0000\u0000\u0102\u0103\u0003\b"+
		"\u0004\u0000\u0103\u0111\u0001\u0000\u0000\u0000\u0104\u0105\u0003\u0010"+
		"\b\u0000\u0105\u0106\u0005\u001c\u0000\u0000\u0106\u0107\u0005\u001f\u0000"+
		"\u0000\u0107\u0108\u0005\u001d\u0000\u0000\u0108\u0109\u0005\u001f\u0000"+
		"\u0000\u0109\u0111\u0001\u0000\u0000\u0000\u010a\u010b\u0003\u0010\b\u0000"+
		"\u010b\u010c\u0005\u001c\u0000\u0000\u010c\u010d\u0005.\u0000\u0000\u010d"+
		"\u010e\u0005\u001d\u0000\u0000\u010e\u010f\u0005.\u0000\u0000\u010f\u0111"+
		"\u0001\u0000\u0000\u0000\u0110\u00fe\u0001\u0000\u0000\u0000\u0110\u0104"+
		"\u0001\u0000\u0000\u0000\u0110\u010a\u0001\u0000\u0000\u0000\u0111)\u0001"+
		"\u0000\u0000\u0000\u00182<BLRX^fjv}\u008a\u008e\u0091\u0099\u009b\u00a8"+
		"\u00ac\u00c6\u00cf\u00f0\u00f6\u00fc\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}