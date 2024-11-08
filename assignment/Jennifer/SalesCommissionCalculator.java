import java.util.Scanner;

public class SalesCommissionCalculator {

	public static void main(String... args) {
	
	Scanner input = new Scanner(System.in);

	int count = 0;
	double sum = 0.0;
	double weeklySalary = 200;
	double commissionRate = 0.09;

	while (count < 0) {
		System.out.print("Enter the values of items you sold: ");
		double totalSales = input.nextDouble();
		sum += totalSales;
	
	double commission = totalSales * commissionRate;
        double totalEarnings = weeklySalary + commission;	
	} count++;

        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Commission: $%.2f%n", commission);
        System.out.printf("Total earnings: $%.2f%n", totalEarnings);	
}
   }