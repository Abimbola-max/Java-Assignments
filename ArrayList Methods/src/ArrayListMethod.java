import java.util.ArrayList;

public class ArrayListMethod {

    private ArrayList<String> arrayList = new ArrayList<>();

    public boolean isEmpty() {
        return true;
    }

    public boolean isNotEmpty() {
        return false;
    }

    public String addElement(String element) {
        arrayList.add(element);
        return element;
    }
}