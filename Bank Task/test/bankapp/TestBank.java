package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    private Bank bank;

    @BeforeEach
    public void startWith() {
        bank = new Bank();
    }

    @Test
    public void TestBankCanCreateAccountForAuserAndReturnOneAsNumberOfAccountCreated() {
        bank.createAccount("firstName", "lastName", "password");

        assertEquals(1, bank.getAccounts().size());
    }

    @Test
    public void testThatBankCanCreateAccountForThreeusersAndReturnsThreeAsNumberOfAccountCreated() {
        bank.createAccount("firstName", "lastName", "password");
        bank.createAccount("firstName1", "lastName1", "password1");
        bank.createAccount("firstName2", "lastName2", "password2");

        assertEquals(3, bank.getAccounts().size());
    }

    @Test
    public void testThatCustomerCanDeposit4KIntoTheBankFromAccountReturns4KAsBalance() {
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int accountNumber = myAccount.getAccountNumber();

        bank.deposit(20_000, accountNumber);
        assertEquals(20_000, myAccount.getBalance());
    }

    @Test
    public void testThatTwoCustomersCanDepositDifferentAmountIntoTheBankFromAccountReturnBalance() {
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
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int accountNumber = myAccount.getAccountNumber();
        bank.deposit(10_000, accountNumber);
        bank.withdraw(accountNumber, "password", 4_000);

        assertEquals(6_000, myAccount.getBalance());
    }

    @Test
    public void testThatAccountCanTransfer10kFromAcountAToAccountB() {
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
    public void testThatAccountCanTransfer20kFromAtoBToAccountB() {
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int SenderAccountNumber = myAccount.getAccountNumber();
        bank.deposit(10_000, SenderAccountNumber);
        bank.deposit(20_000, SenderAccountNumber);

        Account myAccount2 = bank.createAccount("firstName2", "lastName2", "password2");
        int receiverAccountNumber = myAccount2.getAccountNumber();
        bank.Transfer(SenderAccountNumber, 20_000, receiverAccountNumber, "password");

        assertEquals(10_000, myAccount.getBalance());
        assertEquals(20_000, myAccount2.getBalance());
    }

    @Test
    public void testThatUserCreatesAccountAndDeletesAccount() {
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int accountNumber = myAccount.getAccountNumber();
        bank.removeAccount(accountNumber, "password");

        assertEquals(0, bank.getAccounts().size());
    }

    @Test
    public void testThatTwoUsersCreatesAccountAndAUserDeletesAccountReturnsOneAsTheOnlyExistingAccount() {
        Account myAccount = bank.createAccount("firstName", "lastName", "password");
        int accountNumber = myAccount.getAccountNumber();

        Account myAccount2 = bank.createAccount("firstName2", "lastName2", "password2");
        int accountNumber2 = myAccount2.getAccountNumber();

        bank.removeAccount(accountNumber2, "password2");
        assertEquals(1, bank.getAccounts().size());
    }
}
