import java.util.Scanner;

public class HalfDiamondTriangle {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	int number = input.nextInt();

	for (int count= 1; count <= number; count++) {
		System.out.println();
		for (int counter = 1; counter <= count; counter++) {
			System.out.print(counter);
		}
	}

	for (int count = 1; count < number; count++) {
		System.out.println();
			for (int counter = count; counter < number; counter++) {
				System.out.print(counter + 1 - count);
			}	
			
					
		}
	}
   }		

