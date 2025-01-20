import java.util.Scanner;

public class FinancialInterest {

	public static void main(String[] args) {

		Scanner investment = new Scanner(System.in);

		System.out.print("Enter balance:");
                double balance = investment.nextDouble();

		System.out.print("Enter annual interest rate:");
		double annualint = investment.nextDouble();

		double interest = balance * (annualint/1200);

		System.out.print("Interest for the next month: " + interest);
	}
}		