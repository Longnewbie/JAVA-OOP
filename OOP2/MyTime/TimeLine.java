package OOP2.MyTime;

public class TimeLine {
    private int hour, minute, second;

    public TimeLine(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void nextHour(){
        this.hour = (this.hour+1)%24;
    }
    
    public void nextMinute(){
        this.minute = this.minute+1;
        if(this.minute==60){
            this.minute = 0;
            nextHour();
        }
    }
    
    public void nextSecond(){
        this.second = this.second+1;
        if(this.second == 60){
            this.second = 0;
            nextMinute();
        }
    }
    
    public void lastHour(){
        this.hour = (this.hour - 1 + 24)%24;
    }
    
    public void lastMinute(){
        this.minute = this.minute - 1;
        if(this.minute == -1){
            this.minute = 59;
            lastHour();
        }
    }
    
    public void lastSecond(){
        this.second = this.second - 1;
        if(this.second == -1){
            this.second = 59;
            lastMinute();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
    }
}