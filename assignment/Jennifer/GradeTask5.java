import java.util.Scanner;

public class GradeTask5 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter grade \n1. 50\n2. 70\n3.100\n4. Any other grade \n ");
	int grade = input.nextInt();
	
	switch(grade)  {
	case 1:
		System.out.print("C");
	 break;


	case 2:
		System.out.print("B");
 		 break;

	case 3:
		System.out.print("A");
		break;

	case 4: 
		System.out.print("well done");
	}
}
     }	

