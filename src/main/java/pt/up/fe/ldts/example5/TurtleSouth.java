package pt.up.fe.ldts.example5;

public class TurtleSouth extends TurtleState {
    public char getName() {
        return 'S';
    }
    public void moveForward() {
        turtle.setRow(turtle.getRow()+1);
    }
    public void rotateRight() {
        turtle.setDirection(new TurtleEast());
    }
    public void rotateLeft() {
        turtle.setDirection(new TurtleWest());
    }
}
