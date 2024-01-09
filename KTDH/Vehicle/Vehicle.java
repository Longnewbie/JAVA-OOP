package KTDH.Vehicle;

public class Vehicle {
    private String ma, ten, hang, mauSac;

    public Vehicle(String ma, String ten, String hang, String mauSac) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mauSac = mauSac;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + hang + " " + mauSac;
    }
}