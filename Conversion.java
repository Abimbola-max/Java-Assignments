import java.util.Scanner;

public class FeetToMetersConverter {

	public static void main(String[] args) {

		Scanner converter = new Scanner(System.in);

		System.out.print("Enter the number in feet:");
		double feet = converter.nextDouble();

		double meters = feet * 0.305;

		System.out.printf("%.2f feet is equal to %.2f meters.%n", feet, meters);
	
	}
}