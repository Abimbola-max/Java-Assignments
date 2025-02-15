import java.util.Arrays;

public class PrimeCounter {

    public static void main(String[] args) {
        int number = 31;

        System.out.print("The prime numbers are: ");
        printPrimeNumbers(number);

    }

    public static void printPrimeNumbers(int number) {
        for (int count = 2; count < number; count++) {
            if (isPrime(count)) {
                System.out.print(count + " ");
            }
        }
    }
    
    public static boolean isPrime(int number) {
        int primeCounter = 0;

        for (int count = 2; count <= number/2; count++) {
            if (number % count == 0) {
                primeCounter++;
            }
        }
        
        if (primeCounter == 0) {
          return true;
        } else {
          return false;
        }
    }

}