package OOP2.GiaiCuu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine().substring(8));
        int blood = Integer.parseInt(sc.nextLine().substring(8));
        String x = sc.nextLine();
        boolean alive = false;
        if (x.equals("ALIVE")) alive = true;
        Rescue res = new Rescue(power, blood, alive);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String tmp = sc.nextLine();
            if (tmp.equals("mushroom")) res.mushroom();
            else if (tmp.equals("pea")) res.pea();
            else if (tmp.charAt(0) == 's') res.soldier(Integer.parseInt(tmp.substring(8)));
            else res.witch(Integer.parseInt(tmp.substring(6)));
            System.out.println(res);
        }
    }
}