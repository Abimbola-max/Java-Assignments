import java.util.Scanner;
import java.util.Arrays;

public class StudentsGradeApp {

    static Scanner input = new Scanner(System.in);
    

    public static void main(String[] args) {
        forAllInput();
		
    }

    public static void forAllInput() {

    System.out.println("Enter the number of students in your class: ");
    int numberOfStudents = input.nextInt();


    double[][] studentScores = new double[numberOfStudents][];

    double[] totalScores = new double[numberOfStudents];

    double[] averages = new double[numberOfStudents];

    String[] studentNames = new String[numberOfStudents];


    for (int count = 0; count < numberOfStudents; count++) {
        System.out.println("Enter name for student " + (count + 1) + ": ");
        studentNames[count] = input.next();

        System.out.println("Enter number of subjects for " + studentNames[count] + ": ");
        int noOfAllSubjects = input.nextInt();
        System.out.print("Saving >>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully.");
        System.out.println();

        studentScores[count] = new double[noOfAllSubjects];

        System.out.println("Enter scores for " + studentNames[count] + ": ");


        double total = 0;

        for (int counter = 0; counter < noOfAllSubjects; counter++) {
            studentScores[count][counter] = input.nextDouble();

	System.out.print("Saving >>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully.");
        System.out.println();


            if (studentScores[count][counter] < 0 || studentScores[count][counter] > 100) {
                System.out.println("Error: Score must be between 0 and 100.");
                
                counter--;
                continue; 
            }

            total += studentScores[count][counter];
        }

        totalScores[count] = total;
        averages[count] = total / noOfAllSubjects;
    }
	 int[] positions = calculatePositions(totalScores);

        
        displayTableWithPositions(studentNames, studentScores, totalScores, averages, positions);

        displayTable(studentNames, studentScores, totalScores, averages);

	calculatePositions(totalScores);


        
        displaySummary(totalScores, averages, studentNames);
    }


    public static void displayTable(String[] names, double[][] scores, double[] totals, double[] averages) {
        System.out.println("\n--- STUDENTS SCORES TABLE ---");
        System.out.printf("%-15s%-15s%-10s%-10s\n", "Student", "Scores", "Total", "Average");
        System.out.println("---------------------------------------------------------");

        for (int count = 0; count < names.length; count++) {
            System.out.printf("%-15s", names[count]); 
            System.out.print(Arrays.toString(scores[count]) + " "); 
            System.out.printf("%-10.2f%-10.2f\n", totals[count], averages[count]); 
        }
    }

	public static int[] calculatePositions(double[] totalScores) {
    	int[] positions = new int[totalScores.length];

    	for (int count = 0; count < totalScores.length; count++) {
        positions[count] = 1; 
        for (int counter = 0; counter < totalScores.length; counter++) {
            if (count != counter && totalScores[count] < totalScores[counter]) { 

                positions[count]++; 
            }
        }
    }
    return positions;
}

    public static void displaySummary(double[] totalScores, double[] averages, String[] names) {
        System.out.println("CLASS SUMMARY");
	System.out.println("=======================================================================");

        
        double highest = totalScores[0];
        String highestStudent = names[0];

        
        double lowest = totalScores[0];
        String lowestStudent = names[0];

        double classTotal = 0; 

        for (int count = 0; count < totalScores.length; count++) {
            classTotal += averages[count]; 

            if (totalScores[count] > highest) {
                highest = totalScores[count];
                highestStudent = names[count];
            }

            if (totalScores[count] < lowest) {
                lowest = totalScores[count];
                lowestStudent = names[count];
            }
        }

        double classAverage = classTotal / totalScores.length; 


        
        System.out.println("Best graduating student is: " + highest + " (" + highestStudent + ")");
	System.out.println("=======================================================================");
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
        System.out.println("Worse graduating student is: " + lowest + " (" + lowestStudent + ")");
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	System.out.println("=======================================================================");
	System.out.println("Total number of students: " + totalScores.length);
	System.out.printf("Class total score is:%.2f\n ", classTotal);
        System.out.printf("Class average is: %.2f\n ", classAverage);
	System.out.println("=======================================================================");

}
 }