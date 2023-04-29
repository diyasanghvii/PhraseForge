/**
* Types is a Java class that helps manipulate data and data types back and forth in the Runtime.
* @author  Diya Sanghvi , Adam Shoaib K
* @version 1.4
* @since   2023-04-23
*/

package helper;
import java.util.Objects;

public class Types {

    private final Object object;

    Types(Object object) {
        this.object = object;
    }

    public Integer dataAsInteger() {
        return (Integer) object;
    }

    // Returns the data as a boolean
    public Boolean dataAsBoolean() {
        if(String.valueOf(object)=="on")
            return true;
        else if (String.valueOf(object)=="off") {
            return false;
        }
        return false;
    }

    // Returns the data as a string
    public String Phrase() {
        return String.valueOf(object);
    }

    // Returns the data type of the object
    public String getDataType() {
        try {
            int i = (Integer) object;
            return "quant";
        } catch (ClassCastException e) {
            String val = String.valueOf(object);
            if (val.equals("on") || val.equals("off")) {
                return "logic";
            }
            return "phrase";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Types dataType = (Types) o;
        return Objects.equals(object, dataType.object); // Compares the underlying data objects for equality
    }

    @Override
    public int hashCode() {
        return Objects.hash(object); // Computes a hash code based on the underlying data object
    }

    @Override
    public String toString() {
        return object.toString(); // Returns the string representation of the underlying data object
    }
}