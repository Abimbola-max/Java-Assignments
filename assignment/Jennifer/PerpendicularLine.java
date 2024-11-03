import java.util.Scanner;

public class PerpendicularLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first point: ");
        double firstXCoordinate = input.nextDouble();

        System.out.print("Enter the y-coordinate of the first point: ");
        double firstYCoordinate = input.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double secondXCoordinate = input.nextDouble();

        System.out.print("Enter the y-coordinate of the second point: ");
        double secondYCoordinate = input.nextDouble();

        if (firstXCoordinate == secondXCoordinate) {
            System.out.println("The points are located on a line perpendicular to the x-axis.");
        } else if (firstYCoordinate  == secondYCoordinate) {
            System.out.println("The points are located on a line perpendicular to the y-axis.");
        } else {
            System.out.println("The points are not located on a line perpendicular to either axis.");
        }
    }
}