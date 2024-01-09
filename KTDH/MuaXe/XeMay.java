package KTDH.MuaXe;

public class XeMay extends Vehicle {
    private int maxSpeed, giaBan;

    public XeMay(String ma, String ten, String hang, String mauSac, int maxSpeed, int giaBan) {
        super(ma, ten, hang, mauSac);
        this.maxSpeed = maxSpeed;
        this.giaBan = giaBan;
    }
    
    public boolean checkPrice(int t1, int t2) {
        return t1 <= this.giaBan && this.giaBan <= t2;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + maxSpeed + " " + giaBan;
    }
}