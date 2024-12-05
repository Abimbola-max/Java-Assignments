import java.util.Scanner;

public class CreditCardValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
       		System.out.println("Hello, Kindly enter Card details to verify: ");
		String cardNumber = input.next();

		System.out.println("**************************************");

		if (cardNumber.startsWith("4")) {
			System.out.println("**Credit Card Type: Visa card");

		} else if (cardNumber.startsWith("5")) {
			System.out.println("**Credit Card Type: MasterCard");

		} else if (cardNumber.startsWith("37")) {
			System.out.println("**Credit Card Type: American Express cards"); 

		} else if (cardNumber.startsWith("6")) {
			System.out.println("**Credit Card Type: Discover card");
		} else {
			System.out.println("Invalid details");
		}

        if (isValid(cardNumber)) {
            System.out.println("**Credit card validity Status: " + "valid");
        } else {
            System.out.println("**Credit card validity Status: " + "invalid");
        }
	System.out.println("**Credit Card Number: " + cardNumber);
        System.out.println("**Credit Card Digit Length: " + cardNumber.length());
       System.out.println("**************************************");
   
	}
     
    public static boolean isValid(String cardNumber) {
         
        if (!(cardNumber.length() >= 13 && cardNumber.length() <= 16)) {
            return false;
        }

        int evenSum = sumOfDoubleEvenPlace(cardNumber);
        int oddSum = sumOfOddPlace(cardNumber);
        return (evenSum + oddSum) % 10 == 0;
    }

     
    public static int sumOfDoubleEvenPlace(String cardNumber) {

        int sum = 0;

        for (int countForEven = cardNumber.length() - 2; countForEven >= 0; countForEven -= 2) {
            int digit = Integer.parseInt(cardNumber.substring(countForEven, countForEven + 1));
            int doubledDigit = digit * 2;
            sum += getDigit(doubledDigit);
        }
        return sum;
    }

    
    public static int getDigit(int number) {
        if (number > 9) {
            return (number - 9);
        } else {
            return number;
        }
    }

 
    public static int sumOfOddPlace(String cardNumber) {
        int sum = 0;
        for (int countForodd = cardNumber.length() - 1; countForodd >= 0; countForodd -= 2) {
            sum += Integer.parseInt(cardNumber.substring(countForodd, countForodd + 1));
        }
        return sum;
    }
}


