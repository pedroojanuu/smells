package pt.up.fe.ldts.example5;

import pt.up.fe.ldts.example5.TurtleDirection;

public class Turtle {
    private int row;
    private int column;
    protected TurtleDirection direction;
    public Turtle(int row, int column, TurtleDirection direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
        direction.setTurtle(this);
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public char getDirection() {
        return direction.getName();
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public void setDirection(TurtleDirection direction) {
        this.direction = direction;
    }
    public void execute(char command) {
        if (command == 'L') direction.rotateLeft();
        else if (command == 'R') direction.rotateRight();
        else if (command == 'F') direction.moveForward();
    }
}
