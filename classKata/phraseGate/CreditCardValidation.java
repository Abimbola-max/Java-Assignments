import java.util.Scanner;

public class CreditCardValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
       		System.out.println("Credit card numbers; ");
		String cardNumber = input.next();

		if (cardNumber.startsWith("4")) {
			System.out.println("You are using a visa card");

		} else if (cardNumber.startsWith("5")) {
			System.out.println("You are using MasterCard");

		} else if (cardNumber.startsWith("37")) {
			System.out.println("You are using American Express cards"); 

		} else if (cardNumber.startsWith("6")) {
			System.out.println("You are using Discover card");
		} else {
			System.out.println("Invalid details");
		}
	}
     
    public static int sumOfDoubleEvenPlace(String cardNumber) {
        int sum = 0;
        for (int  = cardNumber.length() - 2; countForEven >= 0; countForEven -= 2) {
            int digit = Integer.parseInt(cardNumber.substring(countForEven, countForEven + 2));
            int doubledDigit = digit * 2;
            sum += getDigit(doubledDigit);
        }
        return sum;
    }


    public static int sumOfOddPlace(String cardNumber) {
        int sum = 0;
        for (int countForEven = cardNumber.length() - 1; countForEven >= 0; countForEven -= 2) {
            sum += Integer.parseInt(cardNumber.substring(countForEven, countForEven + 1));
        }
        return sum;
    }
}


