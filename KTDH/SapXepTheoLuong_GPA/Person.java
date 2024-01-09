package KTDH.SapXepTheoLuong_GPA;

public class Person {
    protected String ma, ten, ngSinh, diaChi;

    public Person(String ma, String ten, String ngSinh, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.ngSinh = ngSinh;
        this.diaChi = diaChi;
    }
    
    public void chuanHoa() {
       String res = "";
       for (String x : ten.split("\\s+")) {
           res += Character.toUpperCase(x.charAt(0));
           for (int i = 1; i < x.length(); i++) res += Character.toLowerCase(x.charAt(i));
           res += " ";
       }
       ten = res.trim();
       StringBuilder sb = new StringBuilder(ngSinh);
       if (sb.charAt(1) == '/') sb.insert(0, '0');
       if (sb.charAt(4) == '/') sb.insert(3, '0');
       ngSinh = sb.toString();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ngSinh + " " + diaChi;
    }
}