package KTDH.GeometricObjectInterface;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "-----------------------\n" +
               "Radius : " + String.format("%.2f", radius) + "\n" +
               "Perimeter : " + String.format("%.2f", getPerimeter()) + "\n" +
               "Area : " + String.format("%.2f", getArea()) + 
               "\n-----------------------";
    }
}