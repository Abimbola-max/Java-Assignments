package turtlegraphics;

public class Turtle {

    private boolean isPenUp = true;

    public boolean isPenUp() {
        return isPenUp;
    }

    public void movePenUp() {
        isPenUp = true;
    }

    public void movePenDown() {
        isPenUp = false;
    }
}
