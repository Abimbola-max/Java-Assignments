import java.util.Scanner;

public class DiaryApp {

	static Scanner input = new Scanner(System.in);
	static String password;

	public static void main(String[] args) {
		
		appMenu();
		


	}
		
	public static void welcome() {

        System.out.print("Welcome To AppByMeDiary\n");
        System.out.print("The next page Displays, Shows And Help You With Your Choice ?\n");
    }

	public static void appMenu() {
        	welcome();

		int choice = 0;

		while (choice != 4) {

		System.out.print("1. Create Diary\n2. Lock Diary\n3. Unlock Diary\n4. Exit\n Please select one option >>>>>");
        			
		choice = input.nextInt();
		input.nextLine();

        		switch (choice) {
            
			case 1: 
				createDiary();break;
           		case 2: 
				lockDiary();break;
            		case 3: 
				unlockDiary();break;
			case 4:
                    		System.out.println("Exiting the diary...");break; 
                	default:
                    		System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            	
			}
		}
	}
	
	public static void createDiary() {
		
		String username = "";

		while (username.isEmpty()) {

			try {

			System.out.println("Kindly Enter A username Of Your Choice: ");
			username = input.nextLine();       
		
        		System.out.println("Kindly Enter A passkey Of Your Choice: ");
			password = input.nextLine();

			} 

			catch (Exception e) {
				System.out.println("Enter the correct input!!");

			}
		}
	}

	public static void lockDiary() {
	
		System.out.println("Enter passkey to lock diary: ");
		String lockPasskey = input.nextLine();

		if (password.equals(lockPasskey)) {
			 System.out.println("You have successfully locked your diary");

		} else {
			System.out.println("Wrong password.");
		}
	}

	public static void unlockDiary() {
	
		System.out.println("Enter passkey to unlock diary: ");
		String unlockPasskey = input.nextLine();
	
		if (password.equals(unlockPasskey)) {
			 System.out.println("You have successfully unlocked your diary");

		} else {
			System.out.println("Wrong password.");
		}
	}

}