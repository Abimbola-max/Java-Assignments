import java.util.Arrays;

public class MorningTask {

    public int findNumber(String numbers) {
        String[] convertNumber = numbers.split(",");
        int[] array = new int[convertNumber.length];
        for (int i = 0; i < convertNumber.length ; i++) {
            array[i] = Integer.parseInt(convertNumber[i]);
        }
//        Arrays.sort(array);
        for (int i = 0; i < array.length -1; i++) {
            if(array[i+1] - array[i] != 1) {
                return array[i] + 1;
            }
        }
        throw new IllegalArgumentException("Not a number");
    }
}

