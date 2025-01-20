import java.util.Scanner;

public class AscendingDescendingNumbers {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();

		System.out.print("Enter second number: ");
		int number2 = input.nextInt();

		System.out.print("Enter third number: ");
		int number3 = input.nextInt();
	
		if (number1 < number2 && number1 < number3) {
	        System.out.println(number1 + "<" + number2 + "<" + number3);
		System.out.println("This is in ascending order");
		} else if (number1 < number3 && number1 < number2) {
		System.out.println(number1 + "<" + number3 + "<" +number2);
		System.out.println("This is in ascending order");
		} else if (number2 < number1 && number1 < number3) {
		System.out.print(number2 + "<" + number1 + "<" + number3);
		System.out.println("This is in ascending order");
		} else if (number2 < number3 && number2 < number1) {
		System.out.println(number2 + "<" + number3 + "<"+ number1);
		System.out.println("This is in ascending order");
		} else if (number3 < number1 && number3 < number2) {
		System.out.println(number3 + "<" + number1 + "<" + number2);
		System.out.println("This is in ascending order");
		} else if (number3 < number2 && number3 < number1) {
		System.out.println(number2 + "<" + number3 + "<" + number1);
		System.out.println("This is in ascending order");	
		} else if(number1 > number2 && number1 > number3) {
	        System.out.println(number3 + "<" + number2 + "<" + number1);
		System.out.println("This is in descending order");
		} else if (number1 > number3 && number1 > number2) {
		System.out.println(number1 + ">" number3 + ">" + number2);
		System.out.println("This is in descending order");
		} else if (number2 > number1 && number2 > number3) {
		System.out.println(number2 + ">" + number1 + ">" + number3);
		System.out.println("This is in descending order");
		} else if (number2 > number3 && number2 > number1) {
		System.out.println(number2 + ">" + number3 + ">" + number1);
		System.out.println("This is in descending order");
		} else if (number3 > number1 && number3 > number2) {
		System.out.println(number3 + ">"+ number1 + ">" + number2);
		System.out.println("This is in descending order");
		} else {
		System.out.println(number2 + ">"+ number3 + ">" + number1);
		System.out.println("This is in descending order");
		}
  }
}

	



































/*
elif numberOne < number < number2:
	print(number1, number3 , number2)

elif number2 < number1 < number3:
	print(number2, number1 , number3)

elif number2 < number3 < number1:
	print(number2, number3 , number1)

elif number3 < number1 < number2:
	print(number3, number1 , number2)

else:
	print(number2, number3 , number1)

 }
}*/