import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {

    @Test
    public void testThatAirConditionerIsOn() {
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.airConditionerIsOn());

    }
}
