package biketask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBikeTask {

    @Test
    public void testThatMyBikeIsOn() {
        BikeTask myBike = new BikeTask(0,0);
        assertTrue(myBike.isTurnedOn());
    }

    @Test
    public void testThatMyBikeIsOff() {
        BikeTask myBike = new BikeTask(0,0);

        assertFalse(myBike.isTurnedOff());
    }

    @Test
    public void testThatBikeCanAccerelerate() {
        BikeTask myBike = new BikeTask(1,15);
        assertEquals(16, myBike.accerelator());

        BikeTask myBike2 = new BikeTask(2,24);
        assertEquals(26, myBike2.accerelator());

        BikeTask myBike3 = new BikeTask(3,25);
        assertEquals(28, myBike3.accerelator());

        BikeTask myBike4 = new BikeTask(4,44);
        assertEquals(48, myBike4.accerelator());
    }
}
