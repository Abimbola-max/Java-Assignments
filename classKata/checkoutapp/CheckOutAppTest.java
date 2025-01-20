import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutApplicationTest {

    @Test
    public void calculateAndDisplayTotals() {

        String name = "Tayo";
        double discount = 0.8;
        double newDiscountPrice = discount;
        double total = 3000;

        double expected = 3400;
        double actual = total - newDiscountPrice + newVatPrice;
        assertEquals(expected, actual);
    }
}
