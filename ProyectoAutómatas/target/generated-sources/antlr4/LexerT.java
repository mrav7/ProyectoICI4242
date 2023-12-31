// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMIENZO", "FIN", "IMPRIMIR", "LEER", "CONST", "ASIGNAR", "ENTERO", "CADENA", 
		"BOOLEANO", "OP_MATE", "MAS", "MENOS", "MULT", "DIV", "SENO", "COSENO", 
		"MOD", "Y", "O", "ABRIR_PAR", "CERRAR_PAR", "ABRIR_BRACKET", "CERRAR_BRACKET", 
		"ABRIR_BRACE", "CERRAR_BRACE", "SEMICOLON", "COMA", "COMP_OP", "MAYOR_QUE", 
		"MENOR_QUE", "DISTINTO_DE", "MIENTRAS", "PARA", "SI", "ENTONCES", "NOMBRE_VAR", 
		"NUMERO", "PALABRA", "VALORES_BOOL", "CARACT_MIN", "CARACT_MAYUS", "DIGITO", 
		"WS"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0124\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0095\n\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\5\35\u00c8\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\6%\u00ef\n%\r%\16%\u00f0\3&\5&\u00f4\n&\3&\6&\u00f7\n&\r"+
		"&\16&\u00f8\3\'\3\'\3\'\3\'\5\'\u00ff\n\'\7\'\u0101\n\'\f\'\16\'\u0104"+
		"\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0116\n(\3"+
		")\3)\3*\3*\3+\3+\3,\6,\u011f\n,\r,\16,\u0120\3,\3,\2\2-\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q\2S\2U\2W*\3\2\6\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u0130\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2W\3\2\2\2\3Y\3"+
		"\2\2\2\5_\3\2\2\2\7c\3\2\2\2\tl\3\2\2\2\13q\3\2\2\2\rw\3\2\2\2\17y\3\2"+
		"\2\2\21\u0080\3\2\2\2\23\u0087\3\2\2\2\25\u0094\3\2\2\2\27\u0096\3\2\2"+
		"\2\31\u0098\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2"+
		"!\u00a3\3\2\2\2#\u00aa\3\2\2\2%\u00ae\3\2\2\2\'\u00b1\3\2\2\2)\u00b4\3"+
		"\2\2\2+\u00b6\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63"+
		"\u00be\3\2\2\2\65\u00c0\3\2\2\2\67\u00c2\3\2\2\29\u00c7\3\2\2\2;\u00c9"+
		"\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00d0\3\2\2\2C\u00d9\3\2\2\2E"+
		"\u00de\3\2\2\2G\u00e1\3\2\2\2I\u00ee\3\2\2\2K\u00f3\3\2\2\2M\u00fa\3\2"+
		"\2\2O\u0115\3\2\2\2Q\u0117\3\2\2\2S\u0119\3\2\2\2U\u011b\3\2\2\2W\u011e"+
		"\3\2\2\2YZ\7D\2\2Z[\7G\2\2[\\\7I\2\2\\]\7K\2\2]^\7P\2\2^\4\3\2\2\2_`\7"+
		"G\2\2`a\7P\2\2ab\7F\2\2b\6\3\2\2\2cd\7k\2\2de\7o\2\2ef\7r\2\2fg\7t\2\2"+
		"gh\7k\2\2hi\7o\2\2ij\7k\2\2jk\7t\2\2k\b\3\2\2\2lm\7n\2\2mn\7g\2\2no\7"+
		"g\2\2op\7t\2\2p\n\3\2\2\2qr\7E\2\2rs\7Q\2\2st\7P\2\2tu\7U\2\2uv\7V\2\2"+
		"v\f\3\2\2\2wx\7?\2\2x\16\3\2\2\2yz\7g\2\2z{\7p\2\2{|\7v\2\2|}\7g\2\2}"+
		"~\7t\2\2~\177\7q\2\2\177\20\3\2\2\2\u0080\u0081\7e\2\2\u0081\u0082\7c"+
		"\2\2\u0082\u0083\7f\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086"+
		"\7c\2\2\u0086\22\3\2\2\2\u0087\u0088\7d\2\2\u0088\u0089\7q\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7p\2\2\u008e\u008f\7q\2\2\u008f\24\3\2\2\2\u0090\u0095\5\27\f\2"+
		"\u0091\u0095\5\31\r\2\u0092\u0095\5\33\16\2\u0093\u0095\5\35\17\2\u0094"+
		"\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2"+
		"\2\2\u0095\26\3\2\2\2\u0096\u0097\7-\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\7/\2\2\u0099\32\3\2\2\2\u009a\u009b\7,\2\2\u009b\34\3\2\2\2\u009c\u009d"+
		"\7\61\2\2\u009d\36\3\2\2\2\u009e\u009f\7U\2\2\u009f\u00a0\7G\2\2\u00a0"+
		"\u00a1\7P\2\2\u00a1\u00a2\7Q\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7E\2\2\u00a4"+
		"\u00a5\7Q\2\2\u00a5\u00a6\7U\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7P\2\2"+
		"\u00a8\u00a9\7Q\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7O\2\2\u00ab\u00ac\7Q"+
		"\2\2\u00ac\u00ad\7F\2\2\u00ad$\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0"+
		"\7(\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7~\2\2\u00b2\u00b3\7~\2\2\u00b3(\3"+
		"\2\2\2\u00b4\u00b5\7*\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7,\3\2"+
		"\2\2\u00b8\u00b9\7]\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7_\2\2\u00bb\60\3\2"+
		"\2\2\u00bc\u00bd\7}\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf\64"+
		"\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7.\2\2\u00c3"+
		"8\3\2\2\2\u00c4\u00c8\5;\36\2\u00c5\u00c8\5=\37\2\u00c6\u00c8\5? \2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8:\3\2\2\2"+
		"\u00c9\u00ca\7@\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc>\3\2\2\2\u00cd"+
		"\u00ce\7#\2\2\u00ce\u00cf\7?\2\2\u00cf@\3\2\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2"+
		"\u00d5\u00d6\7t\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7u\2\2\u00d8B\3\2\2"+
		"\2\u00d9\u00da\7r\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd"+
		"\7c\2\2\u00ddD\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7k\2\2\u00e0F\3"+
		"\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"\u00e5\7q\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7u\2\2\u00e9H\3\2\2\2\u00ea\u00ef\5Q)\2\u00eb\u00ef\5S*\2"+
		"\u00ec\u00ef\5U+\2\u00ed\u00ef\7a\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1J\3\2\2\2\u00f2\u00f4\7/\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\5U"+
		"+\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9L\3\2\2\2\u00fa\u0102\7$\2\2\u00fb\u00ff\5Q)\2\u00fc"+
		"\u00ff\5S*\2\u00fd\u00ff\5W,\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\7$\2\2\u0106N\3\2\2\2\u0107\u0108\7x\2\2\u0108"+
		"\u0109\7g\2\2\u0109\u010a\7t\2\2\u010a\u010b\7f\2\2\u010b\u010c\7c\2\2"+
		"\u010c\u010d\7f\2\2\u010d\u010e\7g\2\2\u010e\u010f\7t\2\2\u010f\u0116"+
		"\7q\2\2\u0110\u0111\7h\2\2\u0111\u0112\7c\2\2\u0112\u0113\7n\2\2\u0113"+
		"\u0114\7u\2\2\u0114\u0116\7q\2\2\u0115\u0107\3\2\2\2\u0115\u0110\3\2\2"+
		"\2\u0116P\3\2\2\2\u0117\u0118\t\2\2\2\u0118R\3\2\2\2\u0119\u011a\t\3\2"+
		"\2\u011aT\3\2\2\2\u011b\u011c\t\4\2\2\u011cV\3\2\2\2\u011d\u011f\t\5\2"+
		"\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b,\2\2\u0123X\3\2\2\2\r\2\u0094"+
		"\u00c7\u00ee\u00f0\u00f3\u00f8\u00fe\u0102\u0115\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}