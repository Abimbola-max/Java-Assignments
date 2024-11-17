public class MaximumNumberInArray {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("How many numbers would you like to enter? "); 
		int number = input.nextInt();
	
		System.out.println("Good! " + "Input " + number + " " +  "numbers now" );
		
		int[] arrNumber = new int[number];

		for (int count = 0; count < number; count++) {
			arrNumber[count] = input.nextInt();

		}
			int max = arrNumber[0];
			
			for (int count = 0; count < number; count++) {
				if (arrNumber[count] > max) {
					max = arrNumber[count];
				}
		
			} 
				System.out.printf("The maximum number of the array values is %d: ", max); 
	}
}