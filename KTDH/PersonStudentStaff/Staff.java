package KTDH.PersonStudentStaff;

public class Staff extends Person implements Comparable<Staff> {
    private String school;
    private int pay;

    public Staff(String ten, String diaChi, String school, int pay) {
        super(ten, diaChi);
        this.school = school;
        this.pay = pay;
    }
    
    @Override
    public int compareTo(Staff o) {
        if (this.pay != o.pay) return o.pay - this.pay;
        return super.getTen().compareTo(o.getTen());
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "School : " + school + "\n" +
               "Pay : " + pay + " $\n" + 
               "-----------------";
    }
}