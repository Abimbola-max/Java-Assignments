import java.util.Scanner;

public class StudentsGradeApp {

    static Scanner input = new Scanner(System.in);
    static int numberOfStudents;
    static int noOfAllSubjects;

    public static void main(String[] args) {
        forAllInput();
    }

    public static void forAllInput() {
       
        System.out.println("Enter the number of pupils in your class: ");
        numberOfStudents = input.nextInt();


        double[][] studentScores = new double[numberOfStudents][]; 

        
        for (int count = 0; count < numberOfStudents; count++) {

            System.out.println("Enter number of subjects for student" + (count + 1)+ ": ");

            noOfAllSubjects = input.nextInt();

            
        }

      
        }
}





























