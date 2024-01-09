package KTDH.TimKiemXe;

public class Oto extends Vehicle {
    private int maLuc, giaBan;

    public Oto(String ma, String ten, String hang, String mauSac, int maLuc, int giaBan) {
        super(ma, ten, hang, mauSac);
        this.maLuc = maLuc;
        this.giaBan = giaBan;
    }
    
    @Override
    public String toString() { 
        return super.toString() + " " + maLuc + " " + giaBan;
    }
}