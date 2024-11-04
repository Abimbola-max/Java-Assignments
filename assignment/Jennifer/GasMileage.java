import java.util.Scanner;

public class GasMileage {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		int response;
		int totalGallon = 0;
		int totalMiles = 0;

		do {

		System.out.print("Enter the miles driven or -1 to quit: ");
		int miles = input.nextInt();

		System.out.print("Enter the gallon used or -1 to quit: ");
		int gallon = input.nextInt();
		
			double milesPerGallon = (miles/gallon);
			System.out.printf("The miles per gallon is %.2f", milesPerGallon);

			totalMiles += miles;
			totalGallon += gallon;

			System.out.println("Do you wish to continue?");
			System.out.println("Press 0 to continue and -1 to quit");
	
			response = input.nextInt();
	}
		while (response == 0);

   }
}

