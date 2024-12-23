import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeApplication {

    public static void main(String[] args) {
        dataAndTableFunction();
    }

    public static void dataAndTableFunction() {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {

            try {
                System.out.print("Enter the number of students: ");
                int numberOfStudents = input.nextInt();

                System.out.print("Enter the number of subjects they offer: ");
                int numberOfSubjects = input.nextInt();

                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved Successfully.");
                System.out.println();

                String[] nameOfStudents = new String[numberOfStudents];
                double[][] scores = new double[numberOfStudents][numberOfSubjects];
                double[] totalScores = new double[numberOfStudents];
                double[] averageScores = new double[numberOfStudents];
                int[] positions = new int[numberOfStudents];

                
                for (int count = 0; count < numberOfStudents; count++) {
                    System.out.print("Enter the name of student " + (count + 1) + ": ");
                    nameOfStudents[count] = input.next();

                    for (int counter = 0; counter < numberOfSubjects; counter++) {
                        System.out.print("Enter score for subject " + (counter + 1) + ": ");
                        scores[count][counter] = input.nextDouble();
                        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println("Saved Successfully.");
                        System.out.println();

                        while (scores[count][counter] < 1 || scores[count][counter] > 100) {
                            System.out.println("Invalid score. Enter a score between 1 and 100: ");
                            scores[count][counter] = input.nextDouble();
                        }
                        totalScores[count] += scores[count][counter]; 
                    }

                    averageScores[count] = totalScores[count] / numberOfSubjects;
                }

                
                for (int count = 0; count < numberOfStudents; count++) {
                    positions[count] = 1; 
                    for (int counter = 0; counter < numberOfStudents; counter++) {
                        if (averageScores[count] < averageScores[counter]) { 
                            positions[count]++;
                        }
                    }
                }

                
                System.out.println("\n--- STUDENTS SCORES TABLE ---");
                System.out.println("=========================================================================");
                System.out.print("STUDENTS\t");
                
               
                for (int count = 0; count < numberOfSubjects; count++) { 
                    System.out.print("Sub" + (count + 1) + "\t"); 
                }
                System.out.println("TOTAL\tAVE\tPOS");
                System.out.println("=========================================================================");

                
                for (int dataCount = 0; dataCount < numberOfStudents; dataCount++) {
                    System.out.printf("%-15s\t", nameOfStudents[dataCount]); 

                    
                    for (int subScoreCount = 0; subScoreCount < numberOfSubjects; subScoreCount++) {
                        System.out.printf("%.2f\t", scores[dataCount][subScoreCount]);  
                    }

                    System.out.printf("%.2f\t%.2f\t%d\n", totalScores[dataCount], averageScores[dataCount], positions[dataCount]);
                }

                System.out.println("=========================================================================");

                
                System.out.print("Do you want to enter data for another set of students (yes/no)? ");
                String response = input.next();
                if (response.equalsIgnoreCase("no")) {
                    continueInput = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Incorrect input type. Please enter integers for student and subject counts, and numbers for scores.");
                input.nextLine(); 
            }

        } 
     
    } 
}
