package KTDH.GiaBanGiamDan;

public class XeMay extends Vehicle implements Comparable<XeMay> {
    private int maxSpeed, giaBan;

    public XeMay(String ma, String ten, String hang, String mauSac, int maxSpeed, int giaBan) {
        super(ma, ten, hang, mauSac);
        this.maxSpeed = maxSpeed;
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    
    @Override
    public int compareTo(XeMay o) {
        if (this.giaBan != o.giaBan) return o.giaBan - this.giaBan;
        return this.ma.compareTo(o.ma);
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + maxSpeed + " " + giaBan;
    }
}