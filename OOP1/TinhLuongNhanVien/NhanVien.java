package OOP1.TinhLuongNhanVien;

public class NhanVien {
    private String ma, ten;
    private int luongNgayCong, soNgay;
    private String chucVu;

    public NhanVien(String ma, String ten, int luongNgayCong, int soNgay, String chucVu) {
        this.ma = ma;
        this.ten = ten;
        this.luongNgayCong = luongNgayCong;
        this.soNgay = soNgay;
        this.chucVu = chucVu;
    }
    
    public int thuong() {
        if (soNgay >= 25) return luong() * 20 / 100;
        else if (soNgay >= 22) return luong() * 10 / 100;
        return 0;
    }
    
    public int luong() {
        return luongNgayCong * soNgay;
    }
    
    public int phuCap() {
        if (chucVu.equals("GD")) return 250000;
        else if (chucVu.equals("PGD")) return  200000;
        else if (chucVu.equals("TP")) return 180000;
        else return 150000;
    }
    
    public int thuNhap() {
        return luong() + thuong() + phuCap();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luong() + " " + thuong() + " " + phuCap() + " " + thuNhap();
    }
}
