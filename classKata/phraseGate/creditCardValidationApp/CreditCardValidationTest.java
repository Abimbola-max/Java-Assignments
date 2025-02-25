import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidationTest {

    @Test
    public void sumOfDoubleEvenPlace() {
        String cardNumber = "5399831619690404";
        int actual = CreditCardValidation.sumOfDoubleEvenPlace(cardNumber);
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void sumOfOddPlace() {
        String cardNumber = "5399831619690404";
        int actual = CreditCardValidation.sumOfOddPlace(cardNumber);
        int expected = 47;
        assertEquals(expected, actual);
    }

    @Test
    public void isValid() {
        String cardNumber = "528782666711";
        boolean actual = CreditCardValidation.isValid(cardNumber);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}