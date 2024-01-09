package KTDH.PersonStudentStaff;

public class Student extends Person implements Comparable<Student>{
    private String program;
    private int year, hocPhi;

    public Student(String ten, String diaChi, String program, int year, int hocPhi) {
        super(ten, diaChi);
        this.program = program;
        this.year = year;
        this.hocPhi = hocPhi;
    }
    
    @Override
    public int compareTo(Student o) {
        if (this.hocPhi != o.hocPhi) {
            if (this.hocPhi > o.hocPhi) return -1;
            else return 1;
        }
        return super.getTen().compareTo(o.getTen());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Program : " + program + "\n" +
               "Year : " + year + "\n" + 
               "Fee : " + hocPhi + " $\n" + 
               "-----------------";
    }
}