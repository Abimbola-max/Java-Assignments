package bankapp;

import org.junit.jupiter.api.Test;

public class TestBank {

    @Test
    public void TestBankCanCreateAccountForAuser() {
        Bank bank = new Bank();
        bank.createAccount("firstName", "lastName", "password");
    }
}
