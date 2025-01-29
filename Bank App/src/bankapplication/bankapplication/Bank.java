package bankapplication;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();
    private int accountCounter;

    public ArrayList<Account> createAccount(String firstName, String lastName, String pin) {
        accounts.add(new Account(firstName, lastName, pin, generateAccountNumber()));
        return accounts;
    }

    private int generateAccountNumber() {
        return ++accountCounter;
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void deposit(int accountNumber, int amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);

    }

    public int checkBalance(int accountNumber, int) {
    }
}
