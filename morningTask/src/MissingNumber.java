public class MissingNumber {

    public int[] getMissingNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                numbers[i] += counter;
            }
        }
        return numbers;
    }
}