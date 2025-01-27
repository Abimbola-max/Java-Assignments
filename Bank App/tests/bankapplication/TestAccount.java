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
        assertEquals(6000, myAccount.getBalance());
    }

    @Test
    public void testThatAccountCanWithdraw() {
        Account myAccount = new Account();
        myAccount.deposit(6000);
        myAccount.withdraw(1000, "4040");

        assertEquals(5000, myAccount.getBalance());
        assertFalse(myAccount.isAccountEmpty());
    }

    @Test
    public void testThatAccountCanCheckBalance() {
        Account myAccount = new Account();
        myAccount.deposit(6000);
        myAccount.withdraw(1000, "4040");
        myAccount.withdraw(3000, "4040");

        assertEquals(2000, myAccount.checkBalance("4040"));
    }

    @Test
    public void testThatAccountCanUpdatePin() {
        Account myAccount = new Account();
        myAccount.UpdatePin("4040", "2020");
        myAccount.deposit(6000);
        myAccount.withdraw(1000, "2020");

        assertEquals(5000, myAccount.getBalance());
    }

}
