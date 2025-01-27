package bankapplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {

    @Test
    public void testThatAccountIsEmpty() {
        Account myAccount = new Account();
        assertTrue(myAccount.isAccountEmpty());
    }

    @Test
    public void testThatAccountCanDeposit() {
        Account myAccount = new Account();
        myAccount.deposit(6000);

        assertFalse(myAccount.isAccountEmpty());
    }

    @Test
    public void testThatAccountCanWithdraw() {
        Account myAccount = new Account();
        myAccount.withdraw(6000, "4040");

        assertFalse(myAccount.isAccountEmpty());
    }

}
