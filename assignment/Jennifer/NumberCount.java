import java.util.Scanner;
	
	public class  NumberCount {

		public static void main(String[] args) {

		Scanner assignment = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = assignment.nextInt();

		System.out.print("Enter second number: ");
		int number2 = assignment.nextInt();

		System.out.print("Enter third number: ");
		int number3 = assignment.nextInt();

		System.out.print("Enter fourth number: ");
		int number4 = assignment.nextInt();


		System.out.print("Enter fifth number: ");
		int number5 = assignment.nextInt();



		
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;

		if (number1 > 0) positiveCount++;
		if (number1 < 0) negativeCount++;
		if (number1 == 0) zeroCount++;

		if (number2 > 0) positiveCount++;
		if (number2 < 0) negativeCount++;
		if (number2 == 0) zeroCount++;

		if (number3 > 0) positiveCount++;
		if (number3 < 0) negativeCount++;
		if (number3 == 0) zeroCount++;

		if (number4 > 0) positiveCount++;
		if (number4 < 0) negativeCount++;
		if (number4 == 0) zeroCount++;

		if (number5 > 0) positiveCount++;
		if (number5 < 0) negativeCount++;
		if (number5 == 0) zeroCount++;

	System.out.println("The number of positive number: " + positiveCount);
	System.out.println("The number of negative number: " + negativeCount);
	System.out.println("The number of zero numbers: " + zeroCount);


	}
}











		

	