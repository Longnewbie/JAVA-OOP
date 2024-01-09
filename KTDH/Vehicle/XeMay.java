package KTDH.Vehicle;

public class XeMay extends Vehicle{
    private int maxSpeed, giaBan;

    public XeMay(String ma, String ten, String hang, String mauSac, int maxSpeed, int giaBan) {
        super(ma, ten, hang, mauSac);
        this.maxSpeed = maxSpeed;
        this.giaBan = giaBan;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + maxSpeed + " " + giaBan;
    }
}