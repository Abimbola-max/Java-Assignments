import java.util.Scanner;

public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your credit card numbers; ");
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
				
		
		for(int count = cardNumber.length - 1; count >= 1; count-= 2) {
			int number = count;
			if (cardNumber.length >= 13 || cardNumber.length <= 16) {
				if ((charAt(2) < 9 )) {
					number = count * 2;	
				} 
			}
	
		} 

			
	

	}
}



