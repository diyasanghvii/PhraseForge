/**
* This Java class is simply a collection of getter files used by the compiler
* @author  Diya Sanghvi , Adam Shoaib K
* @version 1.3
* @since   2023-04-24
*/

package compiler;
public class Intercode {

    // "iCode" which is a String that stores the intermediate code.
    private String iCode = "";

    // This is a method named "insertInterOutput" which takes a String parameter named "input".
    // The method appends the input String to the existing intermediate code with a new line character.
    public void insertInterOutput(String input) {
        this.iCode = this.iCode + input + "\n";
    }

    // This is a getter method for the private instance variable "iCode".
    // The method returns the intermediate code String.
    public String getiCode() {
        return iCode;
    }

    // This is a setter method for the private instance variable "iCode".
    // The method sets the intermediate code String to the input parameter "iCode".
    public void setiCode(String iCode) {
        this.iCode = iCode;
    }
}