package KTDH.GiaoVienChuNhiem;

public class sinhVien extends Person {
    private String lop;
    private double gpa;

    public sinhVien(String ma, String ten, String ngSinh, String diaChi, String lop, double gpa) {
        super(ma, ten, ngSinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}