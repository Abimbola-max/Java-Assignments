import java.util.Scanner;
import java.util.ArrayList;

public class DiaryApp {

	static Scanner input = new Scanner(System.in);
	static String password;
	static ArrayList<Integer> diaryEntries = new ArrayList<>();

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

		while (choice != 6) {

		System.out.print("1. Create Diary\n2. Lock Diary\n3. Unlock Diary\n4. Update Diary\n5. Find Entry\n6. Exit\n Please select one option >>>>> ");
        			
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
				updateDiary(); break;
			case 5: 
				findEntry(); break;
			case 6:
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
				boolean validLogin = true;

			if (validLogin) {

			System.out.println("Kindly Enter A username Of Your Choice: ");
			username = input.nextLine();       
		
        		System.out.println("Kindly Enter A passkey Of Your Choice: ");
			password = input.nextLine();

			System.out.println("You have successfully created a diary account");

			} else {
				System.out.println("wohh do the right thing o.");

			}
			} 

			catch (Exception e) {
				System.out.println("An error occurred: " + e.getMessage());

			}
		}
	}

	public static void lockDiary() {

		try {
	
		System.out.println("Enter passkey to lock diary: ");
		String lockPasskey = input.nextLine();

		if (password.equals(lockPasskey)) {
			 System.out.println("You have successfully locked your diary");

		} else {
			System.out.println("Wrong password.");
		}
		} catch (Exception NullPointerException) {
			System.out.println("You have not created any diary.");
		}
	}

	public static void unlockDiary() {

		try {
	
		System.out.println("Enter passkey to unlock diary: ");
		String unlockPasskey = input.nextLine();
	
		if (password.equals(unlockPasskey)) {
			 System.out.println("You have successfully unlocked your diary");

		} else {
			System.out.println("Wrong password.");
		}

		} catch (Exception NullPointerException) {
			System.out.println("You have not created any diary.");
		}

	}

	public static void updateDiary() {

		System.out.println("\nUpdate Diary Options:");
		System.out.println("1. Add Entry");		
		System.out.println("1. Delete Entry\n Select an option: ");

		int updateChoice = input.nextInt();
		input.nextLine();

		switch (updateChoice) {
	
			case 1:
				addEntry(); break;
			case 2:
				deleteEntry(); break;
			default:
				System.out.println("Incorrect choice");
		}
	}

		public static void addEntry() {

			System.out.println("Enter entry to add: ");
			int entry = input.nextInt();
			input.nextLine();

			diaryEntries.add(entry);
			System.out.println("You have successfully added " + entry);

		}
		
		public static void deleteEntry() {

			System.out.println("Enter entry to delete: ");
			int entryToDelete = input.nextInt();
			input.nextLine();

			if (entryToDelete > 0 && entryToDelete < diaryEntries.size()) {
				diaryEntries.remove(entryToDelete);
				System.out.println("You have successfully deleted " + entryToDelete);
			} else {
				System.out.println(entryToDelete + "is invalid");
			}
		}

		public static void findEntry() {

			System.out.println("Enter the ID you want to find: ");
			int idToFind = input.nextInt();
			input.nextLine();

			if (idToFind > 0 && idToFind < diaryEntries.size()) {
				int entry = diaryEntries.get(idToFind);
				System.out.println("Found " + entry);

			} else {
				System.out.println(idToFind + " is invalid");
			}

		}

	}















