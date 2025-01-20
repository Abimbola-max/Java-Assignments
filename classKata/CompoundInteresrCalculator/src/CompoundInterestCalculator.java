import java.util.Scanner;

public class CompoundInterestCalculator {

    static Scanner input = new Scanner(System.in);
    static double principal;
    static double monthlyContribution;
    static int years;
    static double estimateInterestRate;
    static double interestRateVariance;
    static int compoundFrequency;

    public static void main(String[] args) {
        allInput();
        System.out.printf("The lower bound range is:%.2f\n ", lowerRateBound(estimateInterestRate, interestRateVariance));
        System.out.printf("The upper bound range is:%.2f\n ", upperRateBound(estimateInterestRate, interestRateVariance));
        System.out.printf("Your future Amount is:%.2f\n ", investmentGrowth(principal, compoundFrequency, years, estimateInterestRate));
    }

    public static void allInput() {

        boolean allInputChecker = true;

        while (allInputChecker) {

            try {
                System.out.println("Enter the amount of money you want to invest:");
                principal = input.nextDouble();
                if (principal < 100) {
                    System.out.println("Please enter amount greater than 100");
                continue;
                }

                System.out.println("Enter your monthly contribution amount: ");
                monthlyContribution = input.nextDouble();
                if (monthlyContribution < 100) {
                    System.out.println("Please enter amount greater than 100");
                continue;
                }

                System.out.println("Enter length of time you plan to save: ");
                years = input.nextInt();
                if (years < 1 || years > 100) {
                    System.out.println("Please enter the right input");
                continue;
                }

                System.out.println("Enter your Estimated interest rate: ");
                estimateInterestRate = input.nextDouble();
                if (estimateInterestRate < 0 || estimateInterestRate > 100) {
                    System.out.println("Please enter the right input");
                continue;
                }

                System.out.println("Enter interest rate variance range: ");
                interestRateVariance = input.nextDouble();
                if (interestRateVariance < 0) {
                    System.out.println("Please enter the right input");
                continue;
                }

                System.out.print("Enter compound frequency (e.g., 12 for monthly): ");
                compoundFrequency = input.nextInt();
                if (compoundFrequency < 0) {
                    System.out.println("Please enter the right input");
                continue;
                }

                allInputChecker = false;

            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                input.nextLine();
            }
        }
    }

    public static int totalCompoundPeriods(int compoundFrequency, int years) {
        int totalCompoundPeriods = years * compoundFrequency;
        return totalCompoundPeriods;
    }

    public static double lowerRateBound(double estimateInterestRate, double interestRateVariance) {
        double lowerRateBound = estimateInterestRate - interestRateVariance;
        return lowerRateBound;
    }

    public static double upperRateBound(double estimateInterestRate, double interestRateVariance) {
        double upperRateBound = estimateInterestRate + interestRateVariance;
        return upperRateBound;
    }

    public static double rate(double estimateInterestRate , int compoundFrequency) {
        double rate = estimateInterestRate / 100;
        return rate;
    }

    public static double investmentGrowth(double principal, int compoundFrequency, int years, double estimateInterestRate) {
        double rates = rate(estimateInterestRate, compoundFrequency);
        double totalPeriods = totalCompoundPeriods(compoundFrequency, years);
        double raisedPower = Math.pow(1 + (rates/compoundFrequency), totalPeriods);
        double investmentRate = principal * raisedPower;

        return investmentRate;

    }

}