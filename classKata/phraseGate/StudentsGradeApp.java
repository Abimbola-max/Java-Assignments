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
	    double firstMax = studentScores[0][0];

            for (int counter = 0; counter < noOfAllSubjects; counter++) {
                studentScores[count][counter] = input.nextDouble();
                total += studentScores[count][counter];
            }
		for(int counter = 0; counter < noOfAllSubjects; counter++) {
			for(int index = counter; index < noOfAllSubjects; index++) {
		if (studentScores[0][0] > firstMax) {
                    firstMax = studentScores[count][counter];
                    
                }
		}
	}
	
	    

            System.out.println("The total grade for student " + (count + 1) + " is: " + total);

            System.out.println("The average grade for student " + (count + 1) + " is: " + (double) (total / noOfAllSubjects));
		
	}
     }
}