import java.util.Scanner;

public class MenstrualApp {

	static Scanner input = new Scanner(System.in);
	static String fullName;
    	static String gender;
    	static int lastPeriodDay;
    	static int lastPeriodMonth;
    	static int currentYear;
	static int age;
	

	public static void main(String[] args) {
		displayWelcomingCode();
		fullName();
		gender();
		displayWelcome();
		moodOf();
		lastPeriodInfo();
		calculateEstimates();
		


	}

	public static void fullName() {
		System.out.println("Enter your name: ");
        	fullName = input.nextLine();
		System.out.println("How old are you?");
        	age = input.nextInt();
        	if (age < 10 || age > 65) {
            	System.out.println("Sorry, This App Is Not Suitable For Your Age.");
            System.exit(0);
		input.nextLine();
        	}
       
    	}
    	
    	public static void lastPeriodInfo() {
		System.out.println("Enter the first date of your last period: ");
        	lastPeriodDay = input.nextInt();
		
		while (lastPeriodDay < 1 || lastPeriodDay > 31) {
			System.out.println("Invalid day input. Please enter a day between 1 and 31: ");
		lastPeriodDay = input.nextInt();
		}

		System.out.println("Enter your last period month: ");
			lastPeriodMonth = input.nextInt();

		while (lastPeriodMonth < 1 || lastPeriodMonth > 12) {
			System.out.println("Invalid day input. Please enter a month between 1 and 12: ");
		lastPeriodMonth = input.nextInt();

		}
			System.out.println("Enter year: ");
			currentYear = input.nextInt();

			System.out.println("How long does your period last for?");
        		int periodDuration = input.nextInt();

		if (periodDuration < 1 || periodDuration > 8) {
			System.out.println("Enter a valid input!!");
		}
    	}

	 public static void displayWelcomingCode() {
        	System.out.println("Welcome To Bibi's MenstrualCycle App!");
        	
       	}

	public static void displayWelcome() {
		System.out.println("Welcome " + fullName);
	}
  
    	public static String gender() {

		String gender = "";

		boolean validInput = false;

		while (!validInput) {

       		System.out.print("Kindly Enter Your Gender (male/female): ");
        	gender = input.nextLine().toUpperCase();

		if (gender.equals("F") || gender.equals("M")) {
			validInput = true;
		}
		}
        	if (gender.equals("F")) {
            		System.out.print("Hi sis!!");

        	} else if (gender.equals("M")) {
            		System.out.println("You are at the right place for your babe or hmm.");
     
		} else {
           		System.out.println("Invalid Input. Please Enter 'M' for Male or 'F' for Female.");
            	
	            }
        	 
		return gender;
	}

	
	public static void moodOf() {

		boolean correctInput = false;

		while (!correctInput) {

		System.out.println("How do you feel about your period?" + "\n 1. It is a love hate relationship" + "(:(" + "\n2. Embarassed" + ":( " + "\n3. Hate it" + "\n4. We've become friends" + ":)" + "\n>>>");
		int periodMood = input.nextInt();

		switch(periodMood) {
			case 1: 
				System.out.println("I get it lol. You are relieved when you see it but can not wait to let it go");correctInput = true; break;
			case 2: 
				System.out.println("It is normal to feel a bit uncomfortable talking about periods");correctInput = true;break;
			case 3: 
				System.out.println("You are not alone, many people feel the same way about their periods");correctInput = true;break;
			case 4: 
				System.out.println("We love to hear it!! WE will hep  you live in harmony with your period by predicting correctly "); 
			correctInput = true;
			break;
			default:
				System.out.println("Enter the correct input my guy");break;
	
			
		}
	    }
	
	}

	public static void calculateEstimates() {
        
        int nextPeriodDay = lastPeriodDay;
	int duration = nextPeriodDay + 5;
        int nextPeriodMonth = lastPeriodMonth + 1;
        if (nextPeriodMonth > 12) {
            nextPeriodMonth = 1; 
            currentYear++;
        }

        
        int ovulationDay = nextPeriodDay - 14;
        int ovulationMonth = nextPeriodMonth;
        int ovulationYear = currentYear;
        if (ovulationDay <= 0) {
            ovulationMonth--; 
            if (ovulationMonth == 0) {
                ovulationMonth = 12; 
                ovulationYear--;
            }
            
            ovulationDay += numberOfDaysInMonth(ovulationYear, ovulationMonth); 
        }

        
        int safePeriodStartDay = ovulationDay - 7;
        int safePeriodStartMonth = ovulationMonth;
        int safePeriodStartYear = ovulationYear; 
        if (safePeriodStartDay <= 0) { 
            safePeriodStartMonth--;
            if (safePeriodStartMonth == 0) {
                safePeriodStartMonth = 12; 
                safePeriodStartYear--; 
            }
            safePeriodStartDay += numberOfDaysInMonth(safePeriodStartYear, safePeriodStartMonth);
        }

        int safePeriodEndDay = ovulationDay + 7;
        int safePeriodEndMonth = ovulationMonth;
        int safePeriodEndYear = ovulationYear;
        if (safePeriodEndDay > numberOfDaysInMonth(safePeriodEndYear, safePeriodEndMonth)) {
            safePeriodEndDay -= numberOfDaysInMonth(safePeriodEndYear, safePeriodEndMonth);
            safePeriodEndMonth++;
            if (safePeriodEndMonth > 12) {
                safePeriodEndMonth = 1;
                safePeriodEndYear++;
            }
        }

       
        System.out.println("\nYour next period date should be: " + nextPeriodDay + "/" + 
                           nextPeriodMonth + "/" + currentYear + "to" + duration + "/" + 
                           nextPeriodMonth + "/" + currentYear);
        System.out.println("Your estimated ovulation date: " + ovulationDay + "/" + 
                           ovulationMonth + "/" + ovulationYear);
        System.out.println("Your estimated safe period is: " + 
                           safePeriodStartDay + "/" + safePeriodStartMonth + "/" + safePeriodStartYear + " to " +
                           safePeriodEndDay + "/" + safePeriodEndMonth + "/" + safePeriodEndYear);
    }

    public static int numberOfDaysInMonth(int year, int month) {
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || 
            month == 10 || month == 12) {

            return 31;

        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;

        } else {
            return 28;
 
        }
}

}
