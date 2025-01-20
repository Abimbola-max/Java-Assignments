import java.util.Scanner;

public class AscendingDescendingNumbers2 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 0;

	while(count < 3) {

	  System.out.print("Enter number: ");
	  int number = input.nextInt();
	
	 	if(number < number && number < number) {
			 System.out.println("This is in descending order");
		} else {
			 System.out.println("This is in ascending order");
		} count++;
	}
	
}
   }