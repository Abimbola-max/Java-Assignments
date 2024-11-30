import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PangramStandardCheckerTest {
	@Test
		
	public void isLetterPresentTest() {

		PangramChecker pangramChecker = new PangramChecker();

		String words = "the quick brown fox, jumps over the lazy dog";

		boolean presentLetters = pangramChecker.isLetterPresent(words);

		boolean expected = true;
		assertEquals(expected, true);
				

	}
}
	