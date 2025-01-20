import java.util.Scanner;

public class AnnualIncome {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter annual income: ");
		int annualIncome = input.nextInt();

		if (annualIncome <= 9875) {
			double firstTaxRate = (0.10 * annualIncome);
			System.out.print("Your tax rate is: " + firstTaxRate);
		} else if (annualIncome >= 9876 && annualIncome <= 40125) {
			double secondTaxRate = (0.12 * annualIncome);
			System.out.print("Your tax rate is: " + secondTaxRate);
		} else if (annualIncome >= 40126  && annualIncome <= 85525) {
			double thirdTaxRate = (0.22 * annualIncome);
			System.out.print("Your tax rate is: " + thirdTaxRate);
		} else {
			double lastTaxRate = (0.24 * annualIncome);
			System.out.print("Your tax rate is: " + lastTaxRate);
		}
	}
}