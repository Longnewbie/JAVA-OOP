package KTDH.CircleVaCylinder;

public class Cylinder extends Circle implements Comparable<Cylinder> {
    private double height;

    public Cylinder(String color, double radius, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume() {
        return 3.14 * super.getRadius() * super.getRadius() * this.height;
    }
    
    @Override
    public int compareTo(Cylinder o) {
        if (this.getVolume() != o.getVolume()) {
                    if (this.getVolume() > o.getVolume()) return -1;
                    else return 1;
                } 
                return this.getColor().compareTo(o.getColor());
    }

    @Override
    public String toString() {
        return "Color : " + super.getColor() + "\n" +
               "Height : " + String.format("%.2f", height) + "\n" + 
               "Radius : " + String.format("%.2f", super.getRadius()) + "\n" + 
               "Volume : " + String.format("%.2f", getVolume()) + 
                "\n-------------------";
    }
}