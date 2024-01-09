package OOP1.SXGiangVien;

public class GiangVien implements Comparable<GiangVien> {
    private String ma, ten, mon;

    public GiangVien(String ma, String ten, String mon) {
        this.ma = ma;
        this.ten = ten;
        this.mon = mon;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String monHoc() {
        String res = "";
        for (String x : mon.split("\\s+")) {
            res += Character.toUpperCase(x.charAt(0));
        }
        return res;
    }
    
    @Override
    public int compareTo(GiangVien o) {
        String []x1 = this.getTen().split("\\s+");
        String gv1 = x1[x1.length - 1];
        String []x2 = o.getTen().split("\\s+");
        String gv2 = x2[x2.length - 1];
        if (gv1.equals(gv2) == false) return gv1.compareTo(gv2);
        return this.getMa().compareTo(o.getMa());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + monHoc();
    }
}