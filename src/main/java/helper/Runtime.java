package helper;
import java.util.*;
import static helper.Consts.*;

public class Runtime {
    private Stack<HashMap<String, Types>> mem = new Stack<>();
    private List<String> iCode;
    private int PhraseForgePC = 0;
    private String res = "";

    public Runtime(String iCode) {
        this.iCode = Arrays.asList(iCode.split("\\n"));
    }

    public void runiCode() throws Exception {
        initializeStackMemory();

        while (PhraseForgePC < iCode.size()) {
            PhraseForgePC = InstrHandler(iCode.get(PhraseForgePC), PhraseForgePC) + 1;
        }
    }

    private void initializeStackMemory() {
        mem.push(new HashMap<>());
    }

    private int InstrHandler(String curInstr, int PhraseForgePC) throws Exception {

        String[] PFinstr = curInstr.split("\\s");
        String instructionType = PFinstr[0];

        switch (instructionType) {
        }
        return 0;}

    public String getOutput() {
        return "Output";
    }
}