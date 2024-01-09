package OOP1.TInhGioQuanNet;

public class TimeLine {
    private String user, pass, acc, timeIn, timeOut;
    private int sumTime;

    public TimeLine(String user, String pass, String acc, String timeIn, String timeOut) {
        this.user = user;
        this.pass = pass;
        this.acc = acc;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.sumTime = 60 * (Integer.parseInt(timeOut.substring(0, 2)) - Integer.parseInt(timeIn.substring(0, 2))) + 
                           (Integer.parseInt(timeOut.substring(3)) - Integer.parseInt(timeIn.substring(3)));
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getSumTime() {
        return sumTime;
    }

    public void setSumTime(int sumTime) {
        this.sumTime = sumTime;
    }
    
    public String format_Time() {
        int hh = getSumTime() / 60, mm = getSumTime() % 60;
        return String.format("%d gio %d phut", hh, mm);
    }
    
    @Override
    public String toString() {
        return user + " " + pass + " " + acc + " " + format_Time();
    }
}