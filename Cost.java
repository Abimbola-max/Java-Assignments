import java.util.Scanner;

public class Cost {

	public static void main(String[] args) {
	
		Scanner assignment = new Scanner(System.in);

		System.out.print("Enter driving distance:");
		double distance = assignment.nextDouble();
			
		System.out.print("Enter fuel efficiency in miles:");
		double fuel = assignment.nextDouble();
		
		System.out.print("Enter price of fuel:");
		double price = assignment.nextDouble();

		double costofdrivingdistance = (distance/fuel) * price;
		System.out.print("cost of driving distance is: " + costofdrivingdistance);
	}
}
