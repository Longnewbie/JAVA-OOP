package KTDH.KeThuaLopPerson;

public class Student extends Person {
    private String ma, lop;
    private double gpa;

    public Student(String ma, String ten, String ngSinh, String diaChi, String lop, double gpa) {
        super(ten, ngSinh, diaChi);
        this.ma = ma;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return ma + " " + super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}