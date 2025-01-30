package bankapplication;

import java.util.Scanner;

public class BankApp {

    static Scanner input = new Scanner(System.in);
    Bank bank = new Bank();

    public static void main(String[] args) {

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

    
}
