import bankapp.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAccount {

    @Test
    public void testThatAccountBalanceIsZero() {
        Account account = new Account();
        assertTrue(account.isEmpty());
    }
}
