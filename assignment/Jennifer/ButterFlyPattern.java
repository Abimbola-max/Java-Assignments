import java.util.Scanner;

public class ButterFlyPattern {

	public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);

	 System.out.print("Enter a number: ");
	 int number1 = input.nextInt(); 
	
	for (int number = 1; number < number1; number++) {
	System.out.println();

		for(int count = 1 ; count <= number; count++) {
		System.out.print("*");
		}  
	}     

		for(int counter = number1; counter >=1; counter--) {
		System.out.println();

			for(int numbers = 1; numbers <= counter; numbers++) {
			System.out.print("*");
			}

		}



	for (int width = 1; width <= number1; width++) {
		for(int counts = 1 ; counts <= number1; counts++) {
		System.out.print(" ");
		}    

		for(int counts = 1; counts <= width; counts++) {
		System.out.print("*");

		} System.out.println();	
	}


	for (int num = 1; num < number1; num++) {
			for(int numb 1; numb <= num; numb++) {
			System.out.print("  ");
	for(int ) {


}


	}