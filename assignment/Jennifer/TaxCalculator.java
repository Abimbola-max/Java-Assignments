import java.util.Scanner;

public class TaxCalculator {

   public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int count = 1;
	while (count <= 3) { 
	   System.out.print("Enter name: ");
	   String name = input.nextLine();

	      System.out.print("Enter earnings of " + name + ": ");
	      double earnings = input.nextDouble(); input.nextLine();

		if (earnings > 30000) {
		  double taxRate1 = 0.20 * earnings;
		   System.out.println("Your total tax is: " + taxRate1);
		}
		else {
		  double taxRate2 = 0.15 * earnings;
		   System.out.println("Your total tax is: " + taxRate2);
		}
	   count++;
	}
		
  }	
}