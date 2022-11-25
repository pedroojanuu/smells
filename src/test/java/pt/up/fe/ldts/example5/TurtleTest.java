package pt.up.fe.ldts.example5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurtleTest {

    @Test
    public void testRotateLeft() {
        TurtleDirection TurtleDirection = new TurtleNorth();
        Turtle turtle = new Turtle(5, 5, TurtleDirection);
        turtle.execute('L'); assertEquals('W', turtle.getDirection());
        turtle.execute('L'); assertEquals('S', turtle.getDirection());
        turtle.execute('L'); assertEquals('E', turtle.getDirection());
        turtle.execute('L'); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testRotateRight() {
        TurtleDirection TurtleDirection = new TurtleNorth();
        Turtle turtle = new Turtle(5, 5, TurtleDirection);
        turtle.execute('R'); assertEquals('E', turtle.getDirection());
        turtle.execute('R'); assertEquals('S', turtle.getDirection());
        turtle.execute('R'); assertEquals('W', turtle.getDirection());
        turtle.execute('R'); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testForward() {
        TurtleDirection TurtleDirection = new TurtleNorth();
        Turtle turtleN = new Turtle(5, 5, TurtleDirection);

        turtleN.execute('F');
        assertEquals(4, turtleN.getRow());
        assertEquals(5, turtleN.getColumn());

        TurtleDirection = new TurtleWest();
        Turtle turtleW = new Turtle(5, 5, TurtleDirection);

        turtleW.execute('F');
        assertEquals(5, turtleW.getRow());
        assertEquals(4, turtleW.getColumn());

        TurtleDirection = new TurtleSouth();
        Turtle turtleS = new Turtle(5, 5, TurtleDirection);

        turtleS.execute('F');
        assertEquals(6, turtleS.getRow());
        assertEquals(5, turtleS.getColumn());

        TurtleDirection = new TurtleEast();
        Turtle turtleE = new Turtle(5, 5, TurtleDirection);

        turtleE.execute('F');
        assertEquals(5, turtleE.getRow());
        assertEquals(6, turtleE.getColumn());
    }
}
