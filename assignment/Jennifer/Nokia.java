import java.util.Scanner;

	public class Nokia {

		public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.print("List of menu functions: \n1. phonebook \n2. Messages\n3. chat\n4. Call register\n5. Tones \n6. settings \n7. call divert \n8. Games\n9. Calculator\n10. Remainder\n11. Clock\n12. profiles\n13. Sim services\n Enter a number: ");
		int reply = input.nextInt();

			switch(reply) {
			case 1:
				System.out.print("1. search\n2. SearchNos.\n3. Add Name\4. Erase\n5. Edit\n6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags\n Enter an option for 8: ");
			int option = input.nextInt();

				switch (option) {
				case 8:
					System.out.print("1. Type of view\n2. Memory status");
				}
				break;
			case 2:
				System.out.print("1. Write Message\n2. Inbox\3. Outbox\n4. Picture Messages\n5, Templates\n6. Smileys\n7. Message Settings\n8. Info service\n9. Voice mailbox number\n10. Service comand editor\n Enter options for message settings");
			int messages = input.nextInt();
				
				Switch(messages) {
				case 7: 
					System.out.print("1. Set 1\n");
					System.out.print("click to enter set options");
					int sett = input.nextInt();

						switch(sett) {
						case 1:
						System.out.print("1. Message center number\n2. Messages sent as\n3. Message validity");
						}
				}
				break;
			
			case 3:
				System.out.print("Chat");
				break;

			case 4:
				System.out.print("Call register");
				int callRegister = input.nextInt();
				break;

			case 5:
				System.out.print("1.Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warming and game tones\n8. Vibrating alert\n9. Screen saver");
			break;

			case 6:
				System.out.print("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
			break;

			case 7:
				System.out.print("Call divert");
			break;

			case 8:
				System.out.print("Games");
			break;

			case 9:
				System.out.print("Calculator");
			break;

		
			case 10:
				System.out.print("Reminder");
			break;


			case 11:
				System.out.print("1. Alarm clock\n2. Clock settings\n3. Date settings\n4. Stopwatch\n5. Countdown timer\n6. Auto update of dat and time");
			break;


			case 12:
				System.out.print("Profiles");
			break;


			case 13:
				System.out.print("Sim services^3");
			break;



			}
	}
}