 import java.util.Scanner;

   public class BarChartPrint {

      public static void main(String[] args) {

	Scanner assignment = new Scanner(System.in);

	for (int count = 1; count <= 5; count++) {
	System.out.print("Enter number: ");
	int number = assignment.nextInt();

	for (int count1 = 1; count1 <= number; count1++) {
	System.out.print("*");
}
	}	
   
 }
}