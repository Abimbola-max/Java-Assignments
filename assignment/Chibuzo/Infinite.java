import java.util.Scanner;

public class Infinite {

    public static void main(String[] args) {

	Scanner assignment = new Scanner(System.in);


	System.out.println("Enter any number of your choice or -1 to stop");
	double number = assignment.nextDouble();

	double largest = number;
	double smallest = number;

	while (number != -1){

	System.out.println("Enter any number of your choice or -1 to stop");
	 number = assignment.nextDouble();

	if (number > largest && number != -1)
	largest = number;

	if (number < smallest && number != -1)
	smallest = number;
								
}
	System.out.print("The smallest number is :" + smallest);
								System.out.print("The largest number is :" + largest);
	}

}