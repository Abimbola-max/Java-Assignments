import java.util.Arrays;

public class ElementsInEvenPositions {

	public static void main(String[] args) {

		int[] numbers = {3, 5, 4, 7, 1, 8, 9, 23, 12};

		int[] evenPositionElement = evenPosition(numbers);
	
		System.out.println("The odd positions in the elements are " + Arrays.toString(evenPositionElement));


	}

	public static int[] evenPosition (int[] numbers) {

		int index = 0;

		int[] evenCounter = new int[numbers.length / 2];

		for (int counter = 2; counter < numbers.length; counter+=2) {
			evenCounter[index] = numbers[counter];
		index++;	
		} 
		
		return evenCounter;
	}




}