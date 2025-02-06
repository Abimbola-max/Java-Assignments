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

}
