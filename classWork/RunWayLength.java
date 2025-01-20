import java.util.Scanner;

   public class RunWayLength {

      public static void main(String[] args) {

	Scanner task = new Scanner(System.in);

	System.out.print("Enter take off speed: ");
	double takeoff = task.nextDouble();

	System.out.print("Enter accerlration: ");
	double accerelation1 = task.nextDouble();

	double lenght = (takeoff * takeoff) / (2 * accerelation1);

	System.out.printf("The runway length needed for an airplane to take off is %.3f " , lenght);


	}
}