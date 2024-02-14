// Generated from src/HaskellANTLR.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellANTLRParser}.
 */
public interface HaskellANTLRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HaskellANTLRParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HaskellANTLRParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(HaskellANTLRParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(HaskellANTLRParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HaskellANTLRParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HaskellANTLRParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#input_return_types}.
	 * @param ctx the parse tree
	 */
	void enterInput_return_types(HaskellANTLRParser.Input_return_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#input_return_types}.
	 * @param ctx the parse tree
	 */
	void exitInput_return_types(HaskellANTLRParser.Input_return_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#input_types}.
	 * @param ctx the parse tree
	 */
	void enterInput_types(HaskellANTLRParser.Input_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#input_types}.
	 * @param ctx the parse tree
	 */
	void exitInput_types(HaskellANTLRParser.Input_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HaskellANTLRParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HaskellANTLRParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(HaskellANTLRParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(HaskellANTLRParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(HaskellANTLRParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(HaskellANTLRParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HaskellANTLRParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HaskellANTLRParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#inputs_output}.
	 * @param ctx the parse tree
	 */
	void enterInputs_output(HaskellANTLRParser.Inputs_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#inputs_output}.
	 * @param ctx the parse tree
	 */
	void exitInputs_output(HaskellANTLRParser.Inputs_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBranch(HaskellANTLRParser.DefaultBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBranch(HaskellANTLRParser.DefaultBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(HaskellANTLRParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(HaskellANTLRParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#condition_parser}.
	 * @param ctx the parse tree
	 */
	void enterCondition_parser(HaskellANTLRParser.Condition_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#condition_parser}.
	 * @param ctx the parse tree
	 */
	void exitCondition_parser(HaskellANTLRParser.Condition_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HaskellANTLRParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HaskellANTLRParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HaskellANTLRParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HaskellANTLRParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(HaskellANTLRParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(HaskellANTLRParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(HaskellANTLRParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(HaskellANTLRParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellANTLRParser#recursion}.
	 * @param ctx the parse tree
	 */
	void enterRecursion(HaskellANTLRParser.RecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellANTLRParser#recursion}.
	 * @param ctx the parse tree
	 */
	void exitRecursion(HaskellANTLRParser.RecursionContext ctx);
}