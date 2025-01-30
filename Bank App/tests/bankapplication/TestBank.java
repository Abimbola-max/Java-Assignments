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
        bank.deposit(4000, accountNumber);
        assertEquals(4000, account.checkBalance("4020"));
    }


    @Test
    public void testBankCanDeposit10kAndWithdraw5k() {
        Bank bank = new Bank();
        Account account = bank.createAccount("bimbola", "aishat", "4020");
        int accountNumber = account.getAccountNumber();
        bank.deposit(10000, accountNumber);
        bank.withdraw(accountNumber, 5000, "4020");
        assertEquals(5000, bank.checkBalance(1, "4020"));
    }

    @Test
    public void testThatBankCanTransfer5kAndTransfer3k() {
        Bank bank = new Bank();
        Account sender = bank.createAccount("bimbola", "aishat", "4020");
        Account receiver = bank.createAccount("john", "doe", "1234");
        int senderAccountNumber = sender.getAccountNumber();
        int receiverAccountNumber = receiver.getAccountNumber();
        bank.deposit(senderAccountNumber, 5000);
        bank.transfer(senderAccountNumber, 3000, receiverAccountNumber);
        assertEquals(2000, sender.checkBalance("4020"));
    }
}
