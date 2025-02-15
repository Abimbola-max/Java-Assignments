package turtlegraphics;

import static turtlegraphics.Direction.*;

public class Turtle {

    private boolean isPenUp = true;
    private Direction direction = EAST;

    public boolean isPenUp() {
        return isPenUp;
    }

    public void movePenUp() {
        isPenUp = true;
    }

    public void movePenDown() {
        isPenUp = false;
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        switch (direction) {
            case EAST -> direction = SOUTH;
            case SOUTH -> direction = WEST;
            case WEST -> direction = NORTH;
            case NORTH -> direction = EAST;
        }
    }
}
