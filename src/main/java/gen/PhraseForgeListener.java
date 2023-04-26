// Generated from C:/Users/dsanghv3/IdeaProjects/SER502-Spring2023-Team13/src/main/Antlr\PhraseForge.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PhraseForgeParser}.
 */
public interface PhraseForgeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forge_pgm}.
	 * @param ctx the parse tree
	 */
	void enterForge_pgm(PhraseForgeParser.Forge_pgmContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forge_pgm}.
	 * @param ctx the parse tree
	 */
	void exitForge_pgm(PhraseForgeParser.Forge_pgmContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#phrase_blk}.
	 * @param ctx the parse tree
	 */
	void enterPhrase_blk(PhraseForgeParser.Phrase_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#phrase_blk}.
	 * @param ctx the parse tree
	 */
	void exitPhrase_blk(PhraseForgeParser.Phrase_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forge_cmd}.
	 * @param ctx the parse tree
	 */
	void enterForge_cmd(PhraseForgeParser.Forge_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forge_cmd}.
	 * @param ctx the parse tree
	 */
	void exitForge_cmd(PhraseForgeParser.Forge_cmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantAssignment}
	 * labeled alternative in {@link PhraseForgeParser#forge_asrt}.
	 * @param ctx the parse tree
	 */
	void enterQuantAssignment(PhraseForgeParser.QuantAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantAssignment}
	 * labeled alternative in {@link PhraseForgeParser#forge_asrt}.
	 * @param ctx the parse tree
	 */
	void exitQuantAssignment(PhraseForgeParser.QuantAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAssignment}
	 * labeled alternative in {@link PhraseForgeParser#forge_asrt}.
	 * @param ctx the parse tree
	 */
	void enterLogicAssignment(PhraseForgeParser.LogicAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAssignment}
	 * labeled alternative in {@link PhraseForgeParser#forge_asrt}.
	 * @param ctx the parse tree
	 */
	void exitLogicAssignment(PhraseForgeParser.LogicAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code phraseAssignment}
	 * labeled alternative in {@link PhraseForgeParser#forge_asrt}.
	 * @param ctx the parse tree
	 */
	void enterPhraseAssignment(PhraseForgeParser.PhraseAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code phraseAssignment}
	 * labeled alternative in {@link PhraseForgeParser#forge_asrt}.
	 * @param ctx the parse tree
	 */
	void exitPhraseAssignment(PhraseForgeParser.PhraseAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#asrts}.
	 * @param ctx the parse tree
	 */
	void enterAsrts(PhraseForgeParser.AsrtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#asrts}.
	 * @param ctx the parse tree
	 */
	void exitAsrts(PhraseForgeParser.AsrtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExpressionInBrackets}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpressionInBrackets(PhraseForgeParser.LogicExpressionInBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExpressionInBrackets}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpressionInBrackets(PhraseForgeParser.LogicExpressionInBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicLogicalExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void enterLogicLogicalExpression(PhraseForgeParser.LogicLogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicLogicalExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void exitLogicLogicalExpression(PhraseForgeParser.LogicLogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicVal}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void enterLogicVal(PhraseForgeParser.LogicValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicVal}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void exitLogicVal(PhraseForgeParser.LogicValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicComparisonExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void enterLogicComparisonExpression(PhraseForgeParser.LogicComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicComparisonExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void exitLogicComparisonExpression(PhraseForgeParser.LogicComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicVarExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void enterLogicVarExpression(PhraseForgeParser.LogicVarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicVarExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_bool}.
	 * @param ctx the parse tree
	 */
	void exitLogicVarExpression(PhraseForgeParser.LogicVarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#asrt_cmp}.
	 * @param ctx the parse tree
	 */
	void enterAsrt_cmp(PhraseForgeParser.Asrt_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#asrt_cmp}.
	 * @param ctx the parse tree
	 */
	void exitAsrt_cmp(PhraseForgeParser.Asrt_cmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantMultiplyDivideExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void enterQuantMultiplyDivideExpression(PhraseForgeParser.QuantMultiplyDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantMultiplyDivideExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void exitQuantMultiplyDivideExpression(PhraseForgeParser.QuantMultiplyDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantBracketsExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void enterQuantBracketsExpression(PhraseForgeParser.QuantBracketsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantBracketsExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void exitQuantBracketsExpression(PhraseForgeParser.QuantBracketsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantOnly}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void enterQuantOnly(PhraseForgeParser.QuantOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantOnly}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void exitQuantOnly(PhraseForgeParser.QuantOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantIdentifierOnly}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void enterQuantIdentifierOnly(PhraseForgeParser.QuantIdentifierOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantIdentifierOnly}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void exitQuantIdentifierOnly(PhraseForgeParser.QuantIdentifierOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantAdditionSubtractionExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void enterQuantAdditionSubtractionExpression(PhraseForgeParser.QuantAdditionSubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantAdditionSubtractionExpression}
	 * labeled alternative in {@link PhraseForgeParser#asrt_num}.
	 * @param ctx the parse tree
	 */
	void exitQuantAdditionSubtractionExpression(PhraseForgeParser.QuantAdditionSubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#asrt_eval}.
	 * @param ctx the parse tree
	 */
	void enterAsrt_eval(PhraseForgeParser.Asrt_evalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#asrt_eval}.
	 * @param ctx the parse tree
	 */
	void exitAsrt_eval(PhraseForgeParser.Asrt_evalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forge_if}.
	 * @param ctx the parse tree
	 */
	void enterForge_if(PhraseForgeParser.Forge_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forge_if}.
	 * @param ctx the parse tree
	 */
	void exitForge_if(PhraseForgeParser.Forge_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#else_forge_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_forge_if(PhraseForgeParser.Else_forge_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#else_forge_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_forge_if(PhraseForgeParser.Else_forge_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forge_else}.
	 * @param ctx the parse tree
	 */
	void enterForge_else(PhraseForgeParser.Forge_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forge_else}.
	 * @param ctx the parse tree
	 */
	void exitForge_else(PhraseForgeParser.Forge_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forge_while}.
	 * @param ctx the parse tree
	 */
	void enterForge_while(PhraseForgeParser.Forge_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forge_while}.
	 * @param ctx the parse tree
	 */
	void exitForge_while(PhraseForgeParser.Forge_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#echo_forge}.
	 * @param ctx the parse tree
	 */
	void enterEcho_forge(PhraseForgeParser.Echo_forgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#echo_forge}.
	 * @param ctx the parse tree
	 */
	void exitEcho_forge(PhraseForgeParser.Echo_forgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forge_enh}.
	 * @param ctx the parse tree
	 */
	void enterForge_enh(PhraseForgeParser.Forge_enhContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forge_enh}.
	 * @param ctx the parse tree
	 */
	void exitForge_enh(PhraseForgeParser.Forge_enhContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forgeRange}.
	 * @param ctx the parse tree
	 */
	void enterForgeRange(PhraseForgeParser.ForgeRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forgeRange}.
	 * @param ctx the parse tree
	 */
	void exitForgeRange(PhraseForgeParser.ForgeRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forge_loop}.
	 * @param ctx the parse tree
	 */
	void enterForge_loop(PhraseForgeParser.Forge_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forge_loop}.
	 * @param ctx the parse tree
	 */
	void exitForge_loop(PhraseForgeParser.Forge_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#forge_var}.
	 * @param ctx the parse tree
	 */
	void enterForge_var(PhraseForgeParser.Forge_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#forge_var}.
	 * @param ctx the parse tree
	 */
	void exitForge_var(PhraseForgeParser.Forge_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#dec_asrt}.
	 * @param ctx the parse tree
	 */
	void enterDec_asrt(PhraseForgeParser.Dec_asrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#dec_asrt}.
	 * @param ctx the parse tree
	 */
	void exitDec_asrt(PhraseForgeParser.Dec_asrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#inc_asrt}.
	 * @param ctx the parse tree
	 */
	void enterInc_asrt(PhraseForgeParser.Inc_asrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#inc_asrt}.
	 * @param ctx the parse tree
	 */
	void exitInc_asrt(PhraseForgeParser.Inc_asrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhraseForgeParser#asrt_tern}.
	 * @param ctx the parse tree
	 */
	void enterAsrt_tern(PhraseForgeParser.Asrt_ternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhraseForgeParser#asrt_tern}.
	 * @param ctx the parse tree
	 */
	void exitAsrt_tern(PhraseForgeParser.Asrt_ternContext ctx);
}