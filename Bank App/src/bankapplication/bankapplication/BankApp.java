package bankapplication;

import java.util.Scanner;

public class BankApp {

    static Scanner input = new Scanner(System.in);
    Bank bank = new Bank();

    public static void main(String[] args) {
        BankApp bankApp = new BankApp();
        bankApp.mainOption();
    }

    public void mainOption() {
        System.out.println("""
                1. Create Account,
                2. Deposit,
                3. Withdraw money,
                4. Transfer money,
                5. Change Pin,
                6. Exit
                """);

        System.out.print("Enter an option: ");
        String option = input.next();

        switch (option) {
            case "1":
                createAccount();
                break;
            case "2":
                deposit();
                break;
            case "3":
                withdraw();
                break;
            case "4":
                transfer();
                break;
            case "5":
                changePin();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");

        }
    }

    public void createAccount() {
        try {
            System.out.println("Enter first name: ");
            String firstName = input.next();
            System.out.println("Enter last name: ");
            String lastName = input.next();
            System.out.println("Enter account pin: ");
            String pin = input.next();
            Integer.parseInt(pin);
            bank.createAccount(firstName, lastName, pin);
            System.out.println("Account created successfully.");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } finally {
            mainOption();
        }
    }

    public void deposit() {
        try {
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Enter deposit amount: ");
            double amount = input.nextDouble();
            bank.deposit(accountNumber, amount);
            System.out.println("Deposit successful.");
        } catch(IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } catch (java.util.InputMismatchException exception) {
            System.out.println("Invalid Input. Please enter a valid number.");
            input.nextLine();
        } finally {
            mainOption();
        }
    }

    public void withdraw() {
        try {
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Enter withdraw amount: ");
            double amount = input.nextDouble();
            bank.withdraw(accountNumber, amount);
            System.out.println("Withdrawal successful.");
        } catch(IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }  catch (java.util.InputMismatchException exception) {
            System.out.println("Invalid Input. Please enter a valid number.");
            input.nextLine();
        }
    }

    public void transfer() {
        try {
            System.out.print("Enter sender account number: ");
            int senderAccountNumber = input.nextInt();
            System.out.print("Enter receiver account number: ");
            int receiverAccountNumber = input.nextInt();
            System.out.print("Enter transfer amount: ");
            double amount = input.nextDouble();
            System.out.print("Enter transfer description: ");
            String description = input.next();
            bank.transfer(senderAccountNumber, amount, receiverAccountNumber, description);
            System.out.println("Transfer successful.");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } catch (java.util.InputMismatchException exception) {
            System.out.println("Invalid Input. Please enter a valid number.");
            input.nextLine();
        } finally {
            mainOption();
        }

    }

    public void changePin() {
        try {
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Enter old pin: ");
            String oldPin = input.next();
            Integer.parseInt(oldPin);
            System.out.print("Enter new pin: ");
            String newPin = input.next();
            Integer.parseInt(oldPin);
            bank.updatePin(accountNumber, oldPin, newPin);
            System.out.println("Pin changed successfully.");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } catch (java.util.InputMismatchException exception) {
            System.out.println("Invalid Input. Please enter a valid number.");
            input.nextLine();
        } finally {
            mainOption();
        }
    }
}
