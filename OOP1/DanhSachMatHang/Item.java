package OOP1.DanhSachMatHang;

public class Item {
    private String ma, tenMH, dvTinh;
    private int giaMua, giaBan;

    public Item(String ma, String tenMH, String dvTinh, int giaMua, int giaBan) {
        this.ma = ma;
        this.tenMH = tenMH;
        this.dvTinh = dvTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public int getLoiNhuan() {
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return ma + " " + tenMH + " " + dvTinh + " " + giaMua + " " + giaBan + " " + getLoiNhuan();
    }
}