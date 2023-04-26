package helper;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Rmain {

    public void execute(String filePath) {
        try {
            CharStream iCode = CharStreams.fromFileName(filePath);
            PrintWriter pw = new PrintWriter(filePath.replace("pra", "pge"), StandardCharsets.UTF_8);
            Runtime runtime = new Runtime(iCode.toString().replaceAll("\r", ""));
            runtime.runiCode();
            System.out.println("Display output here:\n" + runtime.getOutput());
            pw.println("Output is  :  \n");
            pw.println(runtime.getOutput());
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}