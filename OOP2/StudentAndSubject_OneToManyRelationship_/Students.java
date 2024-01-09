package OOP2.StudentAndSubject_OneToManyRelationship_;

public class Students {
    private String ma, ten, lop;
    private double GPA;

    public Students(String ma, String ten, String lop, double GPA) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.GPA = GPA;
    }
    
    public static double AVG_GPA(int[] tinChi, double[] diem) {
        int tongTinChi = 0;
        double tongDiem = 0;
        for (int i = 0; i < tinChi.length; i++) {
            tongTinChi += tinChi[i];
            tongDiem += (tinChi[i] * diem[i]);
        }
        return tongDiem / tongTinChi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + String.format("%.2f", GPA) + "\n------------------------";
    }
}