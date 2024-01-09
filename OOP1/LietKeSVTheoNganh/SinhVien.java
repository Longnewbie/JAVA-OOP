package OOP1.LietKeSVTheoNganh;

public class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    
    public void chuanHoa() {
        String res = "";
        for (String x : ten.split("\\s+")) {
            res += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) res += Character.toLowerCase(x.charAt(i));
            res += " ";
        }
        ten = res.trim();
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}