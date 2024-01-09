package KTDH.KeThuaLopPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = String.format("%04d", i + 1);
            String ten = sc.nextLine();
            String s = sc.nextLine();
            int idx = 0;
            for (int j = 0; j < s.length(); j++) {
                if (Character.isAlphabetic(s.charAt(j))) {
                    idx = j;
                    break;
                }
            }
            String ngSinh = s.substring(0, idx), diaChi = s.substring(idx);
            String lop = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            Student x = new Student(ma, ten, ngSinh, diaChi, lop, gpa);
            x.chuanHoa();
            list.add(x);
        }
        for (Student x : list) {
            System.out.println(x);
        }
    }
}