package bankapplication;

public class Account {

    private int accountNumber;
    private String firstName;
    private String lastName;
    private String pin = "4040";
    private int balance;

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
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        this.balance += amount;
    }

    public void withdraw(int amount, String pin) {
        if (pin.equals(this.pin))
        {
            if(amount <= this.balance)
            {
                this.balance -= amount;
            } else {
                throw new IllegalArgumentException("Withdraw amount must be less than the balance");
            }
        } else {
            throw new IllegalArgumentException("Incorrect PIN");
        }
    }

    public int checkBalance(String pin) {
        return this.balance;
    }

    public void UpdatePin(String oldPin, String newPin) {
        if (oldPin.equals(this.pin)) {
            this.pin = newPin;
        }
    }
}
