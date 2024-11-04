import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your account number: ");
	double accountNumber = input.nextDouble();

	System.out.print("Enter your balance at the beginning of the month:  ");
	int balance  = input.nextInt();

	System.out.print("Enter total items changed this month: ");
	int  totalItemsCharged = input.nextInt();

	System.out.print("Enter total of credit applied to your account this month: ");
	int  totalCredit = input.nextInt();

	System.out.print("Enter your credit limit: ");
	int  creditLimit = input.nextInt();

	int newBalance = balance + totalItemsCharged - totalCredit;

	System.out.printf("Your new balance is %d%n", newBalance);

	if ( newBalance > creditLimit);
	System.out.print("Credit limit exceeded");

}
   }