// Generated from br/com/bcc/analisador_sintatico/Bcc.g4 by ANTLR 4.7.2
package br.com.bcc.analisador_sintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BccParser}.
 */
public interface BccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BccParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(BccParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(BccParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(BccParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(BccParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(BccParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(BccParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(BccParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(BccParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(BccParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(BccParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#comandoAtribuir}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuir(BccParser.ComandoAtribuirContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#comandoAtribuir}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuir(BccParser.ComandoAtribuirContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(BccParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(BccParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(BccParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(BccParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(BccParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(BccParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(BccParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(BccParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(BccParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(BccParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(BccParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(BccParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BccParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(BccParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BccParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(BccParser.Op2Context ctx);
}
