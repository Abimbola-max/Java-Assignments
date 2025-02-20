package turtlegraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtlegraphics.Direction.*;

public class TurtleTest {

    private Turtle turtle;

    @BeforeEach
    public void startWithThis() {
        turtle = new Turtle();
    }

    @Test
    public void turtleCanMovePenUpTest() {
        assertTrue(turtle.isPenUp());
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void testThatTurtleIsFacingEastByDefault() {
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveRightWhileFacingEastTest() {
        assertTrue(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveRightWhileFacingSouthTest() {
        assertTrue(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveRightWhileFacingWestTest() {
        assertTrue(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveRightWhileFacingNorthTest() {
        assertTrue(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMveForwardWhileFacingEastTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), turtle.getCurrentPosition());
        turtle.moveForwardBy(5);
        assertEquals(new TurtlePosition(0,4), turtle.getCurrentPosition());
    }
}
