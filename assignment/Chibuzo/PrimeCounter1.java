//import java.util.Arrays;

public class PrimeCounter1 {

	public static void main(String[] args) {
		int number = 19;
	
		int primeNumbers = primeNumber(number);
		System.out.println("The prime numbers are: " + primeNumbers);

	}

	public static int primeNumber(int number) {
		int primeCounter = 0;
		int primee = 0;

		for (int count = 2; count < number; count++) {
			if (count % number == 0) {
				primeCounter += 1;
				
			}
			if (primeCounter == 0) {
				primee += 1;
				
			}
	
		}
		return count;
	}
	

}