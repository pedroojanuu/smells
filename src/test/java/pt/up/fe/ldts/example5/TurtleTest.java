package pt.up.fe.ldts.example5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurtleTest {

    @Test
    public void testRotateLeft() {
        TurtleState turtleState = new TurtleNorth();
        Turtle turtle = new Turtle(5, 5, turtleState);
        turtle.execute('L'); assertEquals('W', turtle.getDirection());
        turtle.execute('L'); assertEquals('S', turtle.getDirection());
        turtle.execute('L'); assertEquals('E', turtle.getDirection());
        turtle.execute('L'); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testRotateRight() {
        TurtleState turtleState = new TurtleNorth();
        Turtle turtle = new Turtle(5, 5, turtleState);
        turtle.execute('R'); assertEquals('E', turtle.getDirection());
        turtle.execute('R'); assertEquals('S', turtle.getDirection());
        turtle.execute('R'); assertEquals('W', turtle.getDirection());
        turtle.execute('R'); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testForward() {
        TurtleState turtleState = new TurtleNorth();
        Turtle turtleN = new Turtle(5, 5, turtleState);

        turtleN.execute('F');
        assertEquals(4, turtleN.getRow());
        assertEquals(5, turtleN.getColumn());

        turtleState = new TurtleWest();
        Turtle turtleW = new Turtle(5, 5, turtleState);

        turtleW.execute('F');
        assertEquals(5, turtleW.getRow());
        assertEquals(4, turtleW.getColumn());

        turtleState = new TurtleSouth();
        Turtle turtleS = new Turtle(5, 5, turtleState);

        turtleS.execute('F');
        assertEquals(6, turtleS.getRow());
        assertEquals(5, turtleS.getColumn());

        turtleState = new TurtleEast();
        Turtle turtleE = new Turtle(5, 5, turtleState);

        turtleE.execute('F');
        assertEquals(5, turtleE.getRow());
        assertEquals(6, turtleE.getColumn());
    }
}
