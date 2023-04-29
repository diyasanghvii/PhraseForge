/**
* Runtime is the main interpreter/runtime class for our language. It takes intermediate code, splits it instruction wise, computes and returns the output.
* @author  Diya Sanghvi , Adam Shoaib K
* @version 1.9
* @since   2023-04-24
*/

package helper;
import java.util.*;
import static helper.Consts.*;

public class Runtime {
    private Stack<HashMap<String, Types>> mem = new Stack<>();
    private List<String> iCode; // Declare a list to hold the input code
    private int PhraseForgePC = 0; // Declare and initialize the current instruction pointer
    private String res = "";  // Declare a string variable to hold the output of the program


    public Runtime(String iCode) {
        this.iCode = Arrays.asList(iCode.split("\\n"));
    }

    public void runiCode() throws Exception { // Method to run the input code
        initializeMem();

        while (PhraseForgePC < iCode.size()) { // Loop through the input code until the end is reached
            // Call the exeInstrHandler method to execute the current instruction
            PhraseForgePC = exeInstrHandler(iCode.get(PhraseForgePC), PhraseForgePC) + 1;
        }
    }

    // Method to initialize memory
    private void initializeMem() {
        mem.push(new HashMap<>());
    }

    // Method to execute instructions
    private int exeInstrHandler(String curInstr, int PhraseForgePC) throws Exception {

        String[] PFinstr = curInstr.split("\\s");
        String instrType = PFinstr[0];

        switch (instrType) { // Use a switch statement to handle different instruction types
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
            case U_NOT -> exeUNotInstr(PFinstr);
        }
        return PhraseForgePC;
    }

    // This method performs arithmetic operations based on the instruction passed as an argument
    // It takes two operands, performs the operation, and stores the result in the variable specified 
    // by the first argument of the instruction
    private void exeArithmeticInstr(String[] instr) throws Exception {

        Types left = getDataValue(instr[2]);
        Types right = getDataValue(instr[3]);
        String leftDatatype = left != null ? left.getDataType() : null;
        String rightDatatype = right != null ? right.getDataType() : null;

        if (!leftDatatype.equals(rightDatatype)) {
            throw new Exception("Data mismatch");
        } else if (!leftDatatype.equalsIgnoreCase("quant")) {
            throw new Exception("Arithmetic exception Can't be performed on logic or phrase type");
        } else {
            int leftOperand = left.dataAsInteger();
            int rightOperand = right.dataAsInteger();

            switch (instr[0]) {
                case ADDITION -> setValue(instr[1], new Types(leftOperand + rightOperand));
                case SUBTRACTION -> setValue(instr[1], new Types(leftOperand - rightOperand));
                case MULTIPLICATION -> setValue(instr[1], new Types(leftOperand * rightOperand));
                case DIVISION -> setValue(instr[1], new Types(leftOperand / rightOperand));
            }
        }
    }

    // This method performs comparison operations based on the given instruction.
    private void exeComparisonInstr(String[] instr) throws Exception {

        Types left = getDataValue(instr[2]);
        Types right = getDataValue(instr[3]);
        String leftDatatype = left != null ? left.getDataType() : null;
        String rightDatatype = right != null ? right.getDataType() : null;

        // Check for data type mismatch.
        if (!leftDatatype.equals(rightDatatype)) {
            throw new Exception("Data mismatch");
        } else if (!leftDatatype.equalsIgnoreCase("quant")) {
            String leftOperand = getValue(instr[2]).toString();
            String rightOperand = getValue(instr[3]).toString();
            switch (instr[0]) {
                case EQUAL_TO -> setValue(instr[1], new Types((leftOperand.equals(rightOperand))?"on":"off"));
                case NOT_EQUAL_TO -> setValue(instr[1], new Types((leftOperand.equals(rightOperand))?"off":"on"));
                default -> throw new Exception("Expression Type Error!");
            }
        } else {
            int leftOperand = getValue(instr[2]).dataAsInteger();
            int rightOperand = getValue(instr[3]).dataAsInteger();

            // Perform the operation based on the instruction.
            switch (instr[0]) {
                case GT -> setValue(instr[1], new Types((leftOperand > rightOperand)?"on":"off"));
                case GTE -> setValue(instr[1], new Types((leftOperand >= rightOperand)?"on":"off"));
                case LT -> setValue(instr[1], new Types((leftOperand < rightOperand)?"on":"off"));
                case LTE -> setValue(instr[1], new Types((leftOperand <= rightOperand)?"on":"off"));
                case EQUAL_TO -> setValue(instr[1], new Types((leftOperand == rightOperand)?"on":"off"));
                case NOT_EQUAL_TO -> setValue(instr[1], new Types((leftOperand != rightOperand)?"on":"off"));
            }
        }
    }

    // This method executes a block of instructions starting from the given PhraseForgePC
    // and continues until it reaches the stopCondition instruction.
    private int executionBlock(int PhraseForgePC, String stopCondition, boolean skipLastConditionCheck) throws Exception {

        while (PhraseForgePC >= 0) {
            String instr = iCode.get(PhraseForgePC);
            if (!instr.equals(stopCondition)) {
                if (!skipLastConditionCheck) {
                    PhraseForgePC = exeInstrHandler(instr, PhraseForgePC);
                }
                PhraseForgePC = PhraseForgePC + 1;
            } else {
                break;
            }
        }
        return PhraseForgePC;
    }

    // This method executes a test block in the program. 
    // It takes in a starting position in the iCode list and executes 
    // the block until the end of the conditional statement (COND_END).
    private int exeTest(int PhraseForgePC) throws Exception {

        PhraseForgePC = executionBlock(PhraseForgePC, COND_END, false);
        if (getValue(ACC_REGISTER).dataAsBoolean()) {
            PhraseForgePC = executionBlock(PhraseForgePC, TEST_END, false);
            PhraseForgePC = executionBlock(PhraseForgePC, TEST_ROUTE_END, true);
        } else {
            PhraseForgePC = executionBlock(PhraseForgePC, TEST_END, true);
        }
        return PhraseForgePC;
    }

    // This method executes a route block, which is a sequence of instructions to be executed in order. 
    private int exeRoute(int PhraseForgePC) throws Exception {
        PhraseForgePC = executionBlock(PhraseForgePC, ROUTE_END, false);
        return PhraseForgePC;
    }


    private int exeRouteTest(int PhraseForgePC) throws Exception {
        PhraseForgePC = executionBlock(PhraseForgePC, COND_END, false);
        if (getValue(ACC_REGISTER).dataAsBoolean()) {
            PhraseForgePC = executionBlock(PhraseForgePC, ROUTE_TEST_END, false);
            PhraseForgePC = executionBlock(PhraseForgePC, TEST_ROUTE_END, true);
        } else {
            PhraseForgePC = executionBlock(PhraseForgePC, ROUTE_TEST_END, true);
        }
        return PhraseForgePC;
    }

    // Executes a string instruction. 
    private void exeStrInstr(String[] instr) {
        if (instr[1].equals(ACC_REGISTER)) {
            setValue(ACC_REGISTER, getDataValue(instr[2]));
        } else {
            setValue(instr[1], getValue(instr[2]));
        }
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

    //This is a method that takes a string value and removes the first and last characters 
    // from it, assuming that the first and last characters are double quotes. 
    // This is used to clean up string values before they are stored or processed.
    private String cleanString(String value) {
        int length = value.length();
        return value.substring(1, length - 1);
    }

    // This is a method that checks whether a given string can be parsed as an integer or not.
    private boolean isInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // to check if it is string
    private boolean isString(String value) {
        return value.startsWith("@") && value.endsWith("@");
    }

    // This method retrieves the value associated with a given identifier from the memory stack. 
    private Types getValue(String identifier) {
        HashMap<String, Types> hashMap = mem.peek();
        return hashMap.get(identifier);
    }

    // This is a method to set the value of a variable in the stack
    private void setValue(String identifier, Types value) {
        HashMap<String, Types> hashMap = mem.peek();
        hashMap.put(identifier, value);
    }

    // This method implements the execution of a while loop.
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

    // This code implements the execution of a loop, where the loop is 
    // executed as long as the condition specified in the loop header 
    // (which is evaluated in the executionBlock function) is true.
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

    // the execution of the unary minus (-) operator
    private void exeUMinusInstr(String[] instr) throws Exception {
        Types operand = getDataValue(instr[1]);
        String operandDatatype = operand.getDataType();
        if (operandDatatype.equalsIgnoreCase("quant")) {
            setValue(instr[1], new Types(-1 * operand.dataAsInteger()));
        } else {
            throw new Exception("Incompatible datatype");
        }
    }

    // the execution of the unary NOT operator
    private void exeUNotInstr(String[] instr) throws Exception {
        Types operand = getDataValue(instr[2]);
        String operandDatatype = operand.getDataType();
        if (operandDatatype.equalsIgnoreCase("logic")) {
            setValue(instr[1], new Types((String.valueOf(operand).equals("off"))?"on":"off"));
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