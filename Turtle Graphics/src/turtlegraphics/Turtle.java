package turtlegraphics;

import static turtlegraphics.Direction.*;

public class Turtle {

    private boolean isPenUp = true;
    private Direction direction = EAST;
    private TurtlePosition position = new TurtlePosition(0,0);

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

    public TurtlePosition getCurrentPosition() {
        return position;
    }

    public void turnRight() {
        switch (direction) {
            case EAST -> direction = SOUTH;
            case SOUTH -> direction = WEST;
            case WEST -> direction = NORTH;
            case NORTH -> direction = EAST;
        }
    }

    public void moveForwardBy(int numberOfSteps) {
        switch (direction) {
            case EAST -> moveForwardViaEast(numberOfSteps);
            case SOUTH -> moveForwardViaSouth(numberOfSteps);
            case WEST -> moveForwardViaWest(numberOfSteps);
            case NORTH -> moveForwardViaNorth(numberOfSteps);
        }
    }

    private void moveForwardViaNorth(int numberOfStep) {
        int newRow = numberOfStep - position.getRow() - 1 ;
        int newColumn = position.getColumn();
        position = new TurtlePosition(newRow, newColumn);
    }

    private void moveForwardViaWest(int numberOfStep) {
        int newRow = position.getRow() ;
        int newColumn = numberOfStep - position.getColumn() - 1 ;
        position = new TurtlePosition(newRow, newColumn);
    }

    private void moveForwardViaSouth(int numberOfStep) {
        int newRow = position.getRow() + numberOfStep - 1;
        int newColumn = position.getColumn() ;
        position = new TurtlePosition(newRow, newColumn);
    }

    private void moveForwardViaEast(int numberOfSteps) {
        int newRow = position.getRow() ;
        int newColumn = position.getColumn() + numberOfSteps - 1;
        position = new TurtlePosition(newRow, newColumn);
    }

}
