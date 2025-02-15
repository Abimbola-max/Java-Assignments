import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZoneTest {

    private GeoPoliticalZone geoPolitcal;

    @Test
    public void testThatYouCanGetStateWhenZoneIsCollected() {
        geoPolitcal = new GeoPoliticalZone();
        String stateName = "Ogun";
        String actual = geoPolitcal.getStateWith(stateName);
        assertEquals("SOUTH_WEST", actual);
    }
}


