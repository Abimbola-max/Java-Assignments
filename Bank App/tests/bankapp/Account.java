package bankapp;

public class Account {

    private int accountNumber;
    private String firstName;
    private String lastName;
    private int pin;

    public Account() {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public boolean isEmpty() {
        return accountNumber == 0;
    }
}
