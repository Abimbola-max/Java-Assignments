import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testThatAirConditionerIsOn() {
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.airConditionerIsOn());
    }

    @Test
    public void testThatAirConditionerIsOff() {
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.airConditionerIsOff());
    }

    @Test
    public void testWhenTheAirConditionerTemperatureIsIncreased() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.airConditionerIsOn();
        assertEquals(airConditioner.increasedTemperature())
    }
}
