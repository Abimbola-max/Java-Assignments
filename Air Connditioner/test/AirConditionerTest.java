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
        airConditioner.increasedTemperature();
        assertEquals(19, airConditioner.getTemperatureControl());
    }

    @Test
    public void testWhenTheAirConditionerTemperatureIsDecreased() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.airConditionerIsOn();
        airConditioner.decreasedTemperature();
        assertEquals(16, airConditioner.getTemperatureControl());
    }

    @Test
    public void testWhenTheAirConditionerTemperatureIsBeyondMax() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.airConditionerIsOn();
        airConditioner.increasedTemperature();
        assertEquals(30, airConditioner.getTemperatureControl());
    }
}

