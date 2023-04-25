package helper;
import java.util.Objects;

public class Types {

    private final Object object;

    Types(Object object) {
        this.object = object;
    }

    public Integer Quant() {
        return (Integer) object;
    }

    public Boolean Logic() {
        return (Boolean) object;
    }

    public String Phrase() {
        return String.valueOf(object);
    }

    public String getDataType() {
        try {
            int i = (Integer) object;
            return "Quant";
        } catch (ClassCastException e) {
            String val = String.valueOf(object);
            if (val.equals("on") || val.equals("off")) {
                return "Logic";
            }
            return "Phrase";
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