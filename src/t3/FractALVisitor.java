// Generated from FractAL.g4 by ANTLR 4.7
package t3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FractALParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FractALVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FractALParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(FractALParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractALParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(FractALParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractALParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(FractALParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractALParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(FractALParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractALParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacao(FractALParser.OperacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractALParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(FractALParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractALParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(FractALParser.OprContext ctx);
}