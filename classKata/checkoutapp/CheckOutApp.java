import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOutApp {

    	static Scanner input = new Scanner(System.in);
   	static List<String> productNames = new ArrayList<>();
    	static List<Double> productPrices = new ArrayList<>();
    	static List<Integer> productQuantities = new ArrayList<>();

   	public static void main(String[] args) {
        	inputProductDetails();
		calculateAndDisplayTotals();
		displayInvoice();
     	}

    		public static void inputProductDetails() {

			String addItem = "";		

        		do {
            			if (!addItem.equalsIgnoreCase("no")) {
					System.out.print("What did the user buy?: ");
            				String productName = input.nextLine();
            			
                			System.out.print("How much per unit: ");
                			double productPrice = input.nextDouble();

                			System.out.print("How many pieces: ");
                			int quantity = input.nextInt();
 					input.nextLine();
				
					System.out.print("Do you wish to add another item? yes or 'no': ");
            				addItem  = input.nextLine();
				

                		if (productPrice <= 0 || quantity <= 0) {
                    			System.out.println("Invalid price or quantity. Please try again.");
                    			break;
                		}

                	productNames.add(productName);
                	productPrices.add(productPrice);
                	productQuantities.add(quantity);

            		}	

           		} 	while (!addItem.equalsIgnoreCase("no")); 
		}

			public static void displayInvoice() {
        		System.out.println("\n------------- Customer Invoice -------------");
        			for (int index = 0; index < productNames.size(); index++) {
            				System.out.printf("%s\t %d = $%.2f\n",
                    productNames.get(index), productQuantities.get(index),
                    productPrices.get(index) * productQuantities.get(index));
        			}
    			}


		public static void calculateAndDisplayTotals() {
        	double total = calculateTotal();

			System.out.println("What is your name?");
			String name = input.nextLine();

        		System.out.print("\nHow much discount will they get?: ");
        		double discount = input.nextDouble();

        		double newDiscountPrice = total * (discount / 100);
        		double newVatPrice = (total - newDiscountPrice) * 0.075;
        		double totalPriceToBePaid = total - newDiscountPrice + newVatPrice;

        		System.out.printf("\nSub Total: $%.2f\n", total);
        		System.out.printf("Discount: $%.2f\n", newDiscountPrice);
        		System.out.printf("VAT @ 7.5%%): $%.2f\n", newVatPrice);
        		System.out.printf("Bill Total: $%.2f\n", totalPriceToBePaid);
    }

   	 public static double calculateTotal() {
        	double total = 0;
        	for (int index = 0; index < productNames.size(); index++) {
            		double notFinalPrice = productPrices.get(index) * productQuantities.get(index);
			total += notFinalPrice;
        	}
        	return total;
    	}
}

