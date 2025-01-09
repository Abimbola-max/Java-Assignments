import java.util.Random;
import java.util.Scanner;

public class ATMApp {

    static Scanner input = new Scanner(System.in);
    static int pin;
    static int confirmedPin;

    public static void main(String[] args) {
        generateAccount();
        createPin();
    }

    public static long generateAccount() {
        Random rand = new Random();
        long accountNumber = rand.nextLong(10);
        return accountNumber;
    }

    public static void createPin() {
        boolean pinValidator = true;
        while (pinValidator) {
            try {
                System.out.println("Enter PIN number: ");
                pin = input.nextInt();
                input.nextLine();

                if (String.valueOf(pin).length() != 4) {
                    System.out.println("PIN should be between 0 and 4!");

                } else {
                    System.out.println("Confirm your PIN: ");
                    confirmedPin = input.nextInt();
                    input.nextLine();

                    if (confirmedPin == pin) {
                        System.out.println("You have successfully created a pin!");
                        pinValidator = false;
                    } else {
                        System.out.println("PINs do not match!");
                    }
                }

            } catch (Exception e) {
                System.out.println("PIN should contain only numbers!");
                input.nextLine();
            }
        }
    }
}
