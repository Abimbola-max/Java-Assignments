package bankapp;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Bank {

    private final ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount(String firstName, String lastName, String password) {
        if (firstName == null || lastName == null || password == null) throw new NullPointerException("Firstname or Lastname or password cannot be empty");
        int accountNumber = generateAccountNumber();
        Account account = new Account(firstName, lastName, password, accountNumber);
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

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        } throw new InvalidAccountNumberException("Account " + accountNumber+ " not found");
    }
}
