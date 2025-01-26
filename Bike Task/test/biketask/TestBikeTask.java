package biketask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBikeTask {

    private BikeTask myBike;

    @BeforeEach
    public void startWithThis() {
        myBike = new BikeTask();
    }

    @Test
    public void testThatMyBikeIsOn() {
        assertTrue(myBike.isTurnedOn());
    }
}
