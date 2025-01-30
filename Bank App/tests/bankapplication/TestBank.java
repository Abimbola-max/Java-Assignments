package bankapplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    @Test
    public void testBankCanCreateAccount() {
        Bank bank = new Bank();
        Account account = createAccount("bimbola", "aishat", "4020");
        assertEquals(1, account.getAccountNumber());
    }
    @Test
    public void testDeposit(){
        Bank bank = new Bank();
        Account account = createAccount("bimbola", "aishat", "4020");
        int initialBalance = account.checkBalance("4020");
        account.deposit(4000);
        assertEquals(initialBalance + 4000, account.checkBalance("4020"));
    }


    @Test
    public void testBankCanDeposit() {
        Bank bank = new Bank();

        bank.deposit(6000, 1);
        assertEquals(6000, bank.checkBalance(1, "4020"));

    }

}
