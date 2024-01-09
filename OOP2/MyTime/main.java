package OOP2.MyTime;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3, 5));
        int second = Integer.parseInt(s.substring(6, 8));
        TimeLine x = new TimeLine(hour, minute, second);
        
        x.nextSecond();
        System.out.println(x);
        x.lastSecond();
        
        x.nextMinute();
        System.out.println(x);
        x.lastMinute();
        
        x.nextHour();
        System.out.println(x);
        x.lastHour();
        
        x.lastSecond();
        System.out.println(x);
        x.nextSecond();
        
        x.lastMinute();
        System.out.println(x);
        x.nextMinute();
        
        x.lastHour();
        System.out.println(x);
        x.nextHour();
    }
}