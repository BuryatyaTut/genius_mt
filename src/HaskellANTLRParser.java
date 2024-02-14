// Generated from src/HaskellANTLR.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HaskellANTLRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ASSIGN=3, SEMICOLON=4, COLON=5, ARROW=6, DOUBLECOLON=7, 
		CONDITIONDIVIDER=8, INT=9, BOOLEAN=10, DOUBLE=11, ALL_TYPES=12, STRING=13, 
		OPERATIONS=14, BRACKETS=15, CONDITION_LEXEM=16, RETURN_LEXEM=17, EXPR=18, 
		TYPE=19, NAME=20, WS=21;
	public static final int
		RULE_start = 0, RULE_functions = 1, RULE_function = 2, RULE_input_return_types = 3, 
		RULE_input_types = 4, RULE_type = 5, RULE_return_type = 6, RULE_method_declaration = 7, 
		RULE_declaration = 8, RULE_inputs_output = 9, RULE_defaultBranch = 10, 
		RULE_inputs = 11, RULE_condition_parser = 12, RULE_var = 13, RULE_condition = 14, 
		RULE_input = 15, RULE_output = 16, RULE_recursion = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "functions", "function", "input_return_types", "input_types", 
			"type", "return_type", "method_declaration", "declaration", "inputs_output", 
			"defaultBranch", "inputs", "condition_parser", "var", "condition", "input", 
			"output", "recursion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "';'", "':'", "'->'", "'::'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ASSIGN", "SEMICOLON", "COLON", "ARROW", "DOUBLECOLON", 
			"CONDITIONDIVIDER", "INT", "BOOLEAN", "DOUBLE", "ALL_TYPES", "STRING", 
			"OPERATIONS", "BRACKETS", "CONDITION_LEXEM", "RETURN_LEXEM", "EXPR", 
			"TYPE", "NAME", "WS"
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
	public String getGrammarFileName() { return "HaskellANTLR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaskellANTLRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HaskellANTLRParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			functions();
			setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(39);
				function();
				}
				}
				setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Input_return_typesContext input_return_types() {
			return getRuleContext(Input_return_typesContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			input_return_types();
			setState(46);
			method_declaration();
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
	public static class Input_return_typesContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellANTLRParser.NAME, 0); }
		public TerminalNode DOUBLECOLON() { return getToken(HaskellANTLRParser.DOUBLECOLON, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public List<Input_typesContext> input_types() {
			return getRuleContexts(Input_typesContext.class);
		}
		public Input_typesContext input_types(int i) {
			return getRuleContext(Input_typesContext.class,i);
		}
		public List<TerminalNode> ARROW() { return getTokens(HaskellANTLRParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(HaskellANTLRParser.ARROW, i);
		}
		public Input_return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_return_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterInput_return_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitInput_return_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitInput_return_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_return_typesContext input_return_types() throws RecognitionException {
		Input_return_typesContext _localctx = new Input_return_typesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_return_types);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NAME);
			setState(49);
			match(DOUBLECOLON);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					input_types();
					setState(51);
					match(ARROW);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			return_type();
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
	public static class Input_typesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ARROW() { return getTokens(HaskellANTLRParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(HaskellANTLRParser.ARROW, i);
		}
		public Input_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterInput_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitInput_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitInput_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_typesContext input_types() throws RecognitionException {
		Input_typesContext _localctx = new Input_typesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input_types);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(ARROW);
					setState(62);
					type();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HaskellANTLRParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(HaskellANTLRParser.NAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(TYPE);
			setState(69);
			match(NAME);
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
	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HaskellANTLRParser.TYPE, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(TYPE);
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
	public static class Method_declarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellANTLRParser.NAME, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HaskellANTLRParser.SEMICOLON, 0); }
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(NAME);
			setState(74);
			declaration();
			setState(75);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public List<Inputs_outputContext> inputs_output() {
			return getRuleContexts(Inputs_outputContext.class);
		}
		public Inputs_outputContext inputs_output(int i) {
			return getRuleContext(Inputs_outputContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(HaskellANTLRParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HaskellANTLRParser.COLON, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			inputs_output();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(78);
				match(COLON);
				setState(79);
				inputs_output();
				}
				}
				setState(84);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Inputs_outputContext extends ParserRuleContext {
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HaskellANTLRParser.ASSIGN, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public DefaultBranchContext defaultBranch() {
			return getRuleContext(DefaultBranchContext.class,0);
		}
		public Inputs_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterInputs_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitInputs_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitInputs_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inputs_outputContext inputs_output() throws RecognitionException {
		Inputs_outputContext _localctx = new Inputs_outputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputs_output);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case STRING:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				inputs();
				setState(86);
				match(ASSIGN);
				setState(87);
				output();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ASSIGN);
				setState(90);
				defaultBranch();
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
	public static class DefaultBranchContext extends ParserRuleContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public DefaultBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterDefaultBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitDefaultBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitDefaultBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBranchContext defaultBranch() throws RecognitionException {
		DefaultBranchContext _localctx = new DefaultBranchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defaultBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			output();
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
	public static class InputsContext extends ParserRuleContext {
		public Condition_parserContext condition_parser() {
			return getRuleContext(Condition_parserContext.class,0);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inputs);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				condition_parser();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					input();
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1059328L) != 0) );
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
	public static class Condition_parserContext extends ParserRuleContext {
		public TerminalNode CONDITIONDIVIDER() { return getToken(HaskellANTLRParser.CONDITIONDIVIDER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Condition_parserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_parser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterCondition_parser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitCondition_parser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitCondition_parser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_parserContext condition_parser() throws RecognitionException {
		Condition_parserContext _localctx = new Condition_parserContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition_parser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				var();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(108);
			match(CONDITIONDIVIDER);
			setState(109);
			condition();
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellANTLRParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(NAME);
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
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode CONDITION_LEXEM() { return getToken(HaskellANTLRParser.CONDITION_LEXEM, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(CONDITION_LEXEM);
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
	public static class InputContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HaskellANTLRParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(HaskellANTLRParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(HaskellANTLRParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(HaskellANTLRParser.NAME, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1059328L) != 0)) ) {
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
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HaskellANTLRParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(HaskellANTLRParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(HaskellANTLRParser.STRING, 0); }
		public TerminalNode RETURN_LEXEM() { return getToken(HaskellANTLRParser.RETURN_LEXEM, 0); }
		public RecursionContext recursion() {
			return getRuleContext(RecursionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(HaskellANTLRParser.NAME, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(DOUBLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(RETURN_LEXEM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				recursion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(NAME);
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
	public static class RecursionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellANTLRParser.NAME, 0); }
		public TerminalNode EXPR() { return getToken(HaskellANTLRParser.EXPR, 0); }
		public RecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).enterRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellANTLRListener ) ((HaskellANTLRListener)listener).exitRecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellANTLRVisitor ) return ((HaskellANTLRVisitor<? extends T>)visitor).visitRecursion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursionContext recursion() throws RecognitionException {
		RecursionContext _localctx = new RecursionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_recursion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NAME);
			setState(126);
			match(T__0);
			setState(127);
			match(EXPR);
			setState(128);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015\u0083\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\bQ\b\b\n\b\f\bT\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\\\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0004\u000bb\b\u000b\u000b\u000b\f\u000bc\u0003\u000b"+
		"f\b\u000b\u0001\f\u0004\fi\b\f\u000b\f\f\fj\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"|\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0001\u0004\u0000"+
		"\t\t\u000b\u000b\r\r\u0014\u0014}\u0000$\u0001\u0000\u0000\u0000\u0002"+
		"*\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00060\u0001"+
		"\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000"+
		"\fG\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010M\u0001"+
		"\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014]\u0001\u0000\u0000"+
		"\u0000\u0016e\u0001\u0000\u0000\u0000\u0018h\u0001\u0000\u0000\u0000\u001a"+
		"o\u0001\u0000\u0000\u0000\u001cq\u0001\u0000\u0000\u0000\u001es\u0001"+
		"\u0000\u0000\u0000 {\u0001\u0000\u0000\u0000\"}\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0002\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000"+
		"\u0000\u0000\')\u0003\u0004\u0002\u0000(\'\u0001\u0000\u0000\u0000),\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+\u0003\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0003\u0006"+
		"\u0003\u0000./\u0003\u000e\u0007\u0000/\u0005\u0001\u0000\u0000\u0000"+
		"01\u0005\u0014\u0000\u000017\u0005\u0007\u0000\u000023\u0003\b\u0004\u0000"+
		"34\u0005\u0006\u0000\u000046\u0001\u0000\u0000\u000052\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0003"+
		"\f\u0006\u0000;\u0007\u0001\u0000\u0000\u0000<A\u0003\n\u0005\u0000=>"+
		"\u0005\u0006\u0000\u0000>@\u0003\n\u0005\u0000?=\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B\t\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0013"+
		"\u0000\u0000EF\u0005\u0014\u0000\u0000F\u000b\u0001\u0000\u0000\u0000"+
		"GH\u0005\u0013\u0000\u0000H\r\u0001\u0000\u0000\u0000IJ\u0005\u0014\u0000"+
		"\u0000JK\u0003\u0010\b\u0000KL\u0005\u0004\u0000\u0000L\u000f\u0001\u0000"+
		"\u0000\u0000MR\u0003\u0012\t\u0000NO\u0005\u0005\u0000\u0000OQ\u0003\u0012"+
		"\t\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000S\u0011\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000UV\u0003\u0016\u000b\u0000VW\u0005\u0003\u0000"+
		"\u0000WX\u0003 \u0010\u0000X\\\u0001\u0000\u0000\u0000YZ\u0005\u0003\u0000"+
		"\u0000Z\\\u0003\u0014\n\u0000[U\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000]^\u0003 \u0010\u0000^\u0015"+
		"\u0001\u0000\u0000\u0000_f\u0003\u0018\f\u0000`b\u0003\u001e\u000f\u0000"+
		"a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000e_\u0001\u0000"+
		"\u0000\u0000ea\u0001\u0000\u0000\u0000f\u0017\u0001\u0000\u0000\u0000"+
		"gi\u0003\u001a\r\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0005\b\u0000\u0000mn\u0003\u001c\u000e\u0000n\u0019\u0001\u0000"+
		"\u0000\u0000op\u0005\u0014\u0000\u0000p\u001b\u0001\u0000\u0000\u0000"+
		"qr\u0005\u0010\u0000\u0000r\u001d\u0001\u0000\u0000\u0000st\u0007\u0000"+
		"\u0000\u0000t\u001f\u0001\u0000\u0000\u0000u|\u0005\t\u0000\u0000v|\u0005"+
		"\u000b\u0000\u0000w|\u0005\r\u0000\u0000x|\u0005\u0011\u0000\u0000y|\u0003"+
		"\"\u0011\u0000z|\u0005\u0014\u0000\u0000{u\u0001\u0000\u0000\u0000{v\u0001"+
		"\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|!\u0001\u0000\u0000"+
		"\u0000}~\u0005\u0014\u0000\u0000~\u007f\u0005\u0001\u0000\u0000\u007f"+
		"\u0080\u0005\u0012\u0000\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081"+
		"#\u0001\u0000\u0000\u0000\t*7AR[cej{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}