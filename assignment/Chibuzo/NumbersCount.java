import java.util.Scanner;
	
	public class NumbersCount {

		public static void main(String[] args) {

		Scanner assignment = new Scanner(System.in);

		int count = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;

		while (count < 5) {

		System.out.print("Enter a number: ");
		int number = assignment.nextInt();
		
		if (number > 0) {
		positiveCount += 1;
		}
		else if (number < 0){
		negativeCount += 1;
		}
		else {
		zeroCount += 1;
		}

		count++;


}
		System.out.println("The number of positive is: " + positiveCount);	
		System.out.println("The number of negative is: " + negativeCount);
		System.out.println("The number of zeros is: " + zeroCount);


	}
}