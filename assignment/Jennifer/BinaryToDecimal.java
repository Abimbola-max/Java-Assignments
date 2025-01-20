import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number (only 0s and 1s): ");
        int binaryNumber = input.nextInt();

        int decimalValue = 0; 
        int base = 1; 

           while (binaryNumber > 0) {
		if (binaryNumber 0) {
		System.out.print("Error, enter a binary number");
		
            int lastDigit = binaryNumber % 10; 
            decimalValue += lastDigit * base; 
            base *= 2; 
            binaryNumber /= 10;
		} else {
			System.out.printf("The decimal equivalent is: %d%n", decimalValue);
		}

            }
}
   }