import java.util.Scanner;

public class WorkerEfficiency {

	public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter time taken: ");
	double timeTaken = input.nextDouble();

	if (timeTaken < 2 && timeTaken < 3) {
		System.out.print("You are highly efficient.");
	} else if (timeTaken >= 3 && timeTaken  <= 4) {
		System.out.print("You need to improve your speed");
	} else if (timeTaken >= 4 && timeTaken <= 5) {
		System.out.print("You need training");
	} else {
		System.out.print("Leave the company"); 
	}

}
   }

	

	

	


	