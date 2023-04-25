package compiler;
import gen.PhraseForgeLexer;
import gen.PhraseForgeParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compiler {
    public void runPF(String pgmPath) {
        try {
            CharStream inpCode = CharStreams.fromFileName(pgmPath);
            PhraseForgeLexer lexer = new PhraseForgeLexer(inpCode);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PhraseForgeParser parser = new PhraseForgeParser(tokens);
            ParseTree pTree = parser.forge_pgm();
            PhraseForgeCompiler compiler = new PhraseForgeCompiler();
            //pass compiled code later
            List<String> iCode= new ArrayList<String>();
            System.out.println("Compile time: No of lines in intermediate code - " + iCode.size());
            if (iCode.size() > 0) {
                PrintWriter pw = new PrintWriter(pgmPath.replace(".prage", "pra"), StandardCharsets.UTF_8);
                for (String line : iCode) {
                    pw.println(line);
                }
                pw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}