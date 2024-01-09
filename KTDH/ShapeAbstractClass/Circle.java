package KTDH.ShapeAbstractClass;

public class Circle extends Shape {
    protected double radius;
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "-----------------------\n" +
               "Radius : " + String.format("%.2f", radius) + "\n" + super.toString() + "\n" +
               "Perimeter : " + String.format("%.2f", getPerimeter()) + "\n" + "Area : " + String.format("%.2f", getArea()) +
                "\n-----------------------";
    }
}