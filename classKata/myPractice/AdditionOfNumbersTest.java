import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AdditionOfNumbersTest {

	@Test
	public void testAdditionOfNumbers() {

		AdditionOfNumbers addition = new AdditionOfNumbers();
	
		double a = 2.0;
		double b = 2.0;

		double answer = addition.additionOf(a, b);

		double expected = 4.0;
		
		assertEquals(expected, 4.0);
	}
	
	@Test
	public void testSevenAddsTwo() {
		AdditionOfNumbers addition = new AdditionOfNumbers();
	
		double a = 7.0;
		double b = 2.0;

		double answer = addition.additionOf(a, b);

		double expected = 9.0;
		
		assertEquals(expected, 9.0);	
	

	}
	
	@Test
	public void testDoubleValues() {
		AdditionOfNumbers addition = new AdditionOfNumbers();

		double a = 3.4;
		double b = 7.6;

		double answer = addition. additionOf(a, b);

		double expected = 11.0;
	
		assertEquals(expected, 11.0);
	}


}