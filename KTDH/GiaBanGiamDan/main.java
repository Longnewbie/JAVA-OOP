package KTDH.GiaBanGiamDan;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<XeMay> listXM = new ArrayList<>();
        ArrayList<Oto> listOto = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if (ma.charAt(0) == 'O') {
                listOto.add(new Oto(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                                Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            } else {
                listXM.add(new XeMay(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                                Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            }
        }
        Collections.sort(listXM);
        Collections.sort(listOto);
        System.out.println("DANH SACH OTO :");
        for (Oto x : listOto) {
            System.out.println(x);
        }
        System.out.println("DANH SACH XE MAY :");
        for (XeMay x : listXM) {
            System.out.println(x);
        }
    }
}