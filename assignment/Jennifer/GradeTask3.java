import java.util.Scanner;

public class GradeTask3 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 0;
	
	while (count < 5) {

		System.out.print("Enter grade: ");
		int grade = input.nextInt();
		count++;

		if (grade < 50) {
		System.out.println("D");
		} else if (grade >= 50 && grade <= 60) {
		System.out.println("C");
		}else if (grade > 60 && grade <= 80) {
		System.out.println("B");
		} else {
		System.out.println("A");
		}
	 }

}
	}