import arraylist.MyArrayListMethod;

public class MyStack {
    
    MyArrayListMethod myStacks = new MyArrayListMethod();


    public boolean isMyStackEmpty() {
        return myStacks.listIsEmpty();
    }

    public String elementsAreAdded(String number) {
        return myStacks.addElement(number);
    }

    public boolean removeAndReturnsElement(String element) {
        return myStacks.isElementsRemoved(element);
    }

    public int getSizeOfMyStack(String element) {
        return myStacks.getSizeOfArrayList();
    }
}
