import arraylist.MyArrayListMethod;

public class MyStack {
    
    MyArrayListMethod myStacks = new MyArrayListMethod();


    public boolean isMyStackEmpty() {
        return myStacks.listIsEmpty();
    }

    public String elementsAreAdded_pushMethod(String number) {
        return myStacks.addElement(number);
    }

    public boolean removeTheElement_popMethod(String element) {
        return myStacks.isElementsRemoved(element);
    }

    public int getSizeOfMyStack() {
        return myStacks.getSizeOfArrayList();
    }
}
