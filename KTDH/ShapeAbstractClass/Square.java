package KTDH.ShapeAbstractClass;

public class Square extends Shape {
    private double side;

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "-----------------------\n" + 
               "Side : " + String.format("%.2f", side) + "\n" + super.toString() + "\n" + 
               "Perimeter : " + String.format("%.2f", getPerimeter()) + "\n" +
               "Area : " + String.format("%.2f", getArea()) +
               "\n-----------------------";
    }
}