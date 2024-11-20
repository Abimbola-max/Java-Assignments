import java.util.Scanner;

public class GradeCheckerForMarks {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your Grade ranks\n1. 70 - 100\n2. 60-69\n3. 59-50\n4. 49-40\n5. 39 - 30\n6. 29-0 \nEnter a grade you want to check\n>>>> ");
		int grade = input.nextInt();

		switch(grade) {
				case 1:
					
						System.out.print("Your grade is A");
					break;
				case 2:
					
						System.out.print("Your grade is B");
					break;
	
				case 3:
					
						System.out.print("Your grade is C");
					break;

				case 4:
					
						System.out.print("Your grade is D");
					break;

				case 5:
					
						System.out.print("Your grade is E");
					break;

				case 6:
					
						System.out.print("Your grade is F");
					break;

				default:
					System.out.print("Enter valid input my bro!");break;

		}
		

}
	}