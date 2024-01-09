package KTDH.SapXepTheoLuong_GPA;

public class giaoVien extends Person implements Comparable<giaoVien> {
    private String khoa;
    private int luong;

    public giaoVien(String ma, String ten, String ngSinh, String diaChi, String khoa, int luong) {
        super(ma, ten, ngSinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
    }
    
    @Override
    public int compareTo(giaoVien x) {
        if (this.luong != x.luong) return x.luong - this.luong;
        return this.ma.compareTo(x.ma);
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + khoa + " " + luong;
    }
}