package complier;
public class Intercode {

    private String iCode = "";

    public void insertInterOutput(String input) {
        this.iCode = this.iCode + input + "\n";
    }

    public String getiCode() {
        return iCode;
    }

    public void setiCode(String iCode) {
        this.iCode = iCode;
    }
}