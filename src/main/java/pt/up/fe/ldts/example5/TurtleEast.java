package pt.up.fe.ldts.example5;

public class TurtleEast extends TurtleState {
    public char getName() {return 'E';}
    public void moveForward() {
        turtle.setColumn(turtle.getColumn()+1);
    }
    public void rotateRight() {
        turtle.setDirection(new TurtleSouth());
    }
    public void rotateLeft() {
        turtle.setDirection(new TurtleNorth());
    }
}
