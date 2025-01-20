import java.util.Scanner;

public class PerfectNumber1 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int count = 1;
	
	do {  
		System.out.print("Enter a number: ");
		number = input.nextInt();

		if (number % count == 0) {
			sum += count;
		 }
		
		if (sum != count) {
		System.out.println("It is not perfect number");
			} else {
		System.out.println("It is a perfect number");
			}	
	} while(count != number);			
}
   }