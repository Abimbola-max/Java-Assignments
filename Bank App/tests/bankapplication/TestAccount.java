package bankapplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {
    Account myAccount;

    @BeforeEach
    void startWithThis() {
        myAccount = new Account("Abimbola", "Abisoye", "4040", 1);
    }

    @Test
    public void testThatAccountIsEmpty() {
        assertTrue(myAccount.isAccountEmpty());
    }

    @Test
    public void testThatAccountCanDeposit() {
        myAccount.deposit(6000, 4000);

        assertFalse(myAccount.isAccountEmpty());
        assertEquals(6000, myAccount.checkBalance("4040"));
    }

    @Test
    public void testThatAccountCanWithdraw() {
        myAccount.deposit(6000, 4000);
        myAccount.withdraw(1000, "4040");

        assertEquals(5000, myAccount.checkBalance("4040"));
        assertFalse(myAccount.isAccountEmpty());
    }

    @Test
    public void testThatAccountCanCheckBalance() {
        myAccount.deposit(6000, 4000);
        myAccount.withdraw(1000, "4040");
        myAccount.withdraw(3000, "4040");

        assertEquals(2000, myAccount.checkBalance("4040"));
    }

    @Test
    public void testThatAccountCanUpdatePin() {
        myAccount.UpdatePin("4040", "2020");
        myAccount.deposit(6000, 4000);
        myAccount.withdraw(1000, "2020");

        assertEquals(5000, myAccount.checkBalance("2020"));
    }

    @Test
    public void testDepositMinus5kWithdaw10KThrowsIllegalArgumentException() {
        myAccount.deposit(5000, 4000);
        assertThrows(IllegalArgumentException.class, () -> myAccount.withdraw(10000,"2010"));
    }

    @Test
    public void testDepositMinus10kWithda2KThrowsIllegalArgumentException() {
        myAccount.deposit(-5000, 4000);
        assertThrows(IllegalArgumentException.class, () -> myAccount.withdraw(10000,"2010"));
    }
}
