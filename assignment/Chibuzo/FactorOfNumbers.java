public class FactorOfNumbers {

	public static void main(String[] args) {

		int number = 10;

		int factor = factorOf(number);

		System.out.println("The factors of the number is: " + factor);		

	} 

	public static int factorOf(int number) {
		
		int factorCount = 0;
		
		for (int count = 1; count <= number + 1; count++) {
			if (number % count == 0) {
				factorCount += 1;
					
			}
		}

		return factorCount;

	}
}

