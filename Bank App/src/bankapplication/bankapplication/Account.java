package bankapplication;

public class Account {

    private int accountNumber;
    private String firstName;
    private String lastName;
    private String pin;
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

    public void setPin(String pin) {
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
        this.balance -= amount;
    }

    public int checkBalance(String pin) {
        return this.balance;
    }

    public void UpdatePin(String oldPin, String newPin) {
        newPin = this.pin;
        
    }
}
