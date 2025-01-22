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

    public int removeElement(String element) {
        arrayList.remove((element));
        return 0;
    }

    public int getIndexOfElement(String aisha) {
        return arrayList.indexOf(aisha);
    }

    public boolean isContained(String number) {
        if (arrayList.contains(number)) {
            return true;
        }
        return false;
    }

    public int getArrayListSize() {
        return arrayList.size();
    }
}