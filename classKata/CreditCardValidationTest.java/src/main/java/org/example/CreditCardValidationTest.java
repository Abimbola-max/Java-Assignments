import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CreditCardValidationTest {

    @Test
    public void sumOfDoubleEvenPlace() {

        String cardNumber = "5399831619690404";

        int actual = CreditCardValidation.sumOfDoubleEvenPlace(cardNumber);

        int expected = 24;

        assertEquals(expected, actual);

    }
}


