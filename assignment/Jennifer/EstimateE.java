import java.util.Scanner;

public class EstimateE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms to calculate for e: ");
        int terms = scanner.nextInt();

        double estimate_e = 1.0;
	int factorial = 1;

        
        for (int count = 1; count < terms; count++) {
		factorial *= count;
            estimate_e += 1.0 / factorial;
        }

        System.out.printf("Estimated value of e using %d terms: %.10f%n", terms, estimate_e);

}
   }