import java.util.Scanner;

  public class Kilogram {

    public static void main(String[] args) {

       Scanner task = new Scanner(System.in);
      
	System.out.print("Enter number in pounds: ");
	double pound = task.nextDouble();
	
	double kilograms = pound * 0454;

	System.out.printf("The rate of pounds to kilogram is %.2f", kilograms);

	}
}

