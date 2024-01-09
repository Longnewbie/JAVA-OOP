package OOP1.LopHCN;

public class Rectange {
    private int width, length;
    private String color;

    public Rectange(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public int getArea() {
        return getWidth() * getLength();
    }
    
    public int getPerimeter() {
        return (getWidth() + getLength()) * 2;
    }

    @Override
    public String toString() {
        return getPerimeter() + " " + getArea() + " " + color;
    }
}