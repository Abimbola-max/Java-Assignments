package bankapp;

import java.util.Scanner;

public class BankApp {

    Bank bank = new Bank();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        BankApp bankApp = new BankApp();
        bankApp.menuOptions();
    }

    private void menuOptions() {
        System.out.println("Welcome FB Bank. How may we be of help? Please select an option below:");
        System.out.println("""
                1. Create Account
                2. Deposit
                3. Withdraw
                4. Close Account
                5. Transfer Money
                6. Check Balance
                7. Change pin
                8. Exit App
                >>>>
                """);
        int option = input.nextInt();
        switch (option) {
            case 1:
                createAccount();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                closeAccount();
                break;
            case 5:
                transferMoney();
                break;
            case 6:
                checkBalance();
                break;
            case 7:
                changePassword();
                break;
            case 8:
                exitApp();
                break;
            default:
                System.exit(0);
                break;

        }
    }

    public void createAccount() {
        try {
            System.out.println("Enter First Name: ");
            String firstName = input.next();
            System.out.println("Enter Last Name: ");
            String lastName = input.next();
            System.out.println("Enter password: ");
            String password = input.next();

            if (firstName.isEmpty() || lastName.isEmpty() || password.isEmpty()) {
                throw new IllegalArgumentException("First Name and Last Name cannot be empty");
            } else {
                Account account = bank.createAccount(firstName, lastName, password);
                input.nextLine();
                System.out.println(account);
                System.out.println("Account created successfully.");
                System.out.println("Your account number is " + account.getAccountNumber());
            }
        } catch (NullPointerException exception) {
            System.out.println("Firstname or Lastname or password cannot be empty.");
        } catch (InvalidPinException exception) {
            System.out.println(exception.getMessage());
        } finally {
            menuOptions();
        }
    }

    public void deposit() {
        try {
            System.out.println("Enter Account number: ");
            int accountNumber = input.nextInt();

            System.out.println("Enter Deposit Amount: ");
            int depositAmount = input.nextInt();
            input.nextLine();
            bank.findAccount(accountNumber);
            bank.deposit(depositAmount, accountNumber);

            System.out.println("Deposit of " + depositAmount + " is successful.");
        } catch (InvalidAccountNumberException exception) {
            System.out.println("Invalid Account Number");
        } catch (NullPointerException exception) {
            System.out.println("Account number cannot be empty.");
        } catch (InvalidAmountException exception) {
            System.out.println(exception.getMessage());
        } finally {
            menuOptions();
        }
    }

    public void withdraw() {
        try {
            System.out.println("Enter Account number: ");
            int accountNumber = input.nextInt();

            System.out.println("Enter Amount to withdraw: ");
            int withdrawAmount = input.nextInt();

            System.out.println("Enter Password: ");
            String password = input.next();

            bank.findAccount(accountNumber);
            bank.withdraw(accountNumber, password, withdrawAmount);
            System.out.println("You have Withdrawn " + withdrawAmount +  "successfully.");

        } catch (InvalidAccountNumberException exception) {
            System.out.println("Invalid Account Number");
        } catch (NullPointerException exception) {
            System.out.println("fields cannot be empty.");
        } catch (InvalidAmountException exception) {
            System.out.println(exception.getMessage());
        } catch (InvalidPinException exception) {
            System.out.println(exception.getMessage());
        } finally {
            menuOptions();
        }
    }

    public void closeAccount() {
        try {
            System.out.println("Enter Account number: ");
            int accountNumber = input.nextInt();
            System.out.println("Enter Password: ");
            String password = input.next();

            bank.findAccount(accountNumber);
            bank.removeAccount(accountNumber, password);
        } catch (InvalidAccountNumberException exception) {
            System.out.println("Invalid Account Number");
        } catch (NullPointerException exception) {
            System.out.println("fields cannot be empty.");
        } catch (InvalidPinException exception) {
            System.out.println(exception.getMessage());
        } catch (AccountNotFoundException exception) {
            System.out.println("Account not found");
        } finally {
            menuOptions();
        }
    }

    public void transferMoney() {
        try {
            System.out.println("Enter The Account number you want to transfer money from: ");
            int senderAccountNumber = input.nextInt();

            System.out.println("Enter Amount to Transfer: ");
            int transferAmount = input.nextInt();

            System.out.println("Enter Receiver's Account number: ");
            int receiverAccountNumber = input.nextInt();

            System.out.println("Enter password: ");
            String password = input.next();

            bank.findAccount(senderAccountNumber);
            bank.findAccount(receiverAccountNumber);

            bank.Transfer(senderAccountNumber, transferAmount, receiverAccountNumber, password);
        } catch (InvalidAccountNumberException exception) {
            System.out.println("Invalid Account Number");
        } catch (NullPointerException exception) {
            System.out.println("fields cannot be empty.");
        } catch (InvalidPinException exception) {
            System.out.println(exception.getMessage());
        } catch (AccountNotFoundException exception) {
            System.out.println("Account not found");
        } finally {
            menuOptions();
        }
    }

    public void checkBalance() {
        try {
            System.out.println("Enter account number: ");
            int accountNumber = input.nextInt();

            System.out.println("Enter password: ");
            String password = input.next();

            input.nextLine();

            Account account = bank.findAccount(accountNumber);
            int balance = account.checkBalance(password);

            System.out.println("Your account balance is " + balance);
        } catch (InvalidAccountNumberException exception) {
            System.out.println("Invalid Account Number");
        } catch (NullPointerException exception) {
            System.out.println("fields cannot be empty.");
        } catch (InvalidPinException exception) {
            System.out.println(exception.getMessage());
        } catch (AccountNotFoundException exception) {
            System.out.println("Account not found");
        } finally {
            menuOptions();
        }
    }

    public void changePassword() {
        try {
            System.out.println("Enter account number: ");
            int accountNumber = input.nextInt();

            System.out.println("Enter Old password: ");
            String Oldpassword = input.next();

            System.out.println("Enter new password: ");
            String newPassword = input.next();

            input.nextLine();

            Account account = bank.findAccount(accountNumber);
            account.updatePin(Oldpassword, newPassword);
        } catch (InvalidAccountNumberException exception) {
            System.out.println("Invalid Account Number");
        } catch (NullPointerException exception) {
            System.out.println("fields cannot be empty.");
        } catch (InvalidPinException exception) {
            System.out.println(exception.getMessage());
        } catch (AccountNotFoundException exception) {
            System.out.println("Account not found");
        } finally {
            menuOptions();
        }
    }

    public static void exitApp() {
        System.out.println("Thank you bank with FB Bank. Your Valuables safely kept is our utmost priority");
        System.exit(0);
    }
}
