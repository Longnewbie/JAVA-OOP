package KTDH.KeThuaLopPersonVaSapXepTheoTen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student x = new Student(String.format("%04d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                              sc.nextLine(), Double.parseDouble(sc.nextLine()));
            x.chuanHoa();
            list.add(x);
        }
        Collections.sort(list);
        for (Student x : list) {
            System.out.println(x);
        }
    }
}