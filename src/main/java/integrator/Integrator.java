package integrator;
import compiler.Compiler;
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
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
