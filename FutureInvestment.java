import java.util.Scanner;

  public class FutureInvestment {

    public static void main(String...args) {

	Scanner task = new Scanner(System.in);

	System.out.print("Enter investment amount: ");
	double investmentAmount = task.nextDouble();

	System.out.print("Enter annual interest rate: ");
	double annualInterestRate = task.nextDouble();

	System.out.print("Enter number of years: ");
	int years = task.nextInt();

	double monthlyInterest = (annualInterestRate/100)/12;
	double monthInAYear = years * 12;
	
	
	double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterest),monthInAYear);
	System.out.printf("The future investment value is %.2f", futureInvestmentValue);

}


}