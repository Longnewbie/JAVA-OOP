package KTDH.ShapeAbstractClass;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color : " + color + "\n" + "Filled : " + filled;
    }
}