package OOP1.SXSVTheoGPAVaMSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = String.format("%03d", i + 1);
            ma = "SV" + ma;
            SinhVien x = new SinhVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            x.chuanHoa();
            list.add(x);
        }
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() != o2.getGpa()) {
                    if (o1.getGpa() > o2.getGpa()) return -1;
                    return 1;
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}
