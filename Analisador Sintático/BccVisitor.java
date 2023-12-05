// Generated from br/com/bcc/analisador_sintatico/Bcc.g4 by ANTLR 4.7.2
package br.com.bcc.analisador_sintatico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BccVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BccParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(BccParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracoes(BccParser.ListaDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(BccParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#listaComandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaComandos(BccParser.ListaComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(BccParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#comandoAtribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuir(BccParser.ComandoAtribuirContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#comandoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEntrada(BccParser.ComandoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#comandoSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSaida(BccParser.ComandoSaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(BccParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(BccParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(BccParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(BccParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link BccParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(BccParser.Op2Context ctx);
}
