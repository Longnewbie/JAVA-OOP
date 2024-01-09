package KTDH.ShapeAbstractClass;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> listShape = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            if (x.equals("S")) {
                double side = sc.nextDouble();
                String color = sc.next();
                boolean filled = sc.nextBoolean();
                listShape.add(new Square(side, color, filled));
            } else if (x.equals("C")) {
                double radius = sc.nextDouble();
                String color = sc.next();
                boolean filled = sc.nextBoolean();
                listShape.add(new Circle(radius, color, filled));
            } else {
                double width = sc.nextDouble(), length = sc.nextDouble();
                String color = sc.next();
                boolean filled = sc.nextBoolean();
                listShape.add(new Rectangle(Math.min(width, length), Math.max(width, length), color, filled));
            }
        }
        System.out.println("Circle :");
        for (Shape x : listShape) {
            if (x instanceof Circle) System.out.println(x);
        }
        System.out.println("Rectangle :");
        for (Shape x : listShape) {
            if (x instanceof Rectangle) System.out.println(x);
        }
        System.out.println("Square :");
        for (Shape x : listShape) {
            if (x instanceof Square) System.out.println(x);
        }
    }
}