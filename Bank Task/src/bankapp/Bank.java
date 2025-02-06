package bankapp;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Bank {

    private final ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount(String firstName, String lastName, String password) {
        if (firstName.isEmpty() || lastName.isEmpty() || password.isEmpty()) throw new IllegalArgumentException("Firstname or Lastname or password cannot be empty");
        int accountNumber = generateAccountNumber();
        var account = new Account(firstName, lastName, password, accountNumber);
        accounts.add(account);
        return account;
    }

    private int generateAccountNumber() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(1000000);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void deposit(int amount, int accountNumber) {
        Account myAccount = findAccount(accountNumber);
        myAccount.deposit(amount);
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        } throw new InvalidAccountNumberException("Account " + accountNumber+ " not found");
    }

    public void withdraw(int accountNumber, String password, int amount) {
        Account myAccount = findAccount(accountNumber);
        myAccount.withdraw(amount, password);
    }

    public void Transfer(int senderAccountNumber, int amount, int receiverAccountNumber, String password) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);

        if (senderAccount == null)
            throw new AccountNotFoundException("Account Number Not Found");

        if (receiverAccount == null)
            throw new AccountNotFoundException("Account Number Not Found");

        try {
            senderAccount.withdraw(amount, password);
        } catch (InvalidPinException | InvalidAmountException ignored) {
            System.out.println("Invalid PIN");
        }
        receiverAccount.deposit(amount);
    }

    public void removeAccount(int accountNumber, String password){
        Account myAccount = findAccount(accountNumber);
        if (myAccount != null) {
            if (myAccount.validatePassword(password))
                accounts.remove(myAccount);
        } throw new AccountNotFoundException ("Account Number Not Found");
    }
}
