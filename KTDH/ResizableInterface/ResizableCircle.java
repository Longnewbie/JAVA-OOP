package KTDH.ResizableInterface;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius *= percent/100.0;
    }
    
    @Override
    public String toString() {
        return "---------------------\n" + 
               "Radius : " + String.format("%.2f", radius) + "\n" + 
               "Perimeter : " + String.format("%.2f", getPerimeter()) + "\n" + 
               "Area : " + String.format("%.2f", getArea()) + 
               "\n---------------------";
    }
}