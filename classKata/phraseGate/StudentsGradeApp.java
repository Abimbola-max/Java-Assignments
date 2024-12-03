import java.util.Scanner;

public class StudentsGradeApp {

    static Scanner input = new Scanner(System.in);
    static int numberOfStudents;
    static int noOfAllSubjects;

    public static void main(String[] args) {
        forAllInput();
        
    }

    public static void forAllInput() {

        System.out.println("Enter the number of students in your class: ");
        numberOfStudents = input.nextInt();

        double[][] studentScores = new double[numberOfStudents][];

        for (int count = 0; count < numberOfStudents; count++) {

            System.out.println("Enter number of subjects for student" + (count + 1) + ": ");
            noOfAllSubjects = input.nextInt();

            studentScores[count] = new double[noOfAllSubjects];

            System.out.println("Enter scores for student " + (count + 1) + ": ");

            
            double total = 0; 

            for (int counter = 0; counter < noOfAllSubjects; counter++) {
                studentScores[count][counter] = input.nextDouble();
                total += studentScores[count][counter];
            }
		for

            System.out.println("The total grade for student " + (count + 1) + " is: " + total);

            System.out.println("The average grade for student " + (count + 1) + " is: " + (double) (total / noOfAllSubjects));
	
	System.out.print("=====================================\n");
	System.out.print("STUDENT\tSUB1\tSUB2\tSUB3\tTOT\tAVERAGE\n");
	System.out.print("=====================================\n");
	System.out.print("student1\t\tSUB2\tSUB3\tTOT\tAVERAGE\n");
	System.out.print("student1\t\tSUB2\tSUB3\tTOT\tAVERAGE\n");
	System.out.print("student1\t\tSUB2\tSUB3\tTOT\tAVERAGE\n");


		
	}
     }
}