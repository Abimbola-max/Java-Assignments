import java.util.ArrayList;

public class Multiples {

    public static int[] getMultiples(int firstNumber, int secondNumber, int thirdNumber) {
        ArrayList<Integer> multiplesList = new ArrayList<>();

        for (int index = firstNumber; index <= secondNumber; index++) {
            if (index % thirdNumber == 0) {
                multiplesList.add(index);
            }
        }
        int[] multiplesArray = new int[multiplesList.size()];
        for (int counter = 0; counter < multiplesList.size(); counter++) {
            multiplesArray[counter] = multiplesList.get(counter);
        }
       return multiplesArray;
    }

}
