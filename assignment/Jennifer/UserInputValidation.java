import java.util.Scanner;

public class UserInputValidation {

	public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	int passes = 0;
	int failure = 0;
	int grade;

	System.out.print("Enter grade(1 for pass and 2 for fail): ");
	grade = input.nextInt();
	
	while (grade != 0) {
		if (grade == 1) {
			passes +=1;
		} else if (grade == 2) {
			failure +=1;
		} else {
			System.out.println("Invalid");
		}
	System.out.print("Enter grade(1 for pass and 2 for fail): ");
	grade = input.nextInt();

	System.out.println("passed: " + passes);
	System.out.println("failed: " + failure);
	
	} grade++;

}
	}