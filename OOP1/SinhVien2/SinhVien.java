package OOP1.SinhVien2;

public class SinhVien {
    private String ma, ten, lop, ngSinh;
    private double gpa;

    public SinhVien(String ma, String ten, String lop, String ngSinh, double gpa) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ngSinh = ngSinh;
        this.gpa = gpa;
    }
    
    public void chuanHoa() {
        String res = "";
        for (String x : ten.split("\\s+")) {
            res += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) res += Character.toLowerCase(x.charAt(i));
            res += " ";
        }
        ten = res.trim();
        StringBuilder sb = new StringBuilder(ngSinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        ngSinh = sb.toString();
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ngSinh + " " + String.format("%.2f", gpa);
    }
}