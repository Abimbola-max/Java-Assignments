package bankapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {

    @Test
    public void testAccountCanDeposit4KAndReturn4K() {
        Account account = new Account("firstName", "lastName", "password", 1);
        account.deposit(4_000);
        assertEquals(4_000, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountCanDeposit4KTwiceAndReturn8K() {
        Account account = new Account("firstName", "lastName", "password", 1);
        account.deposit(4_000);
        account.deposit(4_000);
        assertEquals(8_000, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountThrowsInvalidPinExceptionWhenPinDoesNotMatch() {
        Account account = new Account("firstName", "lastName", "password", 1);
        account.deposit(4_000);
        assertThrows(InvalidPinException.class, () -> account.checkBalance("passwo"));
    }

    @Test
    public void testThatAccountThrowsInvalidAmountExceptionWhenAmountToDepositIsNegative() {
        Account account = new Account("firstName", "lastName", "password", 1);
        assertThrows(InvalidAmountException.class, () -> account.deposit(-1000));
    }

    @Test
    public void testThatAccountCanDeposit4KAndWithdraw2K() {
        Account account = new Account("firstName", "lastName", "password", 1);
        account.deposit(4_000);
        account.withdraw(2_000, "password");
        assertEquals(2_000, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountCanDeposit2kWithdraw1KTwiceReturnsZeroAsBalance() {
        Account account = new Account("firstName", "lastName", "password", 1);
        account.deposit(2_000);
        account.withdraw(1_000, "password");
        account.withdraw(1_000, "password");
        assertEquals(0, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountThrowsAnInvalidAmountExceptionWhenAmountToWithdrawIsGreaterThanBalnce() {
        Account account = new Account("firstName", "lastName", "password", 1);
        assertThrows(InvalidAmountException.class, () -> account.withdraw(2_000, "password"));
    }

}
