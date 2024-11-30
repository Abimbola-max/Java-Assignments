import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



public class CheckOutAppTest {
	
	@Test
	public void testAddProduct() {
        CheckOutApp.inputProductDetails("Apple", 1.0, 2);
        CheckOutApp.inputProductDetails("Banana", 0.5, 3);

        assertEquals(Arrays.asList("Apple", "Banana"), CheckOutApp.productNames);
        assertEquals(Arrays.asList(1.0, 0.5), CheckOutApp.productPrices);
        assertEquals(Arrays.asList(2, 3), CheckOutApp.productQuantities);

	}
	
}