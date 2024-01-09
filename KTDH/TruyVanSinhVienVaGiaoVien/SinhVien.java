package KTDH.TruyVanSinhVienVaGiaoVien;

public class SinhVien extends Person {
    private String lop;
    private double gpa;

    public SinhVien(String ma, String ten, String ngSinh, String diaChi, String lop, double gpa) {
        super(ma, ten, ngSinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}