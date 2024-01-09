package OOP1.LopPhanSo1;

public class PhanSo {
    private long tu, mau;

    public PhanSo() {
        
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public PhanSo rutGon(PhanSo x) {
        long tmp = gcd(x.tu, x.mau);
        x.tu = x.tu / tmp;
        x.mau = x.mau / tmp;
        return x;
    }
    
    public PhanSo cong(PhanSo tmp) {
        this.tu = this.tu * tmp.mau;
        tmp.tu = tmp.tu * this.mau;
        this.mau = tmp.mau = this.mau * tmp.mau;
        PhanSo x = new PhanSo();
        x.tu = this.tu + tmp.tu;
        x.mau = this.mau;
        x.rutGon(x);
        return x;
    }
    
    public PhanSo nhan(PhanSo tmp) {
        PhanSo x = new PhanSo();
        x.tu = this.tu * tmp.tu;
        x.mau = this.mau * tmp.mau;
        x.rutGon(x);
        return x;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}