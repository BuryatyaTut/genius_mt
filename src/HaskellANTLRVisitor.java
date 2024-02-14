// Generated from src/HaskellANTLR.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaskellANTLRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaskellANTLRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(HaskellANTLRParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(HaskellANTLRParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HaskellANTLRParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#input_return_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_return_types(HaskellANTLRParser.Input_return_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#input_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_types(HaskellANTLRParser.Input_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HaskellANTLRParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(HaskellANTLRParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(HaskellANTLRParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HaskellANTLRParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#inputs_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs_output(HaskellANTLRParser.Inputs_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#defaultBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBranch(HaskellANTLRParser.DefaultBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(HaskellANTLRParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#condition_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_parser(HaskellANTLRParser.Condition_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HaskellANTLRParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HaskellANTLRParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(HaskellANTLRParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(HaskellANTLRParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellANTLRParser#recursion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursion(HaskellANTLRParser.RecursionContext ctx);
}