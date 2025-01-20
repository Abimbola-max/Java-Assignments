public class PrimeNumbers1 {

	public static void main(String[] args) {

		int number = 22;
		
		boolean isPrimeNumber = isPrimeNumber(number);
		
		if (isPrimeNumber) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}


	public static boolean isPrimeNumber(int number) {
		int prime_counter = 0;

		for(int count = 2; count < number; count++) {
			if (number % count == 0) {
				prime_counter += 1;
			}
		}

			if (prime_counter  == 0) {
			return true;

			} else {
			return false;
			}

	}	


}
