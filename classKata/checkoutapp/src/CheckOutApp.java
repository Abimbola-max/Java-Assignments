import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CheckOutApp {

    static String cashierName;
    static double discount;
    static double newDiscountPrice;
    static String customerName;
    static double newVatPrice;
    static double totalPriceToBePaid;
    static double subTotal;
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> productNames = new ArrayList<>();
    static ArrayList<Double> productPrices = new ArrayList<>();
    static ArrayList<Integer> productQuantities = new ArrayList<>();

    public static void main(String[] args) {
        inputProductDetails();
        calculateAndDisplayTotals();
        displayInvoice();
        finalDisplayInvoice();
    }

    public static void inputProductDetails() {

        String addItem = "";

        System.out.println("Enter the customer's name: ");
        customerName = input.nextLine();

        do {

            if (!addItem.equalsIgnoreCase("no")) {
                try {
                    System.out.print("What did the user buy?: ");
                    String productName = input.nextLine();

                    System.out.print("How much per unit: ");
                    double productPrice = input.nextDouble();


                    System.out.print("How many pieces: ");
                    int quantity = input.nextInt();
                    input.nextLine();

                    System.out.print("Do you wish to add another item? press any key to continue or 'no': ");
                    addItem  = input.nextLine();


                    if (productPrice <= 0 || quantity <= 0) {
                    System.out.println("Invalid price or quantity. Please try again.");
                    continue;
                    }

                productNames.add(productName);
                productPrices.add(productPrice);
                productQuantities.add(quantity);

                } catch (InputMismatchException ex) {
                    System.out.println("Invalid input. Please enter numeric values for price and quantity.");
                    input.nextLine();
                }

            }

        } 	while (!addItem.equalsIgnoreCase("no"));
    }

    public static void displayInvoice() {
        System.out.println("BIMBOLA STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 32, KAYODE STREET, AYOBO, LAGOS");
        System.out.println("TEL: 08112727232");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName );
        System.out.println("\n=============================================================================");
        System.out.println("\t  ITEM\t  QTY  \t  PRICE  \t   TOTAL(NGN)");
        System.out.println("-------------------------------------------------------------------------------");
        for (int index = 0; index < productNames.size(); index++) {
            System.out.printf("  %s\t  %d\t %.2f\t%.2f\n",
                    productNames.get(index), productQuantities.get(index),
                    productPrices.get(index),
                    productPrices.get(index) * productQuantities.get(index));
        }
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("  \tSub Total: " + subTotal);
            System.out.println("  \tDiscount: " + newDiscountPrice);
            System.out.println("  \tVAT @ 7.50%: " + newVatPrice);
            System.out.println("\n=======================================================================");
            System.out.println("    \tBill Total: " + totalPriceToBePaid);
            System.out.println("\n=======================================================================");
            System.out.println("THIS IS NOT AN OFFICIAL RECEIPT KINDLY PAY " + totalPriceToBePaid);
            System.out.println("\n=======================================================================");


    }


    public static void calculateAndDisplayTotals() {
        double total = calculateTotal();

        System.out.println("What is your name?");
        cashierName = input.nextLine();

        System.out.print("\nHow much discount will they get?: ");
        discount = input.nextDouble();

        newDiscountPrice = total * (discount / 100);
        newVatPrice = (total - newDiscountPrice) * 0.075;
        totalPriceToBePaid = total - newDiscountPrice + newVatPrice;
    }

    public static void finalDisplayInvoice() {
        input.nextLine();
        System.out.println("How much did the customer give to you?");
        double amountPaid = input.nextDouble();

        double balance = amountPaid - totalPriceToBePaid;

        System.out.println("BIMBOLA STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 32, KAYODE STREET, AYOBO, LAGOS");
        System.out.println("TEL: 08112727232");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName );
        System.out.println("\n=============================================================================");
        System.out.println("\t  ITEM\t  QTY  \t  PRICE  \t   TOTAL(NGN)");
        System.out.println("-------------------------------------------------------------------------------");
        for (int index = 0; index < productNames.size(); index++) {
            System.out.printf("  %s\t   %d\t %.2f\t%.2f\n",
                    productNames.get(index), productQuantities.get(index),
                    productPrices.get(index),
                    productPrices.get(index) * productQuantities.get(index));
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("  \tSub Total: " + subTotal);
        System.out.println("  \tDiscount: " + newDiscountPrice);
        System.out.println("  \tVAT @ 7.50%: " + newVatPrice);
        System.out.println("\n=======================================================================");
        System.out.println("  \t%s%dBill Total:%.2f " + totalPriceToBePaid);
        System.out.printf("  \t%s%dAmount Paid:%.2f " + amountPaid);
        System.out.printf("  \t%s%dBalance:%.2f\n", balance);
        System.out.println("\n=======================================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("\n=======================================================================");


    }

    public static double calculateTotal() {
        for (int index = 0; index < productNames.size(); index++) {
            double notFinalPrice = productPrices.get(index) * productQuantities.get(index);
            subTotal += notFinalPrice;
        }
        return subTotal;
    }
}



