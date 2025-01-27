package bankapplication;

public class Account {

    private int accountNumber;
    private String firstName;
    private String lastName;
    private int pin;
    private int balance;

    public Account() {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public boolean isAccountEmpty() {
        return this.balance == 0;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount < 200) {
            throw new IllegalArgumentException("Invalid amount");
        }
        this.balance += amount;
    }

    public void withdraw(int amount, String pin) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient amount");
        }
    }
}
