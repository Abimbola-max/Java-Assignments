package ccv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidationTest {

    @Test
    public void sumOfDoubleEvenPlaceTest() {
        String cardNumber = "5399831619690404";
        int actual = CreditCardValidation.sumOfDoubleEvenPlace(cardNumber);
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void sumOfOddPlaceTest() {
        String cardNumber = "5399831619690404";
        int actual = CreditCardValidation.sumOfOddPlace(cardNumber);
        int expected = 47;
        assertEquals(expected, actual);
    }

    @Test
    public void isValidTest() {
        String cardNumber = "528782666711";
        boolean actual = CreditCardValidation.isValid(cardNumber);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
