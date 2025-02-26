public class MissingNumbers {

    public int[] getMissingNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    counter+= 1;
                }
            }
        }
        return numbers;
    }
}
