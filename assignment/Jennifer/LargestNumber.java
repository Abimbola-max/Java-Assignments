import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int largest = 0;
	
	for(int count = 0; count < 10; count++) {
	System.out.println("Enter number: ");
	int number = input.nextInt();

		if (number > largest) {
		largest = number;
		} 
   	}System.out.print("The largest value is: " + largest);
}
   }