import java.util.Arrays;

public class DifferentLoopsForSumOfNumbers {
	
	public static void main(String[] args) {

		int[] numbers = {1, 3, 5, 6,2,7, 12};

		int[] totalForLoop =  sumOfNumbers(numbers);
		int[] totalWhileLoop =  sumOfNumbers1(numbers);
		int[] totalDoWhileLoop =  sumOfNumbers2(numbers);



		System.out.println("The total of the for loop is " + Arrays.toString(totalForLoop));

		System.out.println("The total of the while loop is " + Arrays.toString(totalWhileLoop));

		System.out.println("The total of the while loop is " + Arrays.toString(totalDoWhileLoop));

	}

	public static int[] sumOfNumbers(int[] numbers) {

		int counter = 0;

		int[] total = new int[numbers.length / 7];

		for (int count = 0; count < numbers.length; count++) {
			total[counter] += numbers[count];
		
		}
		counter++;

		return total;
	}
	
	public static int[] sumOfNumbers1(int[] numbers) {

		int counter = 0;

		int[] total = new int[numbers.length / 7];

		int count = 0;

		while(count < numbers.length) {
			total[counter] += numbers[count];
		count++;
		}
		counter++;

		return total;
	}

	
	public static int[] sumOfNumbers2(int[] numbers) {

		int count = 0;
		int[] total = new int[numbers.length / 7];

		 do{
			int counter = 0;
			total[counter] += numbers[count];
		}

		while(count < numbers.length);

		return total;
	}



	

	
}