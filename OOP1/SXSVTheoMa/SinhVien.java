package OOP1.SXSVTheoMa;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.getMa());
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}