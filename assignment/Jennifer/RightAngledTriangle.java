import java.util.Scanner;

public class RightAngledTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the base of a triangle: ");
		int baseLength = input.nextInt();

		for(int width = 1; width <= baseLength; width++) {
		System.out.println();

			for(int number = 1; number <= width ; number++){
				System.out.print("*");
			}
		}
 		
	}
}