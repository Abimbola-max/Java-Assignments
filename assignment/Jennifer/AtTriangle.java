import java.util.Scanner;

public class AtTriangle {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	int number = input.nextInt();

	for (int count = 1; count <= number; count++) { 
	
		for (int counter = 1; counter <= number - count; counter++) {
			System.out.print(" ");
		}
			for (int counts = 1; counts <= count; counts++) {
				System.out.print("@");

			} System.out.println();
	}		
	
    }
}