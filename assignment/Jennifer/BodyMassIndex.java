import java.util.Scanner; // import scanner from java utilities


	public class BodyMassIndex{  /** class declaration */


		public static void main(String[] args) { //main method begins execution of program


			Scanner assignment = new Scanner(System.in); /* instantiating a new object of class Scanner */

		
			System.out.print("Enter number of weight in pounds: "); //prompt the user to enter number of weight in pounds 

			double weight = assignment.nextDouble(); /** it makes easy to collect number */


			System.out.print("Enter number of height in inches: "); //prompt the user to enter number of height in inches
			double height = assignment.nextDouble(); /** it makes easy to collect number */




			double bmi = weight/ (height * height); // compute BodyMassIndex

			System.out.printf("The body mass index is %.2f", bmi);  // print result using the printf method


	} //end main method

} // end class BodyMassIndex