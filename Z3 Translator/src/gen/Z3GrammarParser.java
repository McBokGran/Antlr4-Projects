// Generated from Z3Grammar.g4 by ANTLR 4.9.2

package gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Z3GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, OPENINGBRACKET=2, CLOSINGBRACKET=3, MODEL=4, DEFINEFUN=5, BOX=6, 
		INTNAME=7, WS=8;
	public static final int
		RULE_start = 0, RULE_definefun = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definefun"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'model'", "'define-fun'", null, "'Int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "OPENINGBRACKET", "CLOSINGBRACKET", "MODEL", "DEFINEFUN", 
			"BOX", "INTNAME", "WS"
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
	public String getGrammarFileName() { return "Z3Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Z3GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode OPENINGBRACKET() { return getToken(Z3GrammarParser.OPENINGBRACKET, 0); }
		public TerminalNode MODEL() { return getToken(Z3GrammarParser.MODEL, 0); }
		public TerminalNode CLOSINGBRACKET() { return getToken(Z3GrammarParser.CLOSINGBRACKET, 0); }
		public TerminalNode EOF() { return getToken(Z3GrammarParser.EOF, 0); }
		public List<DefinefunContext> definefun() {
			return getRuleContexts(DefinefunContext.class);
		}
		public DefinefunContext definefun(int i) {
			return getRuleContext(DefinefunContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Z3GrammarVisitor ) return ((Z3GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(OPENINGBRACKET);
			setState(5);
			match(MODEL);
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENINGBRACKET) {
				{
				{
				setState(6);
				definefun();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
			match(CLOSINGBRACKET);
			setState(13);
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

	public static class DefinefunContext extends ParserRuleContext {
		public List<TerminalNode> OPENINGBRACKET() { return getTokens(Z3GrammarParser.OPENINGBRACKET); }
		public TerminalNode OPENINGBRACKET(int i) {
			return getToken(Z3GrammarParser.OPENINGBRACKET, i);
		}
		public TerminalNode DEFINEFUN() { return getToken(Z3GrammarParser.DEFINEFUN, 0); }
		public TerminalNode BOX() { return getToken(Z3GrammarParser.BOX, 0); }
		public List<TerminalNode> CLOSINGBRACKET() { return getTokens(Z3GrammarParser.CLOSINGBRACKET); }
		public TerminalNode CLOSINGBRACKET(int i) {
			return getToken(Z3GrammarParser.CLOSINGBRACKET, i);
		}
		public TerminalNode INTNAME() { return getToken(Z3GrammarParser.INTNAME, 0); }
		public TerminalNode INT() { return getToken(Z3GrammarParser.INT, 0); }
		public DefinefunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definefun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Z3GrammarVisitor ) return ((Z3GrammarVisitor<? extends T>)visitor).visitDefinefun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinefunContext definefun() throws RecognitionException {
		DefinefunContext _localctx = new DefinefunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definefun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(OPENINGBRACKET);
			setState(16);
			match(DEFINEFUN);
			setState(17);
			match(BOX);
			setState(18);
			match(OPENINGBRACKET);
			setState(19);
			match(CLOSINGBRACKET);
			setState(20);
			match(INTNAME);
			setState(21);
			match(INT);
			setState(22);
			match(CLOSINGBRACKET);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\33\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\31\2\6\3\2\2\2\4\21\3\2\2\2\6"+
		"\7\7\4\2\2\7\13\7\6\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2"+
		"\2\13\f\3\2\2\2\f\16\3\2\2\2\r\13\3\2\2\2\16\17\7\5\2\2\17\20\7\2\2\3"+
		"\20\3\3\2\2\2\21\22\7\4\2\2\22\23\7\7\2\2\23\24\7\b\2\2\24\25\7\4\2\2"+
		"\25\26\7\5\2\2\26\27\7\t\2\2\27\30\7\3\2\2\30\31\7\5\2\2\31\5\3\2\2\2"+
		"\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}