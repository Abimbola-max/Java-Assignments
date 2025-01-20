public class NumberOccurrence {

	public static void main(String[] args) {

		int[] numbers = {2, 5, 6, 8, 3, 10, 3};

		int searchElement = 11;

		boolean isFound = isOccurrence(numbers, searchElement);

		System.out.println("Is" + " " +  searchElement + " " + "in the list?" + " " + isFound);

		
	}



	public static boolean isOccurrence(int[] numbers, int searchElement) {

		for (int count = 0; count < numbers.length; count++) {
			if (searchElement == numbers[count]) {
				return true;	
			}
				
		}
		return false; 

	}
	

	
}