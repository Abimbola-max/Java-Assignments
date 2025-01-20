public class SecondReverseArray {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6, 7};

		System.out.print("The original array numbers are: ");
		for (int count = 0; count < numbers.length; count++) {
			System.out.print(numbers[count] + " ");
		}
			System.out.print("\nThe reverse number is: ");
			for (int counter = numbers.length - 1; counter >= 0; counter--) {
				System.out.print(numbers[counter] + " ");

			}
	}

}