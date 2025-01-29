package bankapplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    @Test
    public void testBankCanCreateAccount() {
        Bank bank = new Bank();
        bank.createAccount("bimbola", "aishat", "4020");
        assertEquals(1,));
    }

    @Test
    public void testBankCanDeposit() {
        Bank bank = new Bank();

        bank.deposit(6000, 1);
        assertEquals(6000, bank.checkBalance(1, "4020"));

    }

}
