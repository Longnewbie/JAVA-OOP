package OOP1.LopNhanVien2;

public class NhanVien2 {
    private String ma, ten, gioiTinh, ngSinh, diaChi, maSoThue, ngHopDong;

    public NhanVien2(String ma, String ten, String gioiTinh, String ngSinh, String diaChi, String maSoThue, String ngHopDong) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngSinh = ngSinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngHopDong = ngHopDong;
    }
    public void chuanHoa() {
        //Chuan hoa ngSinh:
        StringBuilder sb1 = new StringBuilder(ngSinh);
        if (sb1.charAt(1) == '/') sb1.insert(0, "0");
        if (sb1.charAt(4) == '/') sb1.insert(3, "0");
        ngSinh = sb1.toString();
        //Chuan hoa ngHopDong:
        StringBuilder sb2 = new StringBuilder(ngHopDong);
        if (sb2.charAt(1) == '/') sb2.insert(0, "0");
        if (sb2.charAt(4) == '/') sb2.insert(3, "0");
        ngHopDong = sb2.toString();
        //Chuan hoa ten:
        String res = "";
        for (String x : ten.split("\\s+")) {
            res += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) res += Character.toLowerCase(x.charAt(i));
            res += " ";
        }
        ten = res.trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioiTinh + " " + ngSinh + " " + diaChi + " " + maSoThue + " " + ngHopDong;
    }
}