package bankapplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    @Test
    public void testBankCanCreateAccount() {
        Bank bank = new Bank();
        Account account = bank.createAccount("bimbola", "aishat", "4020");
        assertEquals(1, account.getAccountNumber());
    }
    @Test
    public void testBankCanDeposit4K(){
        Bank bank = new Bank();
        Account account = bank.createAccount("bimbola", "aishat", "4020");
        int accountNumber = account.getAccountNumber();
        account.deposit(4000, accountNumber);
        assertEquals(4000, account.checkBalance("4020"));
    }


    @Test
    public void testBankCanDeposit10kAndWithdraw5k() {
        Bank bank = new Bank();
        Account account = bank.createAccount("bimbola", "aishat", "4020");
        int accountNumber = account.getAccountNumber();
        account.deposit(10000, accountNumber);
        bank.withdraw(accountNumber, 5000, "4020");
        assertEquals(5000, bank.checkBalance(1, "4020"));
    }

    @Test
    public void tes

}
