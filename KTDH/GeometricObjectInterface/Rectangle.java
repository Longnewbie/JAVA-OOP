package KTDH.GeometricObjectInterface;

public class Rectangle implements GeometricObject {
    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
    
    @Override
    public String toString() {
        return "-----------------------\n" +
               "Width : " + String.format("%.2f", width) + "\n" +
               "Length : " + String.format("%.2f", length) + "\n" +
               "Perimeter : " + String.format("%.2f", getPerimeter()) + "\n" +
               "Area : " + String.format("%.2f", getArea()) + 
               "\n-----------------------";
        
    }
}