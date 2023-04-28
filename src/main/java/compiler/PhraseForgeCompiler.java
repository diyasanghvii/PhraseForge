package compiler;

import gen.PhraseForgeBaseVisitor;
import gen.PhraseForgeParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import helper.Consts;
import java.util.ArrayList;

public class PhraseForgeCompiler extends PhraseForgeBaseVisitor<Object> {

    private ArrayList<String> var = new ArrayList<>();
    private Intercode iCode = new Intercode();

    public String getInterCode() {
        return iCode.getiCode();
    }

    public void addVar(String newVar) {
        var.add(newVar);
    }

    public boolean existVar(String newVar) {
        return var.contains(newVar);
    }

    public void varDoesNotExist(String idf) {
        System.err.println("Compiletime error: Variable " + idf + " not defined. Please define " + idf + "first.");
        System.exit(1);
    }

    @Override
    public Object visitForge_pgm(PhraseForgeParser.Forge_pgmContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitPhrase_blk(PhraseForgeParser.Phrase_blkContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitForge_cmd(PhraseForgeParser.Forge_cmdContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitQuantAssignment(PhraseForgeParser.QuantAssignmentContext ctx) {
        String idf = ctx.FORGE_VAR().getText();

        if (ctx.getText().contains("quant")) {
            addVar(idf);
        } else if (!existVar(idf)) {
            varDoesNotExist(idf);
        }

        if (ctx.EQT() != null) {
            if (ctx.getText().contains("??") && ctx.getText().contains("::")) {
                visit(ctx.asrt_tern());
            } else {
                visit(ctx.asrt_num());
            }
        } else {
            iCode.insertInterOutput(Consts.STR_INSTR + " " +
                    Consts.ACC_REGISTER + " " + Consts.DEFAULT_QUANT);
        }

        iCode.insertInterOutput(Consts.STR_INSTR + " " +
                idf + " " + Consts.ACC_REGISTER);

        return null;
    }

    @Override
    public Object visitLogicAssignment(PhraseForgeParser.LogicAssignmentContext ctx) {
        String idf = ctx.FORGE_VAR().getText();

        if (ctx.getText().contains("logic")) {
            addVar(idf);
        } else if (!existVar(idf)) {
            varDoesNotExist(idf);
        }

        if (ctx.EQT() != null) {
            if (ctx.getText().contains("??") && ctx.getText().contains("::")) {
                visit(ctx.asrt_tern());
            } else {
                visit(ctx.asrt_bool());
            }
        } else {
            iCode.insertInterOutput(Consts.STR_INSTR + " " +
                    Consts.ACC_REGISTER + " " + Consts.DEFAULT_LOGIC);
        }

        iCode.insertInterOutput(Consts.STR_INSTR + " " +
                idf + " " + Consts.ACC_REGISTER);

        return null;
    }

    @Override
    public Object visitPhraseAssignment(PhraseForgeParser.PhraseAssignmentContext ctx) {
        String idf = ctx.FORGE_VAR().getText();

        if (ctx.getText().contains("phrase")) {
            addVar(idf);
        } else if (!existVar(idf)) {
            varDoesNotExist(idf);
        }

        if (ctx.EQT() != null) {
            if (ctx.getText().contains("??") && ctx.getText().contains("::")) {
                visit(ctx.asrt_tern());
            } else {
                iCode.insertInterOutput(Consts.STR_INSTR + " " +
                        Consts.ACC_REGISTER + " " + ctx.PHRASE_STR().getText());
            }
        } else {
            iCode.insertInterOutput(Consts.STR_INSTR + " " +
                    Consts.ACC_REGISTER + " " + Consts.DEFAULT_PHRASE);
        }

        iCode.insertInterOutput(Consts.STR_INSTR + " " +
                idf + " " + Consts.ACC_REGISTER);

        return null;
    }

    @Override
    public Object visitAsrts(PhraseForgeParser.AsrtsContext ctx) {
        visit(ctx.asrt_num());
        visit(ctx.asrt_bool());
        return null;
    }

    @Override
    public Object visitLogicExpressionInBrackets(PhraseForgeParser.LogicExpressionInBracketsContext ctx) {
        visit(ctx.asrt_bool());
        return null;
    }

    @Override
    public Object visitLogicVarExpression(PhraseForgeParser.LogicVarExpressionContext ctx) {

        String idf = ctx.FORGE_VAR().getText();

        if (existVar(idf)) {
            iCode.insertInterOutput(Consts.STR_INSTR + " " + Consts.ACC_REGISTER + " " + idf);
        } else {
            varDoesNotExist(idf);
        }
        return null;
    }

    @Override
    public Object visitLogicVal(PhraseForgeParser.LogicValContext ctx) {
        iCode.insertInterOutput(Consts.STR_INSTR + " " + Consts.ACC_REGISTER + " " + ctx.PHRASE_BOOL().getText());
        return null;
    }

    @Override
    public Object visitLogicLogicalExpression(PhraseForgeParser.LogicLogicalExpressionContext ctx) {

        visit(ctx.asrt_bool(0));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.R2 + " "
                + Consts.ACC_REGISTER);
        visit(ctx.asrt_bool(1));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.R3 + " "
                + Consts.ACC_REGISTER);

        switch (ctx.op.getType()) {
            case PhraseForgeParser.Logical_AND -> iCode.insertInterOutput(Consts.LOGICAL_AND + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R2 + " "
                    + Consts.R3);
            case PhraseForgeParser.Logical_OR -> iCode.insertInterOutput(Consts.LOGICAL_OR + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R2 + " "
                    + Consts.R3);
            case PhraseForgeParser.EqualTo -> iCode.insertInterOutput(Consts.EQUAL_TO + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R2 + " "
                    + Consts.R3);
            case PhraseForgeParser.NotEqualTo -> iCode.insertInterOutput(Consts.NOT_EQUAL_TO + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R2 + " "
                    + Consts.R3);
        }
        return null;
    }

    @Override
    public Object visitLogicComparisonExpression(PhraseForgeParser.LogicComparisonExpressionContext ctx) {
        visit(ctx.asrt_cmp());
        return null;
    }

    @Override
    public Object visitLogicNot(PhraseForgeParser.LogicNotContext ctx){
        visit(ctx.asrt_bool(0));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.R2 + " "
                + Consts.ACC_REGISTER);
        switch(ctx.op.getType()) {
            case PhraseForgeParser.Logical_NOT -> iCode.insertInterOutput(Consts.U_NOT + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R2);
        }
        return null;
    }

    @Override
    public Object visitQuantComparisonExpression(PhraseForgeParser.QuantComparisonExpressionContext ctx) {
        visit(ctx.asrt_num(0));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.R3+ " "
                + Consts.ACC_REGISTER);
        visit(ctx.asrt_num(1));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.R4 + " "
                + Consts.ACC_REGISTER);

        switch (ctx.op.getType()) {
            case PhraseForgeParser.GreaterThan -> iCode.insertInterOutput(Consts.GT + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R3 + " "
                    + Consts.R4);
            case PhraseForgeParser.LesserThan -> iCode.insertInterOutput(Consts.LT + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R3 + " "
                    + Consts.R4);
            case PhraseForgeParser.GreaterThanOrEqualTo -> iCode.insertInterOutput(Consts.GTE + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R3 + " "
                    + Consts.R4);
            case PhraseForgeParser.LesserThanOrEqualTo -> iCode.insertInterOutput(Consts.LTE + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R3 + " "
                    + Consts.R4);
            case PhraseForgeParser.EqualTo -> iCode.insertInterOutput(Consts.EQUAL_TO + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R3 + " "
                    + Consts.R4);
            case PhraseForgeParser.NotEqualTo -> iCode.insertInterOutput(Consts.NOT_EQUAL_TO + " "
                    + Consts.ACC_REGISTER + " "
                    + Consts.R3 + " "
                    + Consts.R4);
        }
        return null;
    }

    @Override
    public Object visitQuantMultiplyDivideExpression(PhraseForgeParser.QuantMultiplyDivideExpressionContext ctx) {

        int tree1 = 0;
        int tree2 = 1;

        String reg1 = Consts.R2;
        String reg2 = Consts.R3;

        if(ctx.asrt_num(1).getChildCount() > ctx.asrt_num(0).getChildCount()) {
            tree1 = 1; tree2 = 0;
        }

        if(!((ctx.asrt_num(1).getChildCount() > 2) && (ctx.asrt_num(0).getChildCount() > 2))) {
            reg1 = Consts.R3;
            reg2 = Consts.R4;
        }

        visit(ctx.asrt_num(tree1));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + reg1 + " " + Consts.ACC_REGISTER);
        visit(ctx.asrt_num(tree2));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + reg2 + " " + Consts.ACC_REGISTER);

        switch (ctx.op.getType()) {
            case PhraseForgeParser.Multiplication -> iCode.insertInterOutput(Consts.MULTIPLICATION + " "
                    + Consts.ACC_REGISTER + " " + reg1 + " " + reg2);
            case PhraseForgeParser.Division -> iCode.insertInterOutput(Consts.DIVISION + " "
                    + Consts.ACC_REGISTER + " " + reg1 + " " + reg2);
        }

        return null;
    }

    @Override
    public Object visitQuantAdditionSubtractionExpression(PhraseForgeParser.QuantAdditionSubtractionExpressionContext ctx) {

        int tree1 = 0;
        int tree2 = 1;

        String reg1 = Consts.R2;
        String reg2 = Consts.R3;

        if(ctx.asrt_num(1).getChildCount() > ctx.asrt_num(0).getChildCount()) {
            tree1 = 1; tree2 = 0;
        }

        if(!((ctx.asrt_num(1).getChildCount() > 2) && (ctx.asrt_num(0).getChildCount() > 2))) {
            reg1 = Consts.R3;
            reg2 = Consts.R4;
        }

        visit(ctx.asrt_num(tree1));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + reg1 + " " + Consts.ACC_REGISTER);
        visit(ctx.asrt_num(tree2));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + reg2 + " " + Consts.ACC_REGISTER);

        switch (ctx.op.getType()) {
            case PhraseForgeParser.Addition -> iCode.insertInterOutput(Consts.ADDITION + " "
                    + Consts.ACC_REGISTER + " " + reg1 + " " + reg2);
            case PhraseForgeParser.Subtraction -> iCode.insertInterOutput(Consts.SUBTRACTION + " "
                    + Consts.ACC_REGISTER + " " + reg1 + " " + reg2);
        }
        return null;
    }

    @Override
    public Object visitQuantIdentifierOnly(PhraseForgeParser.QuantIdentifierOnlyContext ctx) {

        String idf = ctx.FORGE_VAR().getText();

        if (existVar(idf)) {
            iCode.insertInterOutput(Consts.STR_INSTR + " " + Consts.ACC_REGISTER + " " + idf);
            if (ctx.Subtraction() != null) {
                iCode.insertInterOutput(Consts.U_MINUS + " " + Consts.ACC_REGISTER);
            }
        } else {
            varDoesNotExist(idf);
        }

        return null;
    }

    @Override
    public Object visitQuantBracketsExpression(PhraseForgeParser.QuantBracketsExpressionContext ctx) {
        visit(ctx.asrt_num());
        return null;
    }

    @Override
    public Object visitQuantOnly(PhraseForgeParser.QuantOnlyContext ctx) {

        if (ctx.PHRASE_NUM() != null && ctx.PHRASE_NUM().getText() != null) {
            String value = ctx.PHRASE_NUM().getText();
            int intVal = Integer.parseInt(value);
            if (ctx.Subtraction() != null) {
                intVal *= -1;
            }
            iCode.insertInterOutput(Consts.STR_INSTR + " " + Consts.ACC_REGISTER + " " + intVal);
        }

        return null;
    }

    @Override
    public Object visitAsrt_eval(PhraseForgeParser.Asrt_evalContext ctx) {
        iCode.insertInterOutput(Consts.COND_STRT);
        visit(ctx.asrt_bool());
        iCode.insertInterOutput(Consts.COND_END);
        return null;
    }

    @Override
    public Object visitForge_if(PhraseForgeParser.Forge_ifContext ctx) {

        iCode.insertInterOutput(Consts.TEST_ROUTE_STRT);
        iCode.insertInterOutput(Consts.TEST_STRT);
        visit(ctx.asrt_eval());
        visit(ctx.phrase_blk());
        iCode.insertInterOutput(Consts.TEST_END);
        for (int i = 0; i < ctx.else_forge_if().size(); i++) {
            visit(ctx.else_forge_if(i));
        }
        if (ctx.forge_else() != null) {
            visit(ctx.forge_else());
        }
        iCode.insertInterOutput(Consts.TEST_ROUTE_END);

        return null;
    }

    @Override
    public Object visitElse_forge_if(PhraseForgeParser.Else_forge_ifContext ctx) {
        iCode.insertInterOutput(Consts.ROUTE_TEST_STRT);
        visit(ctx.asrt_eval());
        visit(ctx.phrase_blk());
        iCode.insertInterOutput(Consts.ROUTE_TEST_END);
        return null;
    }

    @Override
    public Object visitForge_else(PhraseForgeParser.Forge_elseContext ctx) {
        iCode.insertInterOutput(Consts.ROUTE_STRT);
        visit(ctx.phrase_blk());
        iCode.insertInterOutput(Consts.ROUTE_END);
        return null;
    }

    @Override
    public Object visitForge_while(PhraseForgeParser.Forge_whileContext ctx) {
        iCode.insertInterOutput(Consts.WHILE_STRT);
        visit(ctx.asrt_eval());
        visit(ctx.phrase_blk());
        iCode.insertInterOutput(Consts.WHILE_END);
        return null;
    }

    @Override
    public Object visitForge_enh(PhraseForgeParser.Forge_enhContext ctx) {
        String idf = ctx.FORGE_VAR().getText();
        addVar(idf);
        visit(ctx.forgeRange(0));
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + idf + " " + Consts.ACC_REGISTER);
        iCode.insertInterOutput(Consts.LOOP_STRT);
        iCode.insertInterOutput(Consts.COND_STRT);

        String maxRange;
        if(ctx.forgeRange(1).FORGE_VAR() != null){
            maxRange = ctx.forgeRange(1).FORGE_VAR().getText();
        } else {
            maxRange = ctx.forgeRange(1).PHRASE_NUM().getText();
        }
        updateIdentifierInFor(Consts.LT, idf, maxRange);
        iCode.insertInterOutput(Consts.COND_END);
        updateIdentifierInFor(Consts.ADDITION, ctx.FORGE_VAR().getText(), "1");
        iCode.insertInterOutput(Consts.STR_INSTR + " " +
                ctx.FORGE_VAR().getText() + " " + Consts.ACC_REGISTER);
        visit(ctx.phrase_blk());
        iCode.insertInterOutput(Consts.LOOP_END);

        return null;
    }

    @Override
    public Object visitForgeRange(PhraseForgeParser.ForgeRangeContext ctx) {
        String value = "0";
        if(ctx.PHRASE_NUM() != null){
            value = ctx.PHRASE_NUM().getText();
        } else if (ctx.FORGE_VAR() != null){
            value = ctx.FORGE_VAR().getText();
        }

        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.ACC_REGISTER + " " + value);
        return null;
    }

    @Override
    public Object visitForge_loop(PhraseForgeParser.Forge_loopContext ctx) {
        visit(ctx.forge_asrt());
        iCode.insertInterOutput(Consts.LOOP_STRT);
        iCode.insertInterOutput(Consts.COND_STRT);
        visit(ctx.asrt_bool());
        iCode.insertInterOutput(Consts.COND_END);
        visit(ctx.phrase_blk());
        visit(ctx.forge_var());
        iCode.insertInterOutput(Consts.LOOP_END);
        return null;
    }

    @Override
    public Object visitForge_var(PhraseForgeParser.Forge_varContext ctx) {
        if (ctx.inc_asrt() != null) {
            visit(ctx.inc_asrt());
        } else if (ctx.dec_asrt() != null) {
            visit(ctx.dec_asrt());
        } else if (ctx.asrt_num() != null) {
            visit(ctx.asrt_num());
        }

        return null;
    }

    public void updateIdentifierInFor(String operation, String idf, String constant){
        iCode.insertInterOutput(Consts.STR_INSTR + " " +
                Consts.ACC_REGISTER  + " " + idf);
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.R4 + " " + Consts.ACC_REGISTER);
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.ACC_REGISTER + " " + constant);
        iCode.insertInterOutput(Consts.STR_INSTR + " "
                + Consts.R5 + " " + Consts.ACC_REGISTER);
        iCode.insertInterOutput(operation + " " + Consts.ACC_REGISTER + " "
                + Consts.R4 + " " + Consts.R5);
    }

    @Override
    public Object visitDec_asrt(PhraseForgeParser.Dec_asrtContext ctx) {
        updateIdentifierInFor(Consts.SUBTRACTION, ctx.FORGE_VAR().getText(), "1");
        iCode.insertInterOutput(Consts.STR_INSTR + " " +
                ctx.FORGE_VAR().getText() + " " + Consts.ACC_REGISTER);
        return null;
    }

    @Override
    public Object visitInc_asrt(PhraseForgeParser.Inc_asrtContext ctx) {
        updateIdentifierInFor(Consts.ADDITION, ctx.FORGE_VAR().getText(), "1");
        iCode.insertInterOutput(Consts.STR_INSTR + " " +
                ctx.FORGE_VAR().getText() + " " + Consts.ACC_REGISTER);
        return null;
    }

    @Override
    public Object visitAsrt_tern(PhraseForgeParser.Asrt_ternContext ctx) {

        iCode.insertInterOutput(Consts.TEST_ROUTE_STRT);
        iCode.insertInterOutput(Consts.TEST_STRT);
        visit(ctx.asrt_eval());
        // block1
        ternaryBlock(ctx, 0);
        iCode.insertInterOutput(Consts.TEST_END);
        iCode.insertInterOutput(Consts.ROUTE_STRT);
        //block2
        ternaryBlock(ctx, 1);
        iCode.insertInterOutput(Consts.ROUTE_END);
        iCode.insertInterOutput(Consts.TEST_ROUTE_END);
        return null;
    }

    public void ternaryBlock(PhraseForgeParser.Asrt_ternContext ctx, int index){
        if (ctx.asrts(index) != null){
            iCode.insertInterOutput(Consts.STR_INSTR + " "
                    + Consts.ACC_REGISTER + " " +ctx.asrts(index).getText());
        } else if (ctx.PHRASE_BOOL(index) != null){
            iCode.insertInterOutput(Consts.STR_INSTR + " "
                    + Consts.ACC_REGISTER + " " +ctx.PHRASE_BOOL(index).getText());
        } else if (ctx.PHRASE_STR(index) != null){
            iCode.insertInterOutput(Consts.STR_INSTR + " "
                    + Consts.ACC_REGISTER + " " +ctx.PHRASE_STR(index).getText());
        }
    }

    @Override
    public Object visitEcho_forge(PhraseForgeParser.Echo_forgeContext ctx) {

        if (ctx.PHRASE_STR() != null) {
            if (ctx.getText().contains(",") && ctx.FORGE_VAR() != null) {
                visit(ctx.PHRASE_STR(0));
                iCode.insertInterOutput(Consts.ECHO_INSTR + " " + ctx.PHRASE_STR(0).getText());
            } else if (ctx.PHRASE_STR(0) != null) {
                iCode.insertInterOutput(Consts.ECHO_INSTR + " " + ctx.PHRASE_STR(0).getText());
            }
        }

        if (ctx.FORGE_VAR() != null) {
            if (existVar(ctx.FORGE_VAR().getText())) {
                iCode.insertInterOutput(Consts.ECHO_INSTR + " " + ctx.FORGE_VAR().getText());
            } else {
                varDoesNotExist(ctx.FORGE_VAR().getText());
            }
        } else if (ctx.PHRASE_NUM() != null) {
            iCode.insertInterOutput(Consts.ECHO_INSTR + " " + ctx.PHRASE_NUM().getText());
        } else if (ctx.PHRASE_BOOL() != null) {
            iCode.insertInterOutput(Consts.ECHO_INSTR + " " + ctx.PHRASE_BOOL().getText());
        } else if (ctx.asrt_num() != null) {
            visit(ctx.asrt_num());
            iCode.insertInterOutput(Consts.ECHO_INSTR + " " + Consts.ACC_REGISTER);
        } else if (ctx.asrt_bool() != null) {
            visit(ctx.asrt_bool());
            iCode.insertInterOutput(Consts.ECHO_INSTR + " " + Consts.ACC_REGISTER);
        }

        return null;
    }
    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}