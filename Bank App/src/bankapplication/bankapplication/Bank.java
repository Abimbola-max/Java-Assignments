package bankapplication;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();
    private int accountCounter = 0;

    public ArrayList<Account> createAccount(String firstName, String lastName, String pin, int accountNumber) {
        accounts.add(new Account(firstName, lastName, pin, generateAccountNumber()));
        return accounts;
    }

    public int generateAccountNumber() {
        return ++accountCounter;
    }
}
