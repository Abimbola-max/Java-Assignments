import java.util.Arrays;

public class DuplicateValues {

	public static void main(String[] args) {

		int[] numbers = {3, 5, 7, 2, 3, 2, 4, 7, 10};

		System.out.println("The list of array are " + Arrays.toString(numbers));
		
		System.out.print("The duplicate number in the array is: ");
		for (int count = 0; count < numbers.length; count++) {
			for (int counter = count + 1; counter < numbers.length; counter++) {
				if (numbers[count] == numbers[counter]) {
					System.out.print(numbers[count] + " ");
					break;	
				}
			}
		}



	}
}