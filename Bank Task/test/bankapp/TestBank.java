package bankapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    @Test
    public void TestBankCanCreateAccountForAuserAndReturnOneAsNumberOfAccountCreated() {
        Bank bank = new Bank();
        bank.createAccount("firstName", "lastName", "password");

        assertEquals(1, bank.getAccounts().size());
    }

    @Test
    public void testThatBankCanCreateAccountForThreeusersAndReturnsThreeAsNumberOfAccountCreated() {
        Bank bank = new Bank();
        bank.createAccount("firstName", "lastName", "password");
        bank.createAccount("firstName1", "lastName1", "password1");
        bank.createAccount("firstName2", "lastName2", "password2");

        assertEquals(3, bank.getAccounts().size());
    }

    @Test
    public void testThatCustomerCanDeposit4KIntoTheBankFromAccountReturns4KAsBalance() {
        Bank bank = new Bank();
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int accountNumber = myAccount.getAccountNumber();

        bank.deposit(20_000, accountNumber);
        assertEquals(20_000, myAccount.getBalance());
    }

    @Test
    public void testThatTwoCustomersCanDepositDifferentAmountIntoTheBankFromAccountReturnBalance() {
        Bank bank = new Bank();
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int accountNumber = myAccount.getAccountNumber();
        bank.deposit(20_000, accountNumber);
        assertEquals(20_000, myAccount.getBalance());

        Account myAccount2 = bank.createAccount("firstName2", "lastName2", "password2");
        int accountNumber2 = myAccount2.getAccountNumber();
        bank.deposit(10_000, accountNumber2);
        assertEquals(10_000, myAccount2.getBalance());
    }

    @Test
    public void testThatCustomerCanDeposit10kIntoBankAndWithdraw4kFromAccountReturns6KAsBalance() {
        Bank bank = new Bank();
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int accountNumber = myAccount.getAccountNumber();
        bank.deposit(10_000, accountNumber);
        bank.withdraw(accountNumber, "password", 4_000);

        assertEquals(6_000, myAccount.getBalance());
    }

    @Test
    public void testThatAccountCanTransfer10kFromAcountAToAccountB() {
        Bank bank = new Bank();
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int SenderAccountNumber = myAccount.getAccountNumber();
        bank.deposit(20_000, SenderAccountNumber);

        Account myAccount2 = bank.createAccount("firstName2", "lastName2", "password2");
        int receiverAccountNumber = myAccount2.getAccountNumber();

        bank.Transfer(SenderAccountNumber, 10_000, receiverAccountNumber, "password");

        assertEquals(10_000, myAccount.getBalance());
        assertEquals(10_000, myAccount2.getBalance());
    }

    @Test
}
