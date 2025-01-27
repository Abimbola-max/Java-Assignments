package arraylist;

public class MyStack {
    
    MyArrayListMethods myStacks = new MyArrayListMethods();


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
        return myStacks.getSize();
    }

    public String peek() {
        return myStacks.elements[myStacks.size - 1];
    }
}
