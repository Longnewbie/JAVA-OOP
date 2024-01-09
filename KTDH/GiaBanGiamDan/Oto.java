package KTDH.GiaBanGiamDan;

public class Oto extends Vehicle implements Comparable<Oto> {
    private int maLuc, giaBan;

    public Oto(String ma, String ten, String hang, String mauSac, int maLuc, int giaBan) {
        super(ma, ten, hang, mauSac);
        this.maLuc = maLuc;
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public int compareTo(Oto o) {
        if (this.giaBan != o.giaBan) return o.giaBan - this.giaBan;
        return this.ma.compareTo(o.ma);
    }
    
    @Override
    public String toString() { 
        return super.toString() + " " + maLuc + " " + giaBan;
    }
}