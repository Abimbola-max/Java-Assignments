import java.util.Scanner;

public class ATMachineApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 0.0;
        String accountName = "";
	int option = 0;
        int pin = 0;
  
        int inputPin;

	
	//long accountNumber = (int)(Math.random() * 10000000000L);
        
        while (option != 8) {

            System.out.println("Welcome to the ATM!");
            System.out.println("1. Account Name");
            System.out.println("2. Create your pin");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Change Pin");
            System.out.println("7. Transfer to another account");
            System.out.println("8. Exit\n");


            System.out.print("Choose an option: ");
            option = input.nextInt();
            input.nextLine();  

            switch (option) {
                case 1:
                    
                    System.out.print("Enter your First and Last name: ");
                    accountName = input.nextLine();
                    System.out.println("Account name set to: " + accountName);
                    break;

                case 2:
                 
                    System.out.print("Enter your pin: ");
                    pin = input.nextInt();

			if (pin > 1 || pin == 4) {
				System.out.println("Pin set successfully.");
			} else {
                    System.out.println("Please set your pin to 4 numbers");
			}
                    break;

               case 3:
		 System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited: $" + depositAmount);
                    } else {
                        System.out.println("Please enter a valid amount.");
                    }
                    break;

                case 4:
                   
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn: $" + withdrawAmount);
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 5:
                  
                   	 System.out.println("Current balance: $" + balance);
                   	 break;

                case 6:
			boolean pinValidator = true;
			while(pinValidator) {

               		try {

                    	System.out.print("Enter your old pin: ");
                    	int oldPin = input.nextInt();
                    	if (oldPin == pin) {
                        	System.out.print("Enter your new pin: ");
                        	int newPin = input.nextInt();
                        	pin = newPin;
                        	System.out.println("Pin changed successfully.");
				pinValidator = false;
                    	} else {
                        	System.out.println("Incorrect old pin. Please try again.");
                    	}
		      } catch(Exception InputMismatchException) {
		  	System.out.println("Error. Input numbers only.");
		       } 
			}
                    

                case 7:
			boolean

                    System.out.print("Enter your pin: ");
                    inputPin = input.nextInt();
                    if (inputPin == pin) {
                        System.out.print("Enter amount you want to transfer: ");
                        double transferAmount = input.nextDouble();
                        if (transferAmount > 0 && transferAmount <= balance) {
                            balance -= transferAmount;
                            System.out.println("Transferred: $" + transferAmount);
                        } else {
                            System.out.println("Transfer failed: Insufficient funds or invalid amount.");
                        }
                    } else {
                        System.out.println("Incorrect pin. input the correct pin.");
                    }

                    break;

                case 8:
             
                    System.out.println("Have a great day or night, whichever!!");
                    break;

                default:
                    System.out.println("Wrong input, do the right thing please.");
         }    
    }
  }
}




