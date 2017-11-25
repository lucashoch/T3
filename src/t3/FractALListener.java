// Generated from FractAL.g4 by ANTLR 4.7
package t3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FractALParser}.
 */
public interface FractALListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FractALParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(FractALParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractALParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(FractALParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractALParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(FractALParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractALParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(FractALParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractALParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(FractALParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractALParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(FractALParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractALParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(FractALParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractALParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(FractALParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractALParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(FractALParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractALParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(FractALParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractALParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(FractALParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractALParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(FractALParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractALParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(FractALParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractALParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(FractALParser.OprContext ctx);
}