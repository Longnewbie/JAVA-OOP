package KTDH.GiaBanGiamDan;

public class Vehicle {
    protected String ma, ten, hang, mauSac;

    public Vehicle(String ma, String ten, String hang, String mauSac) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mauSac = mauSac;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + hang + " " + mauSac;
    }
}