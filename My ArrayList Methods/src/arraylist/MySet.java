package arraylist;


public class MySet {

    MyArrayListMethods myListMethods = new MyArrayListMethods();

    public boolean isSetEmpty() {
        return true;
    }

    public String addElement(String element) {
        return myListMethods.addElement(element);
    }

    public int getSizeOfSet(String number) {
        return myListMethods.getSizeOfArrayList();
    }

    public int getSizeOfMySet() {
        return myListMethods.getSizeOfArrayList();
    }

    public void isElementsRemoved(String element) {
        myListMethods.isElementsRemoved(element);
    }

    public int getIndexOf(String number) {
        return myListMethods.getIndexOf(number);
    }
}
