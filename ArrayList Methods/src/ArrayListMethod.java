import java.util.ArrayList;

public class ArrayListMethod {

    private String[] elements = new String[4];

    public boolean isEmptyTest() {
        return elements.length == 0;
    }

    public boolean isNotEmpty() {
        return false;
    }

    public String addElement(String element) {

    }

    public int removeElement(String element) {
        elements.remove((element));
        return 0;
    }

    public int getIndexOfElement(String aisha) {
        return elements.indexOf(aisha);
    }

    public boolean isContained(String number) {
        if (elements.contains(number)) {
            return true;
        }
        return false;
    }

    public int getArrayListSize() {
        return elements.size();
    }

    public String appendToAnArrayList(String number) {
        elements.add(number);
        return number + elements;
    }
}