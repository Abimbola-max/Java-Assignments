package bankapplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {
    Account myAccount;

    @BeforeEach
    void setUp() {
        myAccount = new Account("Abimbola", "Abisoye", "2000");
    }

    @Test
    public void testThatAccountIsEmpty() {
        assertTrue(myAccount.isAccountEmpty());
    }

    @Test
    public void testThatAccountCanDeposit() {
        myAccount.deposit(6000);

        assertFalse(myAccount.isAccountEmpty());
        assertEquals(6000, myAccount.getBalance());
    }

    @Test
    public void testThatAccountCanWithdraw() {
        myAccount.deposit(6000);
        myAccount.withdraw(1000, "4040");

        assertEquals(5000, myAccount.getBalance());
        assertFalse(myAccount.isAccountEmpty());
    }

    @Test
    public void testThatAccountCanCheckBalance() {
        myAccount.deposit(6000);
        myAccount.withdraw(1000, "4040");
        myAccount.withdraw(3000, "4040");

        assertEquals(2000, myAccount.checkBalance("4040"));
    }

    @Test
    public void testThatAccountCanUpdatePin() {
        myAccount.UpdatePin("4040", "2020");
        myAccount.deposit(6000);
        myAccount.withdraw(1000, "2066797897790");

        assertEquals(5000, myAccount.getBalance());
    }

}
