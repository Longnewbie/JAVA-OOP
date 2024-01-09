package KTDH.KeThuaLopPersonVaSapXepTheoTen;

public class Person implements Comparable<Person> {
    private String ten, ngSinh, diaChi;

    public Person(String ten, String ngSinh, String diaChi) {
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
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        ngSinh = sb.toString();
    }
    
    public String sortedName(String x) {
        String []arr = x.split("\\s+");
        String res = arr[arr.length - 1] + " ";
        for (int i = 0; i < arr.length - 1; i++) res += arr[i] + " ";
        return res.trim();
    }
    
    @Override
    public int compareTo(Person o) {
        return sortedName(this.ten).compareTo(sortedName(o.ten));
    }

    @Override
    public String toString() {
        return ten + " " + ngSinh + " " + diaChi;
    }
}