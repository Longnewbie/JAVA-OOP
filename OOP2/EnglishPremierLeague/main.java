package OOP2.EnglishPremierLeague;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EPL[] list = new EPL[20];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= 20; i++) {
            String rank = sc.nextLine();
            String acronyms = sc.nextLine();
            String name_club = sc.nextLine();
            int match = sc.nextInt(), difference = sc.nextInt(), score = sc.nextInt();
            sc.nextLine();
            sc.nextLine();
            list[i - 1] = new EPL(acronyms, name_club, match, difference, score);
            map.put(name_club, i - 1);
        }
        for (int i = 1; i <= 10; i++) {
            String str = sc.nextLine();
            String []arr = str.split("-");
            String []arr1 = arr[0].trim().split("\\s+");
            String []arr2 = arr[1].trim().split("\\s+");
            String team1 = "", team2 = "";
            for (int j = 0; j < arr1.length - 1; j++) team1 += arr1[j] + " ";
            for (int j = 1; j < arr2.length; j++) team2 += arr2[j] + " ";
            team1 = team1.trim(); team2 = team2.trim();
            int score_team1 = Integer.parseInt(arr1[arr1.length - 1]), score_team2 = Integer.parseInt(arr2[0]);
            int p1 = map.get(team1), p2 = map.get(team2);
            list[p1].setMatch(list[p1].getMatch() + 1); list[p2].setMatch(list[p2].getMatch() + 1);
            if (score_team1 == score_team2) {
                list[p1].setScore(list[p1].getScore() + 1);
                list[p2].setScore(list[p2].getScore() + 1);
            } else if (score_team1 > score_team2) {
                list[p1].setScore(list[p1].getScore() + 3);
                list[p2].setDifference(list[p2].getDifference() - (score_team1 - score_team2));
                list[p1].setDifference(list[p1].getDifference() + (score_team1 - score_team2));
            } else {
                list[p2].setScore(list[p2].getScore() + 3);
                list[p1].setDifference(list[p1].getDifference() - (score_team2 - score_team1));
                list[p2].setDifference(list[p2].getDifference() + (score_team2 - score_team1));
            }
        }
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println("#" + (i + 1) + " " + list[i]);
        }
    }
}