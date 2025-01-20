import java.util.Scanner; 

	public class FeetToMeters { 

		public static void main(String[] args) { 

			Scanner assignment = new Scanner(System.in); 

			System.out.print("Enter number in feet: "); 
			double feetNumber = assignment.nextDouble(); 
			
			double feetMeters = feetNumber * 0.305;  

			System.out.printf("Feet in meters is %.4f", feetMeters);  	
	} 

} 