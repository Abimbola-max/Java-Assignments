import java.util.Arrays;

public class ReversedNumbers {

	public static void main(String[] args) {

		int[] numbers = {4, 2, 5, 7, 9, 10, 1, 23};

		int[] reversedNumbers = reversedNumbers(numbers);
		
		
		System.out.print("The reversed array is " + Arrays.toString(reversedNumbers));
	
	}
	

	public static int[] reversedNumbers(int[] numbers) {

		int[] reversedNumbers = new int[numbers.length];
		int count = 0;
			
		for (int counter = numbers.length -1 ; counter >= 0; counter--) {
		 	reversedNumbers[count] = numbers[counter];	
			count++;
				
		}
		return reversedNumbers;

	}


}