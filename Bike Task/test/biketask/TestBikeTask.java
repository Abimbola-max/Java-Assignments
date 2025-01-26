package biketask;

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
        assertEquals(16, myBike.accerelate());

        BikeTask myBike2 = new BikeTask(2,24);
        assertEquals(26, myBike2.accerelate());

        BikeTask myBike3 = new BikeTask(3,25);
        assertEquals(28, myBike3.accerelate());

        BikeTask myBike4 = new BikeTask(4,44);
        assertEquals(48, myBike4.accerelate());

        assertTrue(myBike.isTurnedOn());
    }

    @Test
    public void testThatBikeCanDecelerate() {
        BikeTask myBike = new BikeTask(1,15);
        assertEquals(14, myBike.decelerate());

        BikeTask myBike2 = new BikeTask(2,24);
        assertEquals(22, myBike2.decelerate());

        BikeTask myBike3 = new BikeTask(3,25);
        assertEquals(22, myBike3.decelerate());

        BikeTask myBike4 = new BikeTask(4,44);
        assertEquals(40, myBike4.decelerate());

        assertTrue(myBike.isTurnedOn());
    }

    @Test
    public void testThatBikeCanReduceOrIncreaseSpeed() {
        BikeTask myBike = new BikeTask(1,20);
        myBike.accerelate();
        assertEquals(21, myBike.getCurrentSpeed());
        assertEquals(2, myBike.getCurrentGear());

        BikeTask myBike2 = new BikeTask(2,30);
        myBike2.accerelate();
        assertEquals(32, myBike2.getCurrentSpeed());
        assertEquals(3, myBike2.getCurrentGear());

        BikeTask myBike3 = new BikeTask(3,40);
        myBike3.accerelate();
        assertEquals(43, myBike3.getCurrentSpeed());
        assertEquals(4, myBike3.getCurrentGear());

        BikeTask myBike4 = new BikeTask(4,40);
        myBike4.decelerate();
        assertEquals(36, myBike4.getCurrentSpeed());
        assertEquals(3, myBike4.getCurrentGear());
    }
}
