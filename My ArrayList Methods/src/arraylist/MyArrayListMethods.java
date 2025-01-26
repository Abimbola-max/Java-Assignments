package arraylist;

public class MyArrayListMethods {

    public int size = 0;
    String[] elements = new String[5];

    public boolean listIsEmpty() {
        return size == 0;
    }

    public String addElement(String element) {
        if (isFull()) increaseCapacity();
        elements[size] = element;
        size++;
        return element;
    }

    private void increaseCapacity() {
        elements = new String[size * 2];
    }

    private boolean isFull() {
        if(size == elements.length) {
            return true;
        } return false;
    }

    public boolean isElementsRemoved(String element) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(element)) {
                size--;
            }
        } return true;
    }

    public int getSize() {
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
        } return -1;
    }

    public void insertAtAnIndex(String element, int index) {
        for (int i = getSize()-1; i >= index; i--) {
            elements[i + 1] = elements[i];
            size++;
        }
        elements[index] = element;
    }
}