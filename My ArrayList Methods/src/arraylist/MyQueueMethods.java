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

    public String removedElement(String element) {
        int index = findIndexOf(element);
        return removeElementByIndex(index);
    }
    private String removeElementByIndex(int index){
        String removedElement = myListMethods.elements[index];
        for (int indexCounter = index; indexCounter < myListMethods.getSize() - 1; indexCounter++) {
            myListMethods.elements[indexCounter] = myListMethods.elements[indexCounter + 1];
        }
        myListMethods.elements[myListMethods.getSize() - 1] = null;
        myListMethods.size--;
        return removedElement;
    }

    public int getIndexOf(String elemment) {
        for (int index = 0; index < myListMethods.getSize() - 1; index++) {
            if (myListMethods.elements[index].equals(elemment)) return index;
        } return -1;
    }

    private int findIndexOf(String element) {
        for (int index = 0; index < myListMethods.getSize() - 1; index++) {
            if (myListMethods.elements[index].equals(element)) return index;
        }
        return -1;
    }

    public int getSize() {
       return myListMethods.getSize();
    }
}
