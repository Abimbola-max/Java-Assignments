package arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMyMapMethods {

    private MyMapMethods myMap;

    @BeforeEach
    public void startWithThis() {
        myMap = new MyMapMethods();
    }

    @Test
    public void testMyMapIsEmpty() {
        assertTrue(myMap.isEmpty());
    }

    @Test
    public void testMyMapCanPerformPutFunctions() {
        myMap.put("jerry", 67);


    }
}
