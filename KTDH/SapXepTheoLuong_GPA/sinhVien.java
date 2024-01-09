package KTDH.SapXepTheoLuong_GPA;

public class sinhVien extends Person implements Comparable<sinhVien> {
    private String lop;
    private double gpa;

    public sinhVien(String ma, String ten, String ngSinh, String diaChi, String lop, double gpa) {
        super(ma, ten, ngSinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }
    
    @Override
    public int compareTo(sinhVien x) {
        if (this.gpa > x.gpa) return -1;
        else if (this.gpa < x.gpa) return 1;
        return this.ma.compareTo(x.ma);
    }

    @Override
    public String toString() {
        return super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}