






Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user.


import java.util.Scanner;

public class Population {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		int numberOfTrip = 0;
		int totalGallon = 0;
		int totalMiles = 0;

		do {

		System.out.print("Enter the miles driven or -1 to quit: ");
		int miles = input.nextInt();

		System.out.print("Enter the gallon used or -1 to quit: ");
		int gallon = input.nextInt();
		
			if (miles != =1 ) {
		   		System.out.print("Enter gallons used for trip: ");
				miles = input.nextInt();


			double milesPerGallon = (miles/gallon);
			System.out.printf("The miles per gallon is %.2f", milesPerGallon);

			totalMiles += miles
			totalGallon += gallon

			}
		while (milesDriven != -1); 
		}
				
}
	}
		


