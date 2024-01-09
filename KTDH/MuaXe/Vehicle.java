package KTDH.MuaXe;

public class Vehicle {
    private String ma, ten, hang, mauSac;

    public Vehicle(String ma, String ten, String hang, String mauSac) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mauSac = mauSac;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + hang + " " + mauSac;
    }
}