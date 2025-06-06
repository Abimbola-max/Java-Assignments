package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {

    private Account account;

    @BeforeEach
    public void startWith() {
        account =  new Account("firstName", "lastName", "password", 1);
    }

    @Test
    public void testAccountCanDeposit4KAndReturn4K() {
        account.deposit(4_000);
        assertEquals(4_000, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountCanDeposit4KTwiceAndReturn8K() {
        account.deposit(4_000);
        account.deposit(4_000);
        assertEquals(8_000, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountThrowsInvalidPinExceptionWhenPinDoesNotMatch() {
        account.deposit(4_000);
        assertThrows(InvalidPinException.class, () -> account.checkBalance("passwo"));
    }

    @Test
    public void testThatAccountThrowsInvalidAmountExceptionWhenAmountToDepositIsNegative() {
        assertThrows(InvalidAmountException.class, () -> account.deposit(-1000));
    }

    @Test
    public void testThatAccountCanDeposit4KAndWithdraw2K() {
        account.deposit(4_000);
        account.withdraw(2_000, "password");
        assertEquals(2_000, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountCanDeposit2kWithdraw1KTwiceReturnsZeroAsBalance() {
        account.deposit(2_000);
        account.withdraw(1_000, "password");
        account.withdraw(1_000, "password");
        assertEquals(0, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountThrowsAnInvalidAmountExceptionWhenAmountToWithdrawIsGreaterThanBalnce() {
        assertThrows(InvalidAmountException.class, () -> account.withdraw(2_000, "password"));
    }

    @Test
    public void testThatAccountThrowsInvalidAmountExceptionWhenAmountToWithdrawIsNegative() {
        assertThrows(InvalidAmountException.class, () -> account.withdraw(-1000, "password"));
    }

    @Test
    public void testThatAccountCanDeposit10KTenTimesAndReturn100KAsBalance() {
        account.deposit(10_000);
        account.deposit(10_000);
        account.deposit(10_000);
        account.deposit(10_000);
        account.deposit(10_000);
        account.deposit(10_000);
        account.deposit(10_000);
        account.deposit(10_000);
        account.deposit(10_000);
        account.deposit(10_000);
        assertEquals(100_000, account.checkBalance("password"));
    }

    @Test
    public void testThatAccountCanUpdatePin() {
        account.updatePin("password", "newPassword");
        assertEquals(0, account.checkBalance("newPassword"));
    }

    @Test
    public void testThatNewPasswordCanWithdraw2k() {
        account.deposit(4_000);
        account.updatePin("password", "newPassword");
        account.withdraw(2_000, "newPassword");
        assertEquals(2_000, account.checkBalance("newPassword"));

    }

}
