package bankapplication;

public class Account {

    private int accountNumber;
    private String firstName;
    private String lastName;
    private String pin = "4040";
    private int balance;
    private int accountCounter;

    public Account(String firstName, String lastName, String pin, int accountNumber) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isAccountEmpty() {
        return this.balance == 0;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void deposit(int amount) {
        if (amountIsLessThanZero()) throw new IllegalArgumentException("Invalid amount");
        this.balance += amount;
    }

    private boolean amountIsLessThanZero() {
        if (this.balance < 0) return true;
        return false;
    }

    public void withdraw(int amount, String pin) {
        if (amountIsLessThanZero()) throw new IllegalArgumentException("Invalid amount");
        if (pinValidation(pin)) {
            if(amount <= this.balance) {
                this.balance -= amount;
            } else {
                throw new IllegalArgumentException("Insufficient funds");
            }
        } else {
            throw new IllegalArgumentException("Incorrect PIN");
        }
    }

    public int checkBalance(String pin) {
        if (!pinValidation(pin)) throw new IllegalArgumentException("Incorrect PIN");
        return this.balance;
    }

    public void UpdatePin(String oldPin, String newPin) {
        if (pinValidation(pin)) this.pin = newPin;
        else throw new IllegalArgumentException("Incorrect PIN");

    }

    private boolean pinValidation(String pin) {
        if (pin.equals(this.pin)) return true;
        return false;
    }
}
