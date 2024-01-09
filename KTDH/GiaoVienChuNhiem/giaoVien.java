package KTDH.GiaoVienChuNhiem;

public class giaoVien extends Person {
    private String khoa, chuNhiem;
    private int luong;

    public giaoVien(String ma, String ten, String ngSinh, String diaChi, String khoa, int luong, String chuNhiem) {
        super(ma, ten, ngSinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
        this.chuNhiem = chuNhiem;
    }

    public String getChuNhiem() {
        return chuNhiem;
    }

    public void setChuNhiem(String chuNhiem) {
        this.chuNhiem = chuNhiem;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + khoa + " " + luong + " " + chuNhiem;
    }
}