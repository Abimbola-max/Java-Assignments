package turtlegraphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TurtleTest {

    @Test
    public void turtleCanMovePenUpTest() {
        Turtle turtle = new Turtle();
        assertTrue(turtle.isPenUp());
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        Turtle turtle = new Turtle();
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }
}
