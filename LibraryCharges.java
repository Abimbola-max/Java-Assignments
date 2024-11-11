import java.util.Scanner;

public class LibraryCharges {

	public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	int response;
	
	do {
		System.out.print("Enter the number of days: ");
		int numberOfDays = input.nextInt();

		if (numberOfDays == 5) {
		   System.out.println("Your fine is 50 paise");
		} else if (numberOfDays > 6 && numberOfDays < 10) {
		   System.out.println("Your fine is one rupee");
		} else if (numberOfDays > 10 && numberOfDays < 30) {
		   System.out.print("Your fine is 5 repees");
		} else {
		   System.out.println("Your membership will be cancelled");
		} 

		System.out.println("Do you wish to continue?");
		System.out.println("Press 0 to continue and -1 to quit");
	
		response = input.nextInt();
	}
	   while (response == 0);

}
    }