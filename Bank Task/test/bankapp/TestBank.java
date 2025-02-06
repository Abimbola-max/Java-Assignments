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
}
