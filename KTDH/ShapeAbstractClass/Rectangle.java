package KTDH.ShapeAbstractClass;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "-----------------------\n" +
               "Width : " + String.format("%.2f", width) + "\n" + 
               "Length : " + String.format("%.2f", length) + "\n" +
               super.toString() + "\n" +
               "Perimeter : " + String.format("%.2f", getPerimeter()) + "\n" + 
               "Area : " + String.format("%.2f", getArea()) +
               "\n-----------------------";
    }
}
