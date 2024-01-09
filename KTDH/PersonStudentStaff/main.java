package KTDH.PersonStudentStaff;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        ArrayList<Student> list1 = new ArrayList<>();
        ArrayList<Staff> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                               Integer.parseInt(sc.nextLine())));
            sc.nextLine();
        }
        for (int i = 0; i < m; i++) {
            list2.add(new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            sc.nextLine();
        }
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("Student List :");
        System.out.println("-----------------");
        for (Student x : list1) {
            System.out.println(x);
        }
        System.out.println("Staff List :");
        System.out.println("-----------------");
        for (Staff x : list2) {
            System.out.println(x);
        }
    }
}