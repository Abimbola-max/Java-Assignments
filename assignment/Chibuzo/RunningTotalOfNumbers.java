import java.util.Arrays;

public class RunningTotalOfNumbers {

	public static void main(String[] args) {

		int[] numbers = {1, 4, 2, 7, 1, 8, 9, 23, 12, 100};

		int[] runningTotalOfNumbers = runningTotal(numbers);
		
		System.out.println("The numbers in a list is " + Arrays.toString(numbers));

		System.out.println("The running total of the numbers are " + Arrays.toString(runningTotalOfNumbers));
	}


	public static int[] runningTotal(int[] numbers) {

		int[] runningTotal = new int[numbers.length];

		int total = 0;

		for (int count = 0; count < numbers.length; count++) {
			total += numbers[count];

			runningTotal[count] = total;			
		}

		return runningTotal;
	}
}