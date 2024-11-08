import java.util.Scanner;

public class GradeTask4 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter grade or -1 to quit: ");
	int grade = input.nextInt();
	
	while (grade != -1) {

	if (grade < 50) {
	System.out.println("D");
	} else if (grade >= 50 && grade <= 60) {
	System.out.println("C");
	}else if (grade > 60 && grade <= 80) {
	System.out.println("B");
	} else {
	System.out.println("A");
	}

	System.out.print("Enter grade or -1 to quit: ");
	grade = input.nextInt();
	 }
	grade++;
}
	}