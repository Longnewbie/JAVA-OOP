package OOP1.LopTime;

public class Time {
    private int gio, phut, giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public int getTime() {
        return 3600 * gio + 60 * phut + giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}