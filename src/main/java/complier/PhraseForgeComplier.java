package compiler;

import gen.PhraseForgeBaseVisitor;
import gen.PhraseForgeParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import runtimeUtility.Constants;

import java.util.ArrayList;

public class PhraseForgeCompiler extends PhraseForgeBaseVisitor<Object> {

    private ArrayList<String> variableList = new ArrayList<>();
    private Intercode iCode = new Intercode();

    public String getOutput() {
        return iCode.getIntercode();
    }

    public void addVariableToList(String namedVariable) {
        variableList.add(namedVariable);
    }

    public boolean doesVariableExist(String namedVariable) {
        return variableList.contains(namedVariable);
    }

    public void missingVariableError(String identifier) {
        System.err.println("Compiletime error: Variable " + identifier + " not defined. Did you forget to declare variable " + identifier + "?");
        System.exit(1);
    }

    @Override
    public Object visitForge_pgm(PhraseForgeParser.Forge_pgmContext ctx) {
        // Code for pf_launch
        iCode.addInstruction("pf_launch");

        // Visit phrase_blk
        visit(ctx.phrase_blk());

        // Code for pf_abort
        iCode.addInstruction("pf_abort");

        return null;
    }

    @Override
    public Object visitPhrase_blk(PhraseForgeParser.Phrase_blkContext ctx) {
        // Code for opening bracket
        iCode.addInstruction("{");

        // Visit forge_cmd+
        for (PhraseForgeParser.Forge_cmdContext forgeCmdContext : ctx.forge_cmd()) {
            visit(forgeCmdContext);
        }

        // Code for closing bracket
        iCode.addInstruction("}");

        return null;
    }

    @Override
    public Object visitForge_if(PhraseForgeParser.Forge_ifContext ctx) {
        // Code for 'test'
        iCode.addInstruction("test");

        // Visit asrt_eval
        visit(ctx.asrt_eval());

        // Visit phrase_blk
        visit(ctx.phrase_blk());

        // Visit else_forge_if*
        for (PhraseForgeParser.Else_forge_ifContext elseForgeIfContext : ctx.else_forge_if()) {
            visit(elseForgeIfContext);
        }

        // Visit forge_else?
        if (ctx.forge_else() != null) {
            visit(ctx.forge_else());
        }

        // Code for 'forge-test'
        iCode.addInstruction("forge-test");

        return null;
    }

    @Override
    public Object visitElse_forge_if(PhraseForgeParser.Else_forge_ifContext ctx) {
        // Code for 'routeTest'
        iCode.addInstruction("routeTest");

        // Visit asrt_eval
        visit(ctx.asrt_eval());

        // Visit phrase_blk
        visit(ctx.phrase_blk());

        // Code for 'forge-routeTest'
        iCode.addInstruction("forge-routeTest");

        return null;
    }

    @Override
    public Object visitForge_else(PhraseForgeParser.Forge_elseContext ctx) {
        // Code for 'route'
        iCode.addInstruction("route");

        // Visit phrase_blk
        visit(ctx.phrase_blk());

        // Code for 'forge-route'
        iCode.addInstruction("forge-route");

        return null;
    }
}
