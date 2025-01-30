package bankapplication;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();
    private int accountCounter;

    public Account createAccount(String firstName, String lastName, String pin) {
        int accountNumber = generateAccountNumber();
        Account account = new Account(firstName, lastName, pin, accountNumber);
        accounts.add(account);
        return account;
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
        if (account != null) account.deposit(amount);
        throw new IllegalArgumentException("Account not found");
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        Account account = findAccount(accountNumber);
         account.withdraw(amount, pin);
    }

    public int checkBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
       return account.checkBalance(pin);

    }

    public void transfer(int senderAccount , int amount, int receiverAccount, String pin) {
        Account sender = findAccount(senderAccount);
        Account receiver = findAccount(receiverAccount);

        if (sender == null) throw new IllegalArgumentException("Sender Account not found");
        if (receiver == null) throw new IllegalArgumentException("Receiver Account not found");

        sender.withdraw(amount, pin);
        receiver.deposit(amount);
    }
}
