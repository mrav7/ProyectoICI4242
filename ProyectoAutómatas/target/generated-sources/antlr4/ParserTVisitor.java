// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declare_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var(ParserTParser.Declare_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declare_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_int(ParserTParser.Declare_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declare_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_string(ParserTParser.Declare_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declare_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_bool(ParserTParser.Declare_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(ParserTParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(ParserTParser.LeerContext ctx);
}