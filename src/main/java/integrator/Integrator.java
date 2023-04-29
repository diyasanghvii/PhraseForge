/**
 * Integrator forms a binding between the compiler and runtime for smooth one click execution of the program.
 * @author  Diya Sanghvi
 * @version 1.0
 * @since   2023-04-26
 */
package integrator;
import compiler.Compiler;
import helper.Rmain;
public class Integrator {
    public static void main(String[] args) {

        try{
            if(args.length > 0){
                String filePath = args[0];
                Compiler compiler = new Compiler();
                compiler.runPF(filePath);

                filePath = filePath.substring(0, filePath.length()-6) + ".pra";

                System.out.println("Compiled Successfully!");
                System.out.println("Intermediate Code saved at " + filePath + "\n");

                Rmain runtime = new Rmain();
                runtime.execute(filePath);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
