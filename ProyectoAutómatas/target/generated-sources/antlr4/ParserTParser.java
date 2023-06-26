// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMIENZO=1, FIN=2, IMPRIMIR=3, LEER=4, CONST=5, ASIGNAR=6, ENTERO=7, CADENA=8, 
		BOOLEANO=9, OP_MATE=10, MAS=11, MENOS=12, MULT=13, DIV=14, SENO=15, COSENO=16, 
		MOD=17, Y=18, O=19, ABRIR_PAR=20, CERRAR_PAR=21, ABRIR_BRACKET=22, CERRAR_BRACKET=23, 
		ABRIR_BRACE=24, CERRAR_BRACE=25, SEMICOLON=26, COMA=27, COMP_OP=28, MAYOR_QUE=29, 
		MENOR_QUE=30, DISTINTO_DE=31, MIENTRAS=32, PARA=33, SI=34, ENTONCES=35, 
		NOMBRE_VAR=36, NUMERO=37, PALABRA=38, VALORES_BOOL=39, WS=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declare_var = 2, RULE_declare_int = 3, 
		RULE_declare_string = 4, RULE_declare_bool = 5, RULE_imprimir = 6, RULE_leer = 7;
	public static final String[] ruleNames = {
		"program", "statement", "declare_var", "declare_int", "declare_string", 
		"declare_bool", "imprimir", "leer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'BEGIN'", "'END'", "'imprimir'", "'leer'", "'CONST'", "'='", "'entero'", 
		"'cadena'", "'booleano'", null, "'+'", "'-'", "'*'", "'/'", "'SENO'", 
		"'COSENO'", "'MOD'", "'&&'", "'||'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "';'", "','", null, "'>'", "'<'", "'!='", "'mientras'", "'para'", 
		"'si'", "'entonces'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMIENZO", "FIN", "IMPRIMIR", "LEER", "CONST", "ASIGNAR", "ENTERO", 
		"CADENA", "BOOLEANO", "OP_MATE", "MAS", "MENOS", "MULT", "DIV", "SENO", 
		"COSENO", "MOD", "Y", "O", "ABRIR_PAR", "CERRAR_PAR", "ABRIR_BRACKET", 
		"CERRAR_BRACKET", "ABRIR_BRACE", "CERRAR_BRACE", "SEMICOLON", "COMA", 
		"COMP_OP", "MAYOR_QUE", "MENOR_QUE", "DISTINTO_DE", "MIENTRAS", "PARA", 
		"SI", "ENTONCES", "NOMBRE_VAR", "NUMERO", "PALABRA", "VALORES_BOOL", "WS"
	};
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
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode COMIENZO() { return getToken(ParserTParser.COMIENZO, 0); }
		public TerminalNode FIN() { return getToken(ParserTParser.FIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(COMIENZO);
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				statement();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPRIMIR) | (1L << LEER) | (1L << CONST) | (1L << ENTERO) | (1L << CADENA) | (1L << BOOLEANO))) != 0) );
			setState(22);
			match(FIN);
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

	public static class StatementContext extends ParserRuleContext {
		public Declare_varContext declare_var() {
			return getRuleContext(Declare_varContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case ENTERO:
			case CADENA:
			case BOOLEANO:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				declare_var();
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				imprimir();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				leer();
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

	public static class Declare_varContext extends ParserRuleContext {
		public Declare_intContext declare_int() {
			return getRuleContext(Declare_intContext.class,0);
		}
		public Declare_stringContext declare_string() {
			return getRuleContext(Declare_stringContext.class,0);
		}
		public Declare_boolContext declare_bool() {
			return getRuleContext(Declare_boolContext.class,0);
		}
		public Declare_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclare_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_varContext declare_var() throws RecognitionException {
		Declare_varContext _localctx = new Declare_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare_var);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				declare_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				declare_string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				declare_bool();
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

	public static class Declare_intContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(ParserTParser.ENTERO, 0); }
		public TerminalNode NOMBRE_VAR() { return getToken(ParserTParser.NOMBRE_VAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(ParserTParser.CONST, 0); }
		public TerminalNode ASIGNAR() { return getToken(ParserTParser.ASIGNAR, 0); }
		public TerminalNode NUMERO() { return getToken(ParserTParser.NUMERO, 0); }
		public Declare_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclare_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_intContext declare_int() throws RecognitionException {
		Declare_intContext _localctx = new Declare_intContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(34);
				match(CONST);
				}
			}

			setState(37);
			match(ENTERO);
			setState(38);
			match(NOMBRE_VAR);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNAR) {
				{
				setState(39);
				match(ASIGNAR);
				setState(40);
				match(NUMERO);
				}
			}

			setState(43);
			match(SEMICOLON);
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

	public static class Declare_stringContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(ParserTParser.CADENA, 0); }
		public TerminalNode NOMBRE_VAR() { return getToken(ParserTParser.NOMBRE_VAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(ParserTParser.CONST, 0); }
		public TerminalNode ASIGNAR() { return getToken(ParserTParser.ASIGNAR, 0); }
		public TerminalNode PALABRA() { return getToken(ParserTParser.PALABRA, 0); }
		public Declare_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclare_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stringContext declare_string() throws RecognitionException {
		Declare_stringContext _localctx = new Declare_stringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(45);
				match(CONST);
				}
			}

			setState(48);
			match(CADENA);
			setState(49);
			match(NOMBRE_VAR);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNAR) {
				{
				setState(50);
				match(ASIGNAR);
				setState(51);
				match(PALABRA);
				}
			}

			setState(54);
			match(SEMICOLON);
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

	public static class Declare_boolContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(ParserTParser.BOOLEANO, 0); }
		public TerminalNode NOMBRE_VAR() { return getToken(ParserTParser.NOMBRE_VAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(ParserTParser.CONST, 0); }
		public TerminalNode ASIGNAR() { return getToken(ParserTParser.ASIGNAR, 0); }
		public TerminalNode VALORES_BOOL() { return getToken(ParserTParser.VALORES_BOOL, 0); }
		public Declare_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclare_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_boolContext declare_bool() throws RecognitionException {
		Declare_boolContext _localctx = new Declare_boolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(56);
				match(CONST);
				}
			}

			setState(59);
			match(BOOLEANO);
			setState(60);
			match(NOMBRE_VAR);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNAR) {
				{
				setState(61);
				match(ASIGNAR);
				setState(62);
				match(VALORES_BOOL);
				}
			}

			setState(65);
			match(SEMICOLON);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(ParserTParser.IMPRIMIR, 0); }
		public TerminalNode ABRIR_PAR() { return getToken(ParserTParser.ABRIR_PAR, 0); }
		public TerminalNode NOMBRE_VAR() { return getToken(ParserTParser.NOMBRE_VAR, 0); }
		public TerminalNode CERRAR_PAR() { return getToken(ParserTParser.CERRAR_PAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IMPRIMIR);
			setState(68);
			match(ABRIR_PAR);
			setState(69);
			match(NOMBRE_VAR);
			setState(70);
			match(CERRAR_PAR);
			setState(71);
			match(SEMICOLON);
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(ParserTParser.LEER, 0); }
		public TerminalNode ABRIR_PAR() { return getToken(ParserTParser.ABRIR_PAR, 0); }
		public TerminalNode NOMBRE_VAR() { return getToken(ParserTParser.NOMBRE_VAR, 0); }
		public TerminalNode CERRAR_PAR() { return getToken(ParserTParser.CERRAR_PAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LEER);
			setState(74);
			match(ABRIR_PAR);
			setState(75);
			match(NOMBRE_VAR);
			setState(76);
			match(CERRAR_PAR);
			setState(77);
			match(SEMICOLON);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*R\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\25\n\2\r"+
		"\2\16\2\26\3\2\3\2\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\5\4#\n\4\3\5\5\5"+
		"&\n\5\3\5\3\5\3\5\3\5\5\5,\n\5\3\5\3\5\3\6\5\6\61\n\6\3\6\3\6\3\6\3\6"+
		"\5\6\67\n\6\3\6\3\6\3\7\5\7<\n\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16"+
		"\20\2\2\2T\2\22\3\2\2\2\4\35\3\2\2\2\6\"\3\2\2\2\b%\3\2\2\2\n\60\3\2\2"+
		"\2\f;\3\2\2\2\16E\3\2\2\2\20K\3\2\2\2\22\24\7\3\2\2\23\25\5\4\3\2\24\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31"+
		"\7\4\2\2\31\3\3\2\2\2\32\36\5\6\4\2\33\36\5\16\b\2\34\36\5\20\t\2\35\32"+
		"\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37#\5\b\5\2 #\5\n\6"+
		"\2!#\5\f\7\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\7\3\2\2\2$&\7\7\2\2%"+
		"$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\t\2\2(+\7&\2\2)*\7\b\2\2*,\7\'\2\2"+
		"+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\34\2\2.\t\3\2\2\2/\61\7\7\2\2\60/\3"+
		"\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\n\2\2\63\66\7&\2\2\64\65\7"+
		"\b\2\2\65\67\7(\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\34\2\2"+
		"9\13\3\2\2\2:<\7\7\2\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\13\2\2>A\7&\2"+
		"\2?@\7\b\2\2@B\7)\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\34\2\2D\r\3\2"+
		"\2\2EF\7\5\2\2FG\7\26\2\2GH\7&\2\2HI\7\27\2\2IJ\7\34\2\2J\17\3\2\2\2K"+
		"L\7\6\2\2LM\7\26\2\2MN\7&\2\2NO\7\27\2\2OP\7\34\2\2P\21\3\2\2\2\13\26"+
		"\35\"%+\60\66;A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}