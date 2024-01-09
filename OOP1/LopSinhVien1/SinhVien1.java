package OOP1.LopSinhVien1;

public class SinhVien1 {
    private String name, dob;
    private double d1, d2, d3;

    public SinhVien1(String name, String dob, double d1, double d2, double d3) {
        this.name = name;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public void chuanHoa() {
        StringBuilder sb = new StringBuilder(this.dob);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.dob = sb.toString();
    }

    @Override
    public String toString() {
        return name + " " + dob + " " + String.format("%.1f", d1 + d2 + d3);
    }
}