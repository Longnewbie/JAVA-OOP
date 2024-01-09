package OOP1.NhanVien2;

public class NhanVien {
    private String ma, ten, gioiTinh, ngSinh, diaChi, maSoThue, ngayHopDong;

    public NhanVien(String ma, String ten, String gioiTinh, String ngSinh, String diaChi, String maSoThue, String ngayHopDong) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngSinh = ngSinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayHopDong = ngayHopDong;
    }
    
    void chuanHoaDMY() {
        StringBuilder sb1 = new StringBuilder(ngSinh);
        if (sb1.charAt(1) == '/') sb1.insert(0, "0");
        if (sb1.charAt(4) == '/') sb1.insert(3, "0");
        ngSinh = sb1.toString();
        StringBuilder sb2 = new StringBuilder(ngayHopDong);
        if (sb2.charAt(1) == '/') sb2.insert(0, "0");
        if (sb2.charAt(4) == '/') sb2.insert(3, "0");
        ngayHopDong = sb2.toString();
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(String ngSinh) {
        this.ngSinh = ngSinh;
    }
    
    public String DOB(String s) {
        String []arr = s.split("/");
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) res += arr[i] + " ";
        res = res.trim();
        return res;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioiTinh + " " + ngSinh + " " + diaChi + " " + maSoThue + " " + ngayHopDong;
    }
}