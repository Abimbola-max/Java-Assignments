import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutApplicationTest {

    @Test
    public void calculateAndDisplayTotals() {

        String name = "Tayo";
        double newDiscountPrice = 400;
        double total = 5000;
        double newVatPrice = 500;

        double expected = 5100;
        double actual = total - newDiscountPrice + newVatPrice;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateTotal() {
        String productName = "Rice";
        double productQuantity = 2;
        double productPrice = 500;

        String productName2 = "pepsi";
        double productQuantity2 = 3;
        double productPrice2 = 400;

        double expectedTotal = 2200;
        double actual = (productPrice * productQuantity) + (productPrice2 * productQuantity2);
        assertEquals(expectedTotal, actual);
    }
}
