import java.util.Arrays;

public class ElementsInOddPositions {

	public static void main(String[] args) {

		int[] numbers = {3, 5, 4, 7, 1, 8, 9};

		int[] oddPositionElement = oddPosition(numbers);
	
		System.out.println("The odd positions in the elements are " + Arrays.toString(oddPositionElement));


	}

	public static int[] oddPosition (int[] numbers) {

		int index = 0;

		int[] oddCounter = new int[numbers.length / 2];

		for (int counter = 1; counter < numbers.length; counter+=2) {
			oddCounter[index] = numbers[counter];
		index++;	
		} 
		
		return oddCounter;
	}




}