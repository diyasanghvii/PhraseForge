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
        initializeMem();

        while (PhraseForgePC < iCode.size()) {
            PhraseForgePC = exeInstrHandler(iCode.get(PhraseForgePC), PhraseForgePC) + 1;
        }
    }

    private void initializeMem() {
        mem.push(new HashMap<>());
    }

    private int exeInstrHandler(String curInstr, int PhraseForgePC) throws Exception {

        String[] PFinstr = curInstr.split("\\s");
        String instrType = PFinstr[0];

        switch (instrType) {
            case STR_INSTR -> exeStrInstr(PFinstr);
            case ECHO_INSTR -> exeEchoInstr(PFinstr);
            case ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION -> exeArithmeticInstr(PFinstr);
            case GT, GTE, LT, LTE, EQUAL_TO, NOT_EQUAL_TO -> exeComparisonInstr(PFinstr);
            case TEST_STRT -> PhraseForgePC = exeTest(++PhraseForgePC);
            case ROUTE_TEST_STRT -> PhraseForgePC = exeRouteTest(++PhraseForgePC);
            case ROUTE_STRT -> PhraseForgePC = exeRoute(++PhraseForgePC);
            case WHILE_STRT -> PhraseForgePC = exeWhile(++PhraseForgePC);
            case LOOP_STRT -> PhraseForgePC = exeLoop(++PhraseForgePC);
            case U_MINUS -> exeUMinusInstr(PFinstr);
            case LOGICAL_OR, LOGICAL_AND -> exeLogicInstr(PFinstr);
        }
        return PhraseForgePC;
    }

    private void exeEchoInstr(String[] instr) {
        Types printData = getDataValue(instr[1]);

        if (printData != null) {
            try {
                generateOutput(printData.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void generateOutput(String res) {
        this.res += res + "\n";
    }

    public String getOutput() {
        return this.res;
    }

    private Types getDataValue(String value) {
        if (value.equals("NULL")) {
            return null;
        } else if (isInt(value)) {
            return new Types(Integer.parseInt(value));
        } else if (value.equalsIgnoreCase("on")||value.equalsIgnoreCase("off")) {
            return new Types(value);
        } else if (isString(value)) {
            return new Types(cleanString(value));
        } else {
            return getValue(value);
        }
    }

    private String cleanString(String value) {
        int length = value.length();
        return value.substring(1, length - 1);
    }

    private boolean isInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isBoolean(String value) {
        try {
            boolean b = Boolean.parseBoolean(value);
            return b || value.equalsIgnoreCase("FALSE");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isString(String value) {
        return value.startsWith("@") && value.endsWith("@");
    }


    private Types getValue(String identifier) {
        HashMap<String, Types> hashMap = mem.peek();
        return hashMap.get(identifier);
    }

    private void setValue(String identifier, Types value) {
        HashMap<String, Types> hashMap = mem.peek();
        hashMap.put(identifier, value);
    }

    private int exeWhile(int whileStartCounter) throws Exception {
        int counter;
        do {
            counter = executionBlock(whileStartCounter, COND_END, false);
            if (getValue(ACC_REGISTER).dataAsBoolean()) {
                counter = executionBlock(counter, WHILE_END, false);
            } else {
                counter = executionBlock(counter, WHILE_END, true);
                break;
            }
        } while (true);

        return counter;
    }

    private int exeLoop(int forStartCounter) throws Exception {
        int counter;
        do {
            counter = executionBlock(forStartCounter, COND_END, false);
            if (getValue(ACC_REGISTER).dataAsBoolean()) {
                counter = executionBlock(counter, LOOP_END, false);
            } else {
                counter = executionBlock(counter, LOOP_END, true);
                break;
            }
        } while (true);

        return counter;
    }

    private void exeUMinusInstr(String[] instr) throws Exception {
        Types operand = getDataValue(instr[1]);
        String operandDatatype = operand.getDataType();
        if (operandDatatype.equalsIgnoreCase("quant")) {
            setValue(instr[1], new Types(-1 * operand.dataAsInteger()));
        } else {
            throw new Exception("Incompatible datatype");
        }
    }

    private void exeLogicInstr(String[] instr) throws Exception {

        Types left = getDataValue(instr[2]);
        Types right = getDataValue(instr[3]);
        String leftDatatype = left.getDataType();
        String rightDatatype = right.getDataType();

        if (!leftDatatype.equals(rightDatatype)) {
            throw new Exception("Data mismatch");
        } else if (leftDatatype.equals(rightDatatype) && !leftDatatype.equalsIgnoreCase("quant")) {
            switch (instr[0]) {
                case LOGICAL_AND -> setValue(instr[1], new Types((String.valueOf(left).equals("off")||String.valueOf(right).equals("off"))?"off":"on"));
                case LOGICAL_OR -> setValue(instr[1], new Types((String.valueOf(left).equals("on")||String.valueOf(right).equals("on"))?"on":"off"));
            }
        }
    }
}