package gen;// Generated from C:/Users/dsanghv3/IdeaProjects/SER502-Spring2023-Team13/src/main/Antlr\PhraseForge.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		Logical_OR=37, LesserThan=38, GreaterThan=39, LesserThanOrEqualTo=40, 
		GreaterThanOrEqualTo=41, NotEqualTo=42, EqualTo=43, FORGE_VAR=44, PHRASE_STR=45, 
		EQT=46, FORGE_SPACES=47, FORGE_COMMENT=48;
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
			"'$<'", "'$>'", "'$<='", "'$>='", "'$!='", "'$=='", null, null, "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PHRASE_NUM", "PHRASE_BOOL", "Addition", 
			"Subtraction", "Multiplication", "Division", "Logical_AND", "Logical_OR", 
			"LesserThan", "GreaterThan", "LesserThanOrEqualTo", "GreaterThanOrEqualTo", 
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17592187421920L) != 0) );
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
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode EQT() { return getToken(PhraseForgeParser.EQT, 0); }
		public Asrt_numContext asrt_num() {
			return getRuleContext(Asrt_numContext.class,0);
		}
		public Asrt_ternContext asrt_tern() {
			return getRuleContext(Asrt_ternContext.class,0);
		}
		public Asrt_boolContext asrt_bool() {
			return getRuleContext(Asrt_boolContext.class,0);
		}
		public TerminalNode PHRASE_STR() { return getToken(PhraseForgeParser.PHRASE_STR, 0); }
		public Forge_asrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forge_asrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterForge_asrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitForge_asrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitForge_asrt(this);
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
					match(PHRASE_STR);
					}
				}

				}
				break;
			case 7:
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
		public Token op;
		public Asrt_cmpContext asrt_cmp() {
			return getRuleContext(Asrt_cmpContext.class,0);
		}
		public List<Asrt_boolContext> asrt_bool() {
			return getRuleContexts(Asrt_boolContext.class);
		}
		public Asrt_boolContext asrt_bool(int i) {
			return getRuleContext(Asrt_boolContext.class,i);
		}
		public TerminalNode PHRASE_BOOL() { return getToken(PhraseForgeParser.PHRASE_BOOL, 0); }
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode Logical_AND() { return getToken(PhraseForgeParser.Logical_AND, 0); }
		public TerminalNode Logical_OR() { return getToken(PhraseForgeParser.Logical_OR, 0); }
		public TerminalNode EqualTo() { return getToken(PhraseForgeParser.EqualTo, 0); }
		public TerminalNode NotEqualTo() { return getToken(PhraseForgeParser.NotEqualTo, 0); }
		public Asrt_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterAsrt_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitAsrt_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitAsrt_bool(this);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(109);
				asrt_cmp();
				}
				break;
			case 2:
				{
				setState(110);
				match(T__7);
				setState(111);
				asrt_bool(0);
				setState(112);
				match(T__8);
				}
				break;
			case 3:
				{
				setState(114);
				match(PHRASE_BOOL);
				}
				break;
			case 4:
				{
				setState(115);
				match(FORGE_VAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Asrt_boolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_asrt_bool);
						setState(118);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(119);
						((Asrt_boolContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Logical_AND || _la==Logical_OR) ) {
							((Asrt_boolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						asrt_bool(7);
						}
						break;
					case 2:
						{
						_localctx = new Asrt_boolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_asrt_bool);
						setState(121);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(122);
						((Asrt_boolContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NotEqualTo || _la==EqualTo) ) {
							((Asrt_boolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(123);
						asrt_bool(6);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public Asrt_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterAsrt_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitAsrt_cmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitAsrt_cmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asrt_cmpContext asrt_cmp() throws RecognitionException {
		Asrt_cmpContext _localctx = new Asrt_cmpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asrt_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			asrt_num(0);
			setState(130);
			((Asrt_cmpContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) ) {
				((Asrt_cmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
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
		public Token op;
		public List<Asrt_numContext> asrt_num() {
			return getRuleContexts(Asrt_numContext.class);
		}
		public Asrt_numContext asrt_num(int i) {
			return getRuleContext(Asrt_numContext.class,i);
		}
		public TerminalNode PHRASE_NUM() { return getToken(PhraseForgeParser.PHRASE_NUM, 0); }
		public TerminalNode Subtraction() { return getToken(PhraseForgeParser.Subtraction, 0); }
		public TerminalNode FORGE_VAR() { return getToken(PhraseForgeParser.FORGE_VAR, 0); }
		public TerminalNode Multiplication() { return getToken(PhraseForgeParser.Multiplication, 0); }
		public TerminalNode Division() { return getToken(PhraseForgeParser.Division, 0); }
		public TerminalNode Addition() { return getToken(PhraseForgeParser.Addition, 0); }
		public Asrt_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).enterAsrt_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhraseForgeListener ) ((PhraseForgeListener)listener).exitAsrt_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhraseForgeVisitor ) return ((PhraseForgeVisitor<? extends T>)visitor).visitAsrt_num(this);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(134);
				match(T__7);
				setState(135);
				asrt_num(0);
				setState(136);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Subtraction) {
					{
					setState(138);
					match(Subtraction);
					}
				}

				setState(141);
				match(PHRASE_NUM);
				}
				break;
			case 3:
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Subtraction) {
					{
					setState(142);
					match(Subtraction);
					}
				}

				setState(145);
				match(FORGE_VAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Asrt_numContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_asrt_num);
						setState(148);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(149);
						((Asrt_numContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Multiplication || _la==Division) ) {
							((Asrt_numContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						asrt_num(6);
						}
						break;
					case 2:
						{
						_localctx = new Asrt_numContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_asrt_num);
						setState(151);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(152);
						((Asrt_numContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Addition || _la==Subtraction) ) {
							((Asrt_numContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(153);
						asrt_num(5);
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(159);
			match(T__7);
			setState(160);
			asrt_bool(0);
			setState(161);
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
			setState(163);
			match(T__9);
			setState(164);
			asrt_eval();
			setState(165);
			phrase_blk();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(166);
				else_forge_if();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(172);
				forge_else();
				}
			}

			setState(175);
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
			setState(177);
			match(T__11);
			setState(178);
			asrt_eval();
			setState(179);
			phrase_blk();
			setState(180);
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
			setState(182);
			match(T__13);
			setState(183);
			phrase_blk();
			setState(184);
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
			setState(186);
			match(T__15);
			setState(187);
			asrt_eval();
			setState(188);
			phrase_blk();
			setState(189);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__17);
				setState(192);
				match(T__7);
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(193);
					match(PHRASE_NUM);
					}
					break;
				case 2:
					{
					setState(194);
					match(PHRASE_BOOL);
					}
					break;
				case 3:
					{
					setState(195);
					match(FORGE_VAR);
					}
					break;
				case 4:
					{
					setState(196);
					asrt_num(0);
					}
					break;
				case 5:
					{
					setState(197);
					asrt_bool(0);
					}
					break;
				case 6:
					{
					setState(198);
					match(PHRASE_STR);
					}
					break;
				}
				setState(201);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__17);
				setState(203);
				match(T__7);
				setState(204);
				match(PHRASE_STR);
				setState(205);
				match(T__18);
				setState(206);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 52779779358720L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
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
			setState(210);
			match(T__19);
			setState(211);
			match(FORGE_VAR);
			setState(212);
			match(T__20);
			setState(213);
			match(T__21);
			setState(214);
			match(T__22);
			setState(215);
			match(T__7);
			setState(216);
			forgeRange();
			setState(217);
			match(T__23);
			setState(218);
			forgeRange();
			setState(219);
			match(T__8);
			setState(220);
			phrase_blk();
			setState(221);
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
			setState(223);
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
			setState(225);
			match(T__19);
			setState(226);
			match(T__7);
			setState(227);
			forge_asrt();
			setState(228);
			match(T__23);
			setState(229);
			asrt_bool(0);
			setState(230);
			match(T__23);
			setState(231);
			forge_var();
			setState(232);
			match(T__8);
			setState(233);
			phrase_blk();
			setState(234);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				inc_asrt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				dec_asrt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(FORGE_VAR);
				setState(239);
				match(EQT);
				setState(240);
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORGE_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(FORGE_VAR);
				setState(244);
				match(T__25);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__25);
				setState(246);
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
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORGE_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(FORGE_VAR);
				setState(250);
				match(T__26);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__26);
				setState(252);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				asrt_eval();
				setState(256);
				match(T__27);
				setState(257);
				asrts();
				setState(258);
				match(T__28);
				setState(259);
				asrts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				asrt_eval();
				setState(262);
				match(T__27);
				setState(263);
				match(PHRASE_BOOL);
				setState(264);
				match(T__28);
				setState(265);
				match(PHRASE_BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				asrt_eval();
				setState(268);
				match(T__27);
				setState(269);
				match(PHRASE_STR);
				setState(270);
				match(T__28);
				setState(271);
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
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean asrt_num_sempred(Asrt_numContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u0114\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0003\u0005u\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005\u0080\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0090\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0093\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u009b\b\u0007\n\u0007\f\u0007\u009e"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab\t\t\u0001\t\u0003\t\u00ae\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c8"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d1"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00f2\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00f8\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00fe\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0112\b\u0014\u0001"+
		"\u0014\u0000\u0002\n\u000e\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0007\u0001\u0000"+
		"$%\u0001\u0000*+\u0001\u0000&+\u0001\u0000\"#\u0001\u0000 !\u0002\u0000"+
		"\u001e\u001f,-\u0002\u0000\u001e\u001e,,\u012a\u0000*\u0001\u0000\u0000"+
		"\u0000\u0002.\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006"+
		"f\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000"+
		"\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000"+
		"\u0010\u009f\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000"+
		"\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000\u0000\u0000"+
		"\u0018\u00ba\u0001\u0000\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000"+
		"\u001c\u00d2\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000\u0000\u0000"+
		" \u00e1\u0001\u0000\u0000\u0000\"\u00f1\u0001\u0000\u0000\u0000$\u00f7"+
		"\u0001\u0000\u0000\u0000&\u00fd\u0001\u0000\u0000\u0000(\u0111\u0001\u0000"+
		"\u0000\u0000*+\u0005\u0001\u0000\u0000+,\u0003\u0002\u0001\u0000,-\u0005"+
		"\u0002\u0000\u0000-\u0001\u0001\u0000\u0000\u0000.0\u0005\u0003\u0000"+
		"\u0000/1\u0003\u0004\u0002\u00000/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000045\u0005\u0004\u0000\u00005\u0003\u0001\u0000\u0000"+
		"\u00006=\u0003\u0012\t\u00007=\u0003\u0018\f\u00008=\u0003\u001c\u000e"+
		"\u00009=\u0003 \u0010\u0000:=\u0003\u001a\r\u0000;=\u0003\u0006\u0003"+
		"\u0000<6\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000<8\u0001\u0000"+
		"\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005\u0005\u0000"+
		"\u0000?B\u0005,\u0000\u0000@A\u0005.\u0000\u0000AC\u0003\u000e\u0007\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000Cg\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0005\u0000\u0000EF\u0005,\u0000\u0000FG\u0005.\u0000\u0000"+
		"Gg\u0003(\u0014\u0000HI\u0005\u0006\u0000\u0000IL\u0005,\u0000\u0000J"+
		"K\u0005.\u0000\u0000KM\u0003\n\u0005\u0000LJ\u0001\u0000\u0000\u0000L"+
		"M\u0001\u0000\u0000\u0000Mg\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000"+
		"\u0000OR\u0005,\u0000\u0000PQ\u0005.\u0000\u0000QS\u0003(\u0014\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000Sg\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0007\u0000\u0000UX\u0005,\u0000\u0000VW\u0005.\u0000\u0000"+
		"WY\u0005-\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Yg\u0001\u0000\u0000\u0000Z[\u0005\u0007\u0000\u0000[^\u0005,\u0000\u0000"+
		"\\]\u0005.\u0000\u0000]_\u0005-\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_g\u0001\u0000\u0000\u0000`a\u0005,\u0000\u0000"+
		"ab\u0005.\u0000\u0000bg\u0003\u000e\u0007\u0000cd\u0005,\u0000\u0000d"+
		"e\u0005.\u0000\u0000eg\u0003\n\u0005\u0000f>\u0001\u0000\u0000\u0000f"+
		"D\u0001\u0000\u0000\u0000fH\u0001\u0000\u0000\u0000fN\u0001\u0000\u0000"+
		"\u0000fT\u0001\u0000\u0000\u0000fZ\u0001\u0000\u0000\u0000f`\u0001\u0000"+
		"\u0000\u0000fc\u0001\u0000\u0000\u0000g\u0007\u0001\u0000\u0000\u0000"+
		"hk\u0003\u000e\u0007\u0000ik\u0003\n\u0005\u0000jh\u0001\u0000\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0006\u0005\uffff"+
		"\uffff\u0000mu\u0003\f\u0006\u0000no\u0005\b\u0000\u0000op\u0003\n\u0005"+
		"\u0000pq\u0005\t\u0000\u0000qu\u0001\u0000\u0000\u0000ru\u0005\u001f\u0000"+
		"\u0000su\u0005,\u0000\u0000tl\u0001\u0000\u0000\u0000tn\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u~\u0001\u0000"+
		"\u0000\u0000vw\n\u0006\u0000\u0000wx\u0007\u0000\u0000\u0000x}\u0003\n"+
		"\u0005\u0007yz\n\u0005\u0000\u0000z{\u0007\u0001\u0000\u0000{}\u0003\n"+
		"\u0005\u0006|v\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0003\u000e\u0007\u0000\u0082\u0083\u0007\u0002\u0000"+
		"\u0000\u0083\u0084\u0003\u000e\u0007\u0000\u0084\r\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0006\u0007\uffff\uffff\u0000\u0086\u0087\u0005\b\u0000\u0000"+
		"\u0087\u0088\u0003\u000e\u0007\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089"+
		"\u0093\u0001\u0000\u0000\u0000\u008a\u008c\u0005!\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u0093\u0005\u001e\u0000\u0000\u008e\u0090"+
		"\u0005!\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0005"+
		",\u0000\u0000\u0092\u0085\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000"+
		"\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u009c\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\n\u0005\u0000\u0000\u0095\u0096\u0007\u0003\u0000"+
		"\u0000\u0096\u009b\u0003\u000e\u0007\u0006\u0097\u0098\n\u0004\u0000\u0000"+
		"\u0098\u0099\u0007\u0004\u0000\u0000\u0099\u009b\u0003\u000e\u0007\u0005"+
		"\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u000f\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0"+
		"\u00a1\u0003\n\u0005\u0000\u00a1\u00a2\u0005\t\u0000\u0000\u00a2\u0011"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4\u00a5\u0003"+
		"\u0010\b\u0000\u00a5\u00a9\u0003\u0002\u0001\u0000\u00a6\u00a8\u0003\u0014"+
		"\n\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0003\u0016\u000b\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005\u000b\u0000\u0000\u00b0\u0013\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\f\u0000\u0000\u00b2\u00b3\u0003\u0010\b\u0000"+
		"\u00b3\u00b4\u0003\u0002\u0001\u0000\u00b4\u00b5\u0005\r\u0000\u0000\u00b5"+
		"\u0015\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u000e\u0000\u0000\u00b7"+
		"\u00b8\u0003\u0002\u0001\u0000\u00b8\u00b9\u0005\u000f\u0000\u0000\u00b9"+
		"\u0017\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0010\u0000\u0000\u00bb"+
		"\u00bc\u0003\u0010\b\u0000\u00bc\u00bd\u0003\u0002\u0001\u0000\u00bd\u00be"+
		"\u0005\u0011\u0000\u0000\u00be\u0019\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0012\u0000\u0000\u00c0\u00c7\u0005\b\u0000\u0000\u00c1\u00c8\u0005"+
		"\u001e\u0000\u0000\u00c2\u00c8\u0005\u001f\u0000\u0000\u00c3\u00c8\u0005"+
		",\u0000\u0000\u00c4\u00c8\u0003\u000e\u0007\u0000\u00c5\u00c8\u0003\n"+
		"\u0005\u0000\u00c6\u00c8\u0005-\u0000\u0000\u00c7\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00d1\u0005\t\u0000\u0000\u00ca\u00cb\u0005\u0012\u0000\u0000"+
		"\u00cb\u00cc\u0005\b\u0000\u0000\u00cc\u00cd\u0005-\u0000\u0000\u00cd"+
		"\u00ce\u0005\u0013\u0000\u0000\u00ce\u00cf\u0007\u0005\u0000\u0000\u00cf"+
		"\u00d1\u0005\t\u0000\u0000\u00d0\u00bf\u0001\u0000\u0000\u0000\u00d0\u00ca"+
		"\u0001\u0000\u0000\u0000\u00d1\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005\u0014\u0000\u0000\u00d3\u00d4\u0005,\u0000\u0000\u00d4\u00d5\u0005"+
		"\u0015\u0000\u0000\u00d5\u00d6\u0005\u0016\u0000\u0000\u00d6\u00d7\u0005"+
		"\u0017\u0000\u0000\u00d7\u00d8\u0005\b\u0000\u0000\u00d8\u00d9\u0003\u001e"+
		"\u000f\u0000\u00d9\u00da\u0005\u0018\u0000\u0000\u00da\u00db\u0003\u001e"+
		"\u000f\u0000\u00db\u00dc\u0005\t\u0000\u0000\u00dc\u00dd\u0003\u0002\u0001"+
		"\u0000\u00dd\u00de\u0005\u0019\u0000\u0000\u00de\u001d\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0007\u0006\u0000\u0000\u00e0\u001f\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0014\u0000\u0000\u00e2\u00e3\u0005\b\u0000\u0000"+
		"\u00e3\u00e4\u0003\u0006\u0003\u0000\u00e4\u00e5\u0005\u0018\u0000\u0000"+
		"\u00e5\u00e6\u0003\n\u0005\u0000\u00e6\u00e7\u0005\u0018\u0000\u0000\u00e7"+
		"\u00e8\u0003\"\u0011\u0000\u00e8\u00e9\u0005\t\u0000\u0000\u00e9\u00ea"+
		"\u0003\u0002\u0001\u0000\u00ea\u00eb\u0005\u0019\u0000\u0000\u00eb!\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f2\u0003&\u0013\u0000\u00ed\u00f2\u0003$\u0012"+
		"\u0000\u00ee\u00ef\u0005,\u0000\u0000\u00ef\u00f0\u0005.\u0000\u0000\u00f0"+
		"\u00f2\u0003\u000e\u0007\u0000\u00f1\u00ec\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f2"+
		"#\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005,\u0000\u0000\u00f4\u00f8\u0005"+
		"\u001a\u0000\u0000\u00f5\u00f6\u0005\u001a\u0000\u0000\u00f6\u00f8\u0005"+
		",\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005,\u0000\u0000"+
		"\u00fa\u00fe\u0005\u001b\u0000\u0000\u00fb\u00fc\u0005\u001b\u0000\u0000"+
		"\u00fc\u00fe\u0005,\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\'\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0003\u0010\b\u0000\u0100\u0101\u0005\u001c\u0000\u0000\u0101\u0102\u0003"+
		"\b\u0004\u0000\u0102\u0103\u0005\u001d\u0000\u0000\u0103\u0104\u0003\b"+
		"\u0004\u0000\u0104\u0112\u0001\u0000\u0000\u0000\u0105\u0106\u0003\u0010"+
		"\b\u0000\u0106\u0107\u0005\u001c\u0000\u0000\u0107\u0108\u0005\u001f\u0000"+
		"\u0000\u0108\u0109\u0005\u001d\u0000\u0000\u0109\u010a\u0005\u001f\u0000"+
		"\u0000\u010a\u0112\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u0010\b\u0000"+
		"\u010c\u010d\u0005\u001c\u0000\u0000\u010d\u010e\u0005-\u0000\u0000\u010e"+
		"\u010f\u0005\u001d\u0000\u0000\u010f\u0110\u0005-\u0000\u0000\u0110\u0112"+
		"\u0001\u0000\u0000\u0000\u0111\u00ff\u0001\u0000\u0000\u0000\u0111\u0105"+
		"\u0001\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000\u0112)\u0001"+
		"\u0000\u0000\u0000\u00192<BLRX^fjt|~\u008b\u008f\u0092\u009a\u009c\u00a9"+
		"\u00ad\u00c7\u00d0\u00f1\u00f7\u00fd\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}