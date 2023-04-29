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

    public Boolean dataAsBoolean() {
        if(String.valueOf(object)=="on")
            return true;
        else if (String.valueOf(object)=="off") {
            return false;
        }
        return false;
    }

    public String Phrase() {
        return String.valueOf(object);
    }

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
        return Objects.equals(object, dataType.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return object.toString();
    }
}