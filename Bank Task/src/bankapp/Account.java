package bankapp;

public class Account {

    private String firstName;
    private String lastName;
    private String password = "password";
    private int balance;
    private int accountNumber;

    public Account(String firstName, String lastName, String password, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount < 0) throw new InvalidAmountException("Insufficient balance");
        this.balance += amount;
    }

    public int checkBalance(String password) {
        if (validatePassword(password)) return this.balance;
        throw new InvalidPinException("Invalid password");
    }

    private boolean validatePassword(String password) {
        if (password.equals(this.password)) return true;
        return false;
    }
}
