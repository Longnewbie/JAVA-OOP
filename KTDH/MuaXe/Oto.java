package KTDH.MuaXe;

public class Oto extends Vehicle {
    private int maLuc, giaBan;

    public Oto(String ma, String ten, String hang, String mauSac, int maLuc, int giaBan) {
        super(ma, ten, hang, mauSac);
        this.maLuc = maLuc;
        this.giaBan = giaBan;
    }
    
    public boolean checkPrice(int t1, int t2) {
        return t1 <= this.giaBan && this.giaBan <= t2;
    }
    
    @Override
    public String toString() { 
        return super.toString() + " " + maLuc + " " + giaBan;
    }
}