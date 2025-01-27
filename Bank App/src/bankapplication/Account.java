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
}
