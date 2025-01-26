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
    public void testThatBikeCanIncreaseSpeed() {
        BikeTask myBike = new BikeTask();
        myBike.setCurrentGear(1);
        myBike.setCurrentSpeed(1);
        myBike.accerelate();
        assertEquals(1, myBike.setGear());

        BikeTask myBike2 = new BikeTask();
        myBike2.setCurrentGear(1);
        myBike2.setCurrentSpeed(2);
        myBike2.accerelate();
        assertEquals(1, myBike2.setGear());

        BikeTask myBike3 = new BikeTask();
        myBike3.setCurrentGear(1);
        myBike3.setCurrentSpeed(3);
        myBike3.accerelate();
        assertEquals(1, myBike3.setGear());

        BikeTask myBike4 = new BikeTask();
        myBike4.setCurrentGear(1);
        myBike4.setCurrentSpeed(4);
        myBike4.accerelate();
        assertEquals(1, myBike.setGear());

        BikeTask myBike5 = new BikeTask();
        myBike5.setCurrentGear(1);
        myBike5.setCurrentSpeed(5);
        myBike5.accerelate();
        assertEquals(1, myBike5.setGear());

        BikeTask myBike6 = new BikeTask();
        myBike6.setCurrentGear(1);
        myBike6.setCurrentSpeed(6);
        myBike6.accerelate();
        assertEquals(1, myBike6.setGear());

        BikeTask myBike7 = new BikeTask();
        myBike7.setCurrentGear(1);
        myBike7.setCurrentSpeed(7);
        myBike7.accerelate();
        assertEquals(1, myBike7.setGear());

        BikeTask myBike8 = new BikeTask();
        myBike8.setCurrentGear(1);
        myBike8.setCurrentSpeed(8);
        myBike8.accerelate();
        assertEquals(1, myBike8.setGear());

        BikeTask myBike9 = new BikeTask();
        myBike9.setCurrentGear(1);
        myBike9.setCurrentSpeed(9);
        myBike9.accerelate();
        assertEquals(1, myBike9.setGear());

        BikeTask myBike10 = new BikeTask();
        myBike10.setCurrentGear(1);
        myBike10.setCurrentSpeed(10);
        myBike10.accerelate();
        assertEquals(1, myBike10.setGear());

        BikeTask myBike11 = new BikeTask();
        myBike11.setCurrentGear(1);
        myBike11.setCurrentSpeed(11);
        myBike11.accerelate();
        assertEquals(1, myBike11.setGear());

        BikeTask myBike12 = new BikeTask();
        myBike12.setCurrentGear(1);
        myBike12.setCurrentSpeed(20);
        myBike12.accerelate();
        assertEquals(1, myBike12.setGear());

        BikeTask myBike13 = new BikeTask();
        myBike13.setCurrentGear(1);
        myBike13.setCurrentSpeed(12);
        myBike13.accerelate();
        assertEquals(1, myBike13.setGear());

        BikeTask myBike14 = new BikeTask();
        myBike14.setCurrentGear(1);
        myBike14.setCurrentSpeed(13);
        myBike14.accerelate();
        assertEquals(1, myBike14.setGear());

        BikeTask myBike15 = new BikeTask();
        myBike15.setCurrentGear(1);
        myBike15.setCurrentSpeed(14);
        myBike15.accerelate();
        assertEquals(1, myBike15.setGear());

    }
}
