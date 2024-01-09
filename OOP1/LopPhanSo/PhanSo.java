package OOP1.LopPhanSo;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        long x = gcd(tu, mau);
        tu = tu/x;
        mau = mau/x;
        return tu + "/" + mau;
    }
}