// Generated from C:/Users/dsanghv3/IdeaProjects/SER502-Spring2023-Team13/src/main/Antlr\PhraseForge.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PhraseForgeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PhraseForgeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_pgm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_pgm(PhraseForgeParser.Forge_pgmContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#phrase_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase_blk(PhraseForgeParser.Phrase_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_cmd(PhraseForgeParser.Forge_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_asrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_asrt(PhraseForgeParser.Forge_asrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#asrts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsrts(PhraseForgeParser.AsrtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsrt_bool(PhraseForgeParser.Asrt_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#asrt_cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsrt_cmp(PhraseForgeParser.Asrt_cmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsrt_num(PhraseForgeParser.Asrt_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#asrt_eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsrt_eval(PhraseForgeParser.Asrt_evalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_if(PhraseForgeParser.Forge_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#else_forge_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_forge_if(PhraseForgeParser.Else_forge_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_else(PhraseForgeParser.Forge_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_while(PhraseForgeParser.Forge_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#echo_forge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcho_forge(PhraseForgeParser.Echo_forgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_enh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_enh(PhraseForgeParser.Forge_enhContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forgeRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForgeRange(PhraseForgeParser.ForgeRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_loop(PhraseForgeParser.Forge_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#forge_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForge_var(PhraseForgeParser.Forge_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#dec_asrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_asrt(PhraseForgeParser.Dec_asrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#inc_asrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_asrt(PhraseForgeParser.Inc_asrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhraseForgeParser#asrt_tern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsrt_tern(PhraseForgeParser.Asrt_ternContext ctx);
}