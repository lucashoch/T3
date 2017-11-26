// Generated from FractAL.g4 by ANTLR 4.7
package t3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FractALLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, VAR=12, NUM=13, NUM_INT=14, NUM_REAL=15, Comentario=16, 
		Comment=17, Espaco=18, ERROR=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "VAR", "NUM", "NUM_INT", "NUM_REAL", "Comentario", "Comment", 
		"Espaco", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin:'", "'end.'", "';'", "'Triangle'", "'Circle'", "'Square'", 
		"'repeat'", "'offsetRepeat'", "'('", "','", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"VAR", "NUM", "NUM_INT", "NUM_REAL", "Comentario", "Comment", "Espaco", 
		"ERROR"
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

	 
	        private void stop(String string) {
	            throw new ParseCancellationException(string);
	        }


	public FractALLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FractAL.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17:
			Espaco_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Espaco_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			stop("Linha "+getLine()+": "+getText()+" - simbolo nao identificado");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\7\rk\n\r\f\r\16\rn\13\r\3\16\3\16\5\16r\n\16\3\17\6\17u\n\17"+
		"\r\17\16\17v\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0081\n\21\f"+
		"\21\16\21\u0084\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u008d\n"+
		"\22\f\22\16\22\u0090\13\22\3\22\3\22\3\23\6\23\u0095\n\23\r\23\16\23\u0096"+
		"\3\23\3\23\3\24\3\24\3\24\3\u0082\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\5\2"+
		"C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00a2\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2"+
		"\2\13@\3\2\2\2\rG\3\2\2\2\17N\3\2\2\2\21U\3\2\2\2\23b\3\2\2\2\25d\3\2"+
		"\2\2\27f\3\2\2\2\31h\3\2\2\2\33q\3\2\2\2\35t\3\2\2\2\37x\3\2\2\2!|\3\2"+
		"\2\2#\u008a\3\2\2\2%\u0094\3\2\2\2\'\u009a\3\2\2\2)*\7d\2\2*+\7g\2\2+"+
		",\7i\2\2,-\7k\2\2-.\7p\2\2./\7<\2\2/\4\3\2\2\2\60\61\7g\2\2\61\62\7p\2"+
		"\2\62\63\7f\2\2\63\64\7\60\2\2\64\6\3\2\2\2\65\66\7=\2\2\66\b\3\2\2\2"+
		"\678\7V\2\289\7t\2\29:\7k\2\2:;\7c\2\2;<\7p\2\2<=\7i\2\2=>\7n\2\2>?\7"+
		"g\2\2?\n\3\2\2\2@A\7E\2\2AB\7k\2\2BC\7t\2\2CD\7e\2\2DE\7n\2\2EF\7g\2\2"+
		"F\f\3\2\2\2GH\7U\2\2HI\7s\2\2IJ\7w\2\2JK\7c\2\2KL\7t\2\2LM\7g\2\2M\16"+
		"\3\2\2\2NO\7t\2\2OP\7g\2\2PQ\7r\2\2QR\7g\2\2RS\7c\2\2ST\7v\2\2T\20\3\2"+
		"\2\2UV\7q\2\2VW\7h\2\2WX\7h\2\2XY\7u\2\2YZ\7g\2\2Z[\7v\2\2[\\\7T\2\2\\"+
		"]\7g\2\2]^\7r\2\2^_\7g\2\2_`\7c\2\2`a\7v\2\2a\22\3\2\2\2bc\7*\2\2c\24"+
		"\3\2\2\2de\7.\2\2e\26\3\2\2\2fg\7+\2\2g\30\3\2\2\2hl\t\2\2\2ik\t\3\2\2"+
		"ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\32\3\2\2\2nl\3\2\2\2or\5\35"+
		"\17\2pr\5\37\20\2qo\3\2\2\2qp\3\2\2\2r\34\3\2\2\2su\4\62;\2ts\3\2\2\2"+
		"uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\36\3\2\2\2xy\5\35\17\2yz\7\60\2\2z{\5"+
		"\35\17\2{ \3\2\2\2|}\7\61\2\2}~\7,\2\2~\u0082\3\2\2\2\177\u0081\13\2\2"+
		"\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7,\2\2\u0086"+
		"\u0087\7\61\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\21\2\2\u0089\"\3\2\2"+
		"\2\u008a\u008e\7%\2\2\u008b\u008d\n\4\2\2\u008c\u008b\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\b\22\2\2\u0092$\3\2\2\2\u0093\u0095\t\5\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\23\3\2\u0099&\3\2\2\2\u009a"+
		"\u009b\13\2\2\2\u009b\u009c\b\24\4\2\u009c(\3\2\2\2\t\2lqv\u0082\u008e"+
		"\u0096\5\b\2\2\3\23\2\3\24\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}