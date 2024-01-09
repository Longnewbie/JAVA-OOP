package KTDH.TruyVanSinhVienVaGiaoVien;

public class GiaoVien extends Person {
    private String khoa, lop;
    private int luong;

    public GiaoVien(String ma, String ten, String ngSinh, String diaChi, String khoa, int luong, String lop) {
        super(ma, ten, ngSinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return super.toString() + " " + khoa + " " + luong;
    }
}
