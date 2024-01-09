package KTDH.PersonStudentStaff;

public class Person {
    private String ten, diaChi;

    public Person(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Full Name : " + ten + "\n" + "Address : " + diaChi;
    }
}