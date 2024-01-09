package OOP1.TuyenSinh;

public class HocSinh {
    private String kv, ten;
    private double d1, d2, d3;

    public HocSinh(String kv, String ten, double d1, double d2, double d3) {
        this.kv = kv;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public String KV() {
        return kv.substring(2, 3);
    }
    
    public double diemUuTien() {
        String x = KV();
        if (x.equals("1")) return 0.5;
        else if (x.equals("2")) return 1.0;
        return 2.5;
    }
    
    public double tongDiem() {
        return diemUuTien() + d1 + d2 + d3;
    }
    
    public String format(double x) {
        int res = (int)(x * 10);
        return res % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
    }

    @Override
    public String toString() {
        return kv + " " + ten + " " + KV() + " " + format(tongDiem()) + " " + (tongDiem() >= 24 ? "TRUNG TUYEN" : "TRUOT");
    }
}