import java.util.Scanner;

  public class BodyMassIndex1 {

    public static void main(String[] args) {

       Scanner task = new Scanner(System.in);
      
	System.out.print("Enter weight in pounds: ");
	double weight = task.nextDouble();

	System.out.print("Enter height in inches: ");
	double height = task.nextDouble();

	double weightInPounds = weight * 0.45359237;
	double heightInInches = height * 0.0254;

	double bmi = weightInPounds / (heightInInches * heightInInches);

	System.out.printf("Body mass index is %.4f", bmi);

	}
}