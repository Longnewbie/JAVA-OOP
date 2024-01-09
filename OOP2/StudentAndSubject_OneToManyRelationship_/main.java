package OOP2.StudentAndSubject_OneToManyRelationship_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            int soMon = sc.nextInt();
            int []tinChi = new int[soMon];
            double []diem = new double[soMon];
            sc.nextLine();
            for (int j = 0; j < soMon; j++) {
                String monHoc = sc.nextLine();
                String []tmp = sc.nextLine().split("\\s+");
                int tinChi_tmp = Integer.parseInt(tmp[0]);
                double diem_tmp = Double.parseDouble(tmp[tmp.length - 1]);
                tinChi[j] = tinChi_tmp;
                diem[j] = diem_tmp;
            }
            double GPA = Students.AVG_GPA(tinChi, diem);
            list.add(new Students(ma, ten, lop, GPA));
        }
        Collections.sort(list, new Comparator<Students>(){
            @Override
            public int compare(Students o1, Students o2) {
                if (o1.getGPA() != o2.getGPA()) return Double.compare(o2.getGPA(), o1.getGPA());
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (Students x : list) {
            System.out.println(x);
        }
    }
}