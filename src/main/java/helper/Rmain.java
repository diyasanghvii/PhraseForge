/**
* RMain is a helper Java class that creates the final output .pge file after fetching from the runtime.
* @author  Diya Sanghvi , Adam Shoaib K
* @version 1.4
* @since   2023-04-24
*/

package helper;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Rmain {

    public void execute(String filePath) {
        try {
            CharStream iCode = CharStreams.fromFileName(filePath);
            // Create a PrintWriter to write the output to a new file
            PrintWriter pw = new PrintWriter(filePath.replace("pra", "pge"), StandardCharsets.UTF_8);
            // Create a new instance of the Runtime class and pass in the iCode
            Runtime runtime = new Runtime(iCode.toString().replaceAll("\r", ""));
            // Run the iCode
            runtime.runiCode();
            System.out.println("Output:\n" + runtime.getOutput());
            // Write the output to the PrintWriter
            pw.println("Output \n");
            pw.println(runtime.getOutput());
            pw.close();
        } catch (Exception e) {
            // Print out any exceptions that occur
            e.printStackTrace();
        }
    }
}
