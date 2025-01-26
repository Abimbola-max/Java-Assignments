package biketask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBikeTask {

    @Test
    public void testThatMyBikeIsOn() {
        BikeTask myBike = new BikeTask();
        assertTrue(myBike.isTurnedOn());
    }

    @Test
    public void testThatMyBikeIsOff() {
        BikeTask myBike = new BikeTask();

        assertFalse(myBike.isTurnedOff());
    }

    @Test
    public void testThatBikeCanAccerelerate() {
        BikeTask myBike = new BikeTask();
        myBike.setCurrentGear(1);
        myBike.setCurrentSpeed(1);
        assertEquals(2, myBike.accerelate());

        BikeTask myBike2 = new BikeTask();
        myBike2.setCurrentGear(1);
        myBike2.setCurrentSpeed(16);
        assertEquals(17, myBike2.accerelate());

        BikeTask myBike3 = new BikeTask();
        myBike3.setCurrentGear(2);
        myBike3.setCurrentSpeed(24);
        assertEquals(26, myBike3.accerelate());

        BikeTask myBike4 = new BikeTask();
        myBike4.setCurrentGear(3);
        myBike4.setCurrentSpeed(30);
        assertEquals(33, myBike4.accerelate());

        assertTrue(myBike.isTurnedOn());
    }

    @Test
    public void testThatBikeCanDecelerate() {
        BikeTask myBike = new BikeTask();
        myBike.setCurrentGear(3);
        myBike.setCurrentSpeed(30);
        assertEquals(27, myBike.decelerate());

        BikeTask myBike2 = new BikeTask();
        myBike2.setCurrentGear(2);
        myBike2.setCurrentSpeed(24);
        assertEquals(22, myBike2.decelerate());

        BikeTask myBike3 = new BikeTask();
        myBike3.setCurrentGear(1);
        myBike3.setCurrentSpeed(16);
        assertEquals(15, myBike3.decelerate());

        BikeTask myBike4 = new BikeTask();
        myBike4.setCurrentGear(4);
        myBike4.setCurrentSpeed(44);
        assertEquals(40, myBike4.decelerate());

        assertTrue(myBike.isTurnedOn());
    }

    @Test
    public void testThatBikeCanReduceOrIncreaseSpeed() {
        BikeTask myBike = new BikeTask();
        myBike.setCurrentGear(1);
        myBike.setCurrentSpeed(1);
        myBike.accerelate();
        assertEquals(1, myBike.setGear());

          BikeTask myBike2 = new BikeTask();
          myBike2.accerelate();
          assertEquals(2, myBike2.getCurrentSpeed());
          assertEquals(1, myBike2.getCurrentGear());

          BikeTask myBike3 = new BikeTask();
          myBike3.accerelate();
          assertEquals(3, myBike3.getCurrentSpeed());
          assertEquals(1, myBike3.getCurrentGear());

          BikeTask myBike4 = new BikeTask();
          myBike4.decelerate();
          assertEquals(36, myBike4.getCurrentSpeed());
          assertEquals(3, myBike4.getCurrentGear());

          BikeTask myBike5 = new BikeTask();
          myBike5.decelerate();
          assertEquals(27, myBike5.getCurrentSpeed());
          assertEquals(2, myBike5.getCurrentGear());

    }
}
