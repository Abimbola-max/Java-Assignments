package arraylist;
public class MyQueueMethods {

    private int firstElement = 0;
    private int lastElement = -1;
    MyArrayListMethods myListMethods = new MyArrayListMethods();


    public boolean isEmpty() {
        return firstElement > lastElement;
    }

    public String addElementEnqueue(String number) {
        lastElement++;
        myListMethods.addElement(number);
        return number;
    }

    public void removedElement(String element) {
        for (int i = 0; i < myListMethods.getSize() - 1; i++) {
            myListMethods.elements[i] = myListMethods.elements[i + 1];
        }
        myListMethods.elements[myListMethods.getSize() - 1] = null;
        myListMethods.getSize() -= 1;
    }

    public int getIndexOf(String elemment) {
        for (int i = 0; i < myListMethods.getSize() - 1; i++) {
            if ()
        }
    }
}
