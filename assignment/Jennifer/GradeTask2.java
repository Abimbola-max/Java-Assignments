import java.util.Scanner;

public class GradeTask2 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter grade: ");
	int grade = input.nextInt();

	if (grade < 50) {
	System.out.print("D");
	} else if (grade >= 50 && grade <= 60) {
	System.out.print("C");
	}else if (grade > 60 && grade <= 80) {
	System.out.print("B");
	} else {
	System.out.print("A");
	}
}
	}