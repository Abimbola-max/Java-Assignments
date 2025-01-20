public class NumberSearch {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int searchNumber = 8;
        numberSearch(numbers, searchNumber);
    }

    public static int numberSearch(int[] numbers, int searchNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("Number found at index: " + i);
                return i;
            }
        }
        throw new IllegalArgumentException("Not available");
    }
}