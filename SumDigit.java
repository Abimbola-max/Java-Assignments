import java.util.Scanner; 

		public class SumDigit {  

			public static void main(String[] args) { 

			Scanner assignment = new Scanner(System.in);  
		
			System.out.print("Enter number from 0-1000: "); 
			int number1 = assignment.nextInt();

			int firstNumber = (number1 / 100); 
			int secondNumber = (number1 / 10) % 10; 
			int thirdNumber = (number1 % 10);  

			int sumofDigits = firstNumber + secondNumber + thirdNumber; 

		System.out.println("The sum of digits: " + sumofDigits); 

	} 
} 