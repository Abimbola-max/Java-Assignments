package arraylist;

import java.util.ArrayList;

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
}
