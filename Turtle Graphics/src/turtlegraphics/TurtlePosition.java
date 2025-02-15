package turtlegraphics;

public class TurtlePosition {

    private int row;
    private int column;

    public TurtlePosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TurtlePosition p) {
            return row == p.row && column == p.column;
        }
        return false;
    }
}
