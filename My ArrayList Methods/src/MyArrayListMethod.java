public class MyArrayListMethod {

    private int size = 0;
    String[] elements = new String[5];

    public boolean listIsEmpty() {
        return size == 0;
    }

    public String addElement(String element) {
        elements[size] = element;
        size++;
        return element;
    }

    public boolean isElementsRemoved(String element) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(element)) {
                size--;
            }
        } return true;
    }

    public int getSizeOfArrayList() {
        return size;
    }

    public boolean isContains(String number) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(number)) {
                return true;
            }
        } return false;
    }

    public int getIndexOf(String number) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(number)) {
                return index;
            }
        }return -1;
    }
}