package OOP1.BangDiem;

public class BangDiem {
    private String ma, ten;
    private double avg;

    public BangDiem(String ma, String ten, double avg) {
        this.ma = ma;
        this.ten = ten;
        this.avg = avg;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    
    public String xepLoai() {
        if (avg >= 9) return "XUAT SAC";
        else if (avg >= 8) return "GIOI";
        else if (avg >= 7) return "KHA";
        else if (avg >= 5) return "TB";
        return "YEU";
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f", avg) + " " + xepLoai();
    }
}