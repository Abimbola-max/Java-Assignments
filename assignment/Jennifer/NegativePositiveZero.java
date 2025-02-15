import java.util.Scanner;
	
	public class  NegativePositiveZero {

		public static void main(String[] args) {

		Scanner assignment = new Scanner(System.in);

		int  count = 0;

		while(count < 3) {

		  System.out.print("Enter a number: ");
		  int number = assignment.nextInt();
				
 		  if (number > 0) {
                  System.out.println(number + " is a positive number.");
       		  } else if (number < 0) {
                  System.out.println(number + " is a negative number.");
       		  } else {
                  System.out.println("The number is zero.");
                  } count++;
	       } 
}
   }
	