package bankapplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAccount {

    @Test
    public void testThatAccountIsEmpty() {
        Account myAccount = new Account();
        assertTrue(myAccount.isAccountEmpty());
    }

}
