import org.junit.jupiter.api.Test;

public class DITest {

    @Test
    public void cookMethodTest() {
        Babe bae = new EkitiBabe();
        bae.cook();
        bae.cook("rice");
//        Guy guy = new Guy(bae);
//        guy.cook();
    }
}
