package bankapplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    public void testBankCanCreateAccount() {
        Bank bank = new Bank();
        bank.createAccount("bimbola", "aishat", "4020", 1);
        assertEquals(1, bank.generateAccountNumber());
    }

}
