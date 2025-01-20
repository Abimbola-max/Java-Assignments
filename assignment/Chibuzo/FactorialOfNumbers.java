public class FactorialOfNumbers {

	public static void main(String[] args) {
		
		int number = 8;

		int factorialOfNumber = factorialOf(number);

		System.out.printf("The factorial of the number is %d%n", factorialOfNumber);
	}


	public static int factorialOf(int number) {

		int factorial = 1;
		
		for( int count = number; count >= 1; count--) {
			factorial *= count;
		}
	
		return factorial;

	}


}