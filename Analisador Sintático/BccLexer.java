// Generated from br/com/bcc/analisador_sintatico/Bcc.g4 by ANTLR 4.7.2
package br.com.bcc.analisador_sintatico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, TIPO_VARIAVEIS=14, NUMINTEIRO=15, 
		NUMREAL=16, VARIAVEL=17, OP_RELACIONAL1=18, OP_RELACIONAL2=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "TIPO_VARIAVEIS", "NUMINTEIRO", "NUMREAL", 
			"VARIAVEL", "OP_RELACIONAL1", "OP_RELACIONAL2", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'DECLARACOES'", "'ALGORITMO'", "'->'", "'ATRIBUIR'", "'LER'", 
			"'ESCREVA'", "'('", "')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TIPO_VARIAVEIS", "NUMINTEIRO", "NUMREAL", "VARIAVEL", "OP_RELACIONAL1", 
			"OP_RELACIONAL2", "WS"
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


	public BccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bcc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17s\n\17\3\20"+
		"\6\20v\n\20\r\20\16\20w\3\21\6\21{\n\21\r\21\16\21|\3\21\3\21\6\21\u0081"+
		"\n\21\r\21\16\21\u0082\5\21\u0085\n\21\3\22\3\22\7\22\u0089\n\22\f\22"+
		"\16\22\u008c\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0096"+
		"\n\24\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\5\4\2C"+
		"\\c|\5\2\62;C\\c|\4\2\f\f\"\"\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\3+\3\2\2\2\5-\3\2\2\2\79\3\2\2\2\tC\3\2\2\2\13F\3\2\2\2\rO\3\2"+
		"\2\2\17S\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3"+
		"\2\2\2\33e\3\2\2\2\35r\3\2\2\2\37u\3\2\2\2!z\3\2\2\2#\u0086\3\2\2\2%\u008d"+
		"\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+,\7<\2\2,\4\3\2\2\2-.\7F\2\2."+
		"/\7G\2\2/\60\7E\2\2\60\61\7N\2\2\61\62\7C\2\2\62\63\7T\2\2\63\64\7C\2"+
		"\2\64\65\7E\2\2\65\66\7Q\2\2\66\67\7G\2\2\678\7U\2\28\6\3\2\2\29:\7C\2"+
		"\2:;\7N\2\2;<\7I\2\2<=\7Q\2\2=>\7T\2\2>?\7K\2\2?@\7V\2\2@A\7O\2\2AB\7"+
		"Q\2\2B\b\3\2\2\2CD\7/\2\2DE\7@\2\2E\n\3\2\2\2FG\7C\2\2GH\7V\2\2HI\7T\2"+
		"\2IJ\7K\2\2JK\7D\2\2KL\7W\2\2LM\7K\2\2MN\7T\2\2N\f\3\2\2\2OP\7N\2\2PQ"+
		"\7G\2\2QR\7T\2\2R\16\3\2\2\2ST\7G\2\2TU\7U\2\2UV\7E\2\2VW\7T\2\2WX\7G"+
		"\2\2XY\7X\2\2YZ\7C\2\2Z\20\3\2\2\2[\\\7*\2\2\\\22\3\2\2\2]^\7+\2\2^\24"+
		"\3\2\2\2_`\7-\2\2`\26\3\2\2\2ab\7/\2\2b\30\3\2\2\2cd\7,\2\2d\32\3\2\2"+
		"\2ef\7\61\2\2f\34\3\2\2\2gh\7K\2\2hi\7P\2\2ij\7V\2\2jk\7G\2\2kl\7K\2\2"+
		"lm\7T\2\2ms\7Q\2\2no\7T\2\2op\7G\2\2pq\7C\2\2qs\7N\2\2rg\3\2\2\2rn\3\2"+
		"\2\2s\36\3\2\2\2tv\4\62;\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x \3"+
		"\2\2\2y{\4\62;\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0084\3\2\2"+
		"\2~\u0080\7\60\2\2\177\u0081\4\62;\2\u0080\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"~\3\2\2\2\u0084\u0085\3\2\2\2\u0085\"\3\2\2\2\u0086\u008a\t\2\2\2\u0087"+
		"\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b$\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e"+
		"\4>@\2\u008e&\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0096\7?\2\2\u0091\u0092"+
		"\7@\2\2\u0092\u0096\7?\2\2\u0093\u0094\7?\2\2\u0094\u0096\7?\2\2\u0095"+
		"\u008f\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096(\3\2\2\2"+
		"\u0097\u0098\t\4\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\25\2\2\u009a*\3"+
		"\2\2\2\n\2rw|\u0082\u0084\u008a\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
