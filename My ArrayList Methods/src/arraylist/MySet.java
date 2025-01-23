package arraylist;


public class MySet {

    MyArrayListMethod myListMethods = new MyArrayListMethod();

    public boolean isSetEmpty() {
        return true;
    }

    public String addElement(String element) {
        return myListMethods.addElement(element);
    }

    public int getSizeOfSet(String number) {
        return myListMethods.getSizeOfArrayList();
    }
}
