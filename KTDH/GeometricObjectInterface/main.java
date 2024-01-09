package KTDH.GeometricObjectInterface;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Circle> listCir = new ArrayList<>();
        ArrayList<Rectangle> listRec = new ArrayList<>();
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            if (c == 'C') {
                double radius = sc.nextDouble();
                listCir.add(new Circle(radius));
            } else {
                double width = sc.nextDouble(), length = sc.nextDouble();
                listRec.add(new Rectangle(Math.min(width, length), Math.max(width, length)));
            }
        }
        System.out.println("Circle :");
        for (Circle x : listCir) {
            System.out.println(x);
        }
        System.out.println("Rectangle :");
        for (Rectangle x : listRec) {
            System.out.println(x);
        }
    }
}