import java.util.Scanner;

public class StudentsGradeApp {

    static Scanner input = new Scanner(System.in);
    static int numberOfStudents;
    static int noOfAllSubjects;
    static double total = 0;

    public static void main(String[] args) {
        forAllInput();
	sampleTable();
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

            for (int counter = 0; counter < noOfAllSubjects; counter++) {
                studentScores[count][counter] = input.nextDouble();
                total += studentScores[count][counter];
            }

		System.out.println("The total grade for student " + (count + 1) + " is: " + total);

            System.out.println("The average grade for student " + (count + 1) + " is: " + (double)(total/noOfAllSubjects));
        }
    }

	public static void sampleTable() {
	
	System.out.print("=====================================\n");
	System.out.print("STUDENT\tSUB1\tSUB2\tSUB3\tTOT\tAVE\tPOS\n");
	System.out.print("=====================================\n");


	}


}