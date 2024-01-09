package KTDH.SinhVienVaGiaoVien;

public class GiaoVien extends Person {
    private String khoa;
    private int luong;

    public GiaoVien(String ma, String ten, String ngSinh, String diaChi, String khoa, int luong) {
        super(ma, ten, ngSinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + " " + khoa + " " + luong;
    }
}