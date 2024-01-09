package OOP1.ThuNhapCuaGiaoVien;

public class GiaoVien {
    private String ma, ten;
    private int luong;

    public GiaoVien(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    
    public int phuCap() {
        if (ma.substring(0, 2).equals("HT")) return 2000000;
        else if (ma.substring(0, 2).equals("HP")) return 900000;
        else return 500000;
    }
    
    public int bac() {
        return Integer.parseInt(ma.substring(2));
    }
    
    public int thuNhap() {
        return luong * bac() + phuCap();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + bac() + " " + thuNhap();
    }
}