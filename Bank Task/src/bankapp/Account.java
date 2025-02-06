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
        if (amountIsLessThanZero(amount)) throw new InvalidAmountException("Amount cannot deposit less than 0 Naira");
        this.balance += amount;
    }

    private boolean amountIsLessThanZero(int amount) {
        if (amount < 0) throw new InvalidAmountException("Amount cannot be negative Naira");
        return false;
    }

    public int checkBalance(String password) {
        if (validatePassword(password)) return this.balance;
        throw new InvalidPinException("Invalid password");
    }

    private boolean validatePassword(String password) {
        if (password.equals(this.password)) return true;
        return false;
    }

    public void withdraw(int amount, String password) {
        if (amountIsLessThanZero(amount)) throw new InvalidAmountException("Amount cannot be less than 0 Naira");
        if (insufficientFund(amount) && validatePassword(password)) throw new InvalidAmountException("Insufficient fund");
        this.balance -= amount;
    }

    private boolean insufficientFund(int amount) {
        if (amount > this.balance) throw new InvalidAmountException("Insufficient fund");
        return false;
    }

    public void updatePin(String password, String newPassword) {
        if (!validatePassword(password)) throw new InvalidPinException("Invalid password");
        this.password = newPassword;
    }
}
