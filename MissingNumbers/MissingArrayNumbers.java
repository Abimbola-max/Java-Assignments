public class MissingArrayNumbers {

    public static int[] getMissingNumbers(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] < min) {
                min = numbers[index];
            } else if (numbers[index] > max) {
                max = numbers[index];
            }
        }

        boolean[] existingNumbers = new boolean[max - min + 1];
        for (int number : numbers) {
            existingNumbers[number - min] = true;
        }

        int missingNumbersCount = 0;
        for (boolean exist : existingNumbers) {
            if (exist == false) {
                missingNumbersCount++;
            }
        }

        int[] missingNumbers = new int[missingNumbersCount];
        int index = 0;
        for (int counter = 0; counter < existingNumbers.length; counter++) {
            if (existingNumbers[counter] == false) {
                missingNumbers[index++] = min + counter;
            }
        }

        return missingNumbers;
    }
}
