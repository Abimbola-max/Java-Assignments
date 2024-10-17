import java.util.Scanner; // import scanner from java utilities package

	public class FeetToMeters {  /** class declaration */

		public static void main(String[] args) { //main method begins execution of program

			Scanner assignment = new Scanner(System.in); /* instantiating a new object of class Scanner */

			System.out.print("Enter number in feet: "); // prompt the user to enter number in feet 
			double feetNumber = assignment.nextDouble(); /** it makes easy to collect number and store */
			
			double feetMeters = feetNumber * 0.305;  // compute feetMeters

			System.out.printf("Feet in meters is %.4f", feetMeters);  // print result using the printf method
	
	} // end main method

} //end class FeetToMeters