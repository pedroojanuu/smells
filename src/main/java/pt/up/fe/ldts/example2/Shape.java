package pt.up.fe.ldts.example2;

public abstract class Shape {
    protected double x;
    protected double y;
    protected double width;  // ONLY FOR RECTANGLES
    protected double height; // ONLY FOR RECTANGLES
    protected double radius; // ONLY FOR CIRCLES
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void draw(GraphicFramework graphics);
}
