import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaWahalaTest {


	@Test
	public void welcomeMessage() {

		PizzaWahala pizzaWahala = new PizzaWahala();

		Strin welcome = pangramChecker.welcomeMessage("Welcome to Iya Moses Pizza joint!! The best pizza you would ever get and i can bet that");

		expected = "Welcome to Iya Moses Pizza joint!! The best pizza you would ever get and i can bet that";
		assertEquals(expected, true);

}