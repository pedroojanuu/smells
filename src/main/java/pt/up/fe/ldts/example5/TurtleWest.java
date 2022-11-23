package pt.up.fe.ldts.example5;

public class TurtleWest extends TurtleState {
    public char getName() {return 'W';}
    public void moveForward() {
        turtle.setColumn(turtle.getColumn()-1);
    }
    public void rotateRight() {
        turtle.setDirection(new TurtleNorth());
    }
    public void rotateLeft() {
        turtle.setDirection(new TurtleSouth());
    }
}
