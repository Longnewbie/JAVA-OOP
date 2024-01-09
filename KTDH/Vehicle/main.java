package KTDH.Vehicle;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<XeMay> listXM = new ArrayList<>();
        ArrayList<Oto> listOto = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hang = sc.nextLine();
            String mauSac = sc.nextLine();
            if (ma.substring(0, 2).equals("OT")) {
                int maLuc = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                listOto.add(new Oto(ma, ten, hang, mauSac, maLuc, giaBan));
            } else {
                int maxSpeed = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                listXM.add(new XeMay(ma, ten, hang, mauSac, maxSpeed, giaBan));
            }
        }
        String hangXe = sc.nextLine();
        System.out.println("DANH SACH XE HANG " + hangXe + " :");
        for (Oto x : listOto) {
            if (x.getHang().equals(hangXe)) System.out.println(x);
        }
        for (XeMay x : listXM) {
            if (x.getHang().equals(hangXe)) System.out.println(x);
        }
    }
}