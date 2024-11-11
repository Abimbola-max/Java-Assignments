import java.util.Scanner;

public class LibraryCharges1 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	
		System.out.print("Enter number of days: ");
		int numberOfDays = input.nextInt();

		if (numberOfDays == 5) {
		   System.out.print("Your fine is 50 paise");
		} else if (numberOfDays > 6 && numberOfDays < 10) {
		   System.out.print("Your fine is one rupee");
		} else if (numberOfDays > 10 && numberOfDays < 30){
		   System.out.print("Your fine is 5 repees");
		} else {
		   System.out.print("Your membership will be cancelled");
		} 
	}
}


