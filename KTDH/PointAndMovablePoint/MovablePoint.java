package KTDH.PointAndMovablePoint;

public class MovablePoint extends Point {
    private double xSpeed, ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public void Move(int n) {
        super.setX(getX() + (xSpeed * n));
        super.setY(getY() + (ySpeed * n));
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
              "X Speed : " + String.format("%.2f", xSpeed) + "\n" + "Y Speed : " + String.format("%.2f", ySpeed) +
              "\n-------------------";
    }
}