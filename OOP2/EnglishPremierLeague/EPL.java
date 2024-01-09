package OOP2.EnglishPremierLeague;

public class EPL implements Comparable<EPL> {
    private String acronyms, name_club;
    private int match, score, difference;

    public EPL(String acronyms, String name_club, int match, int difference, int score) {
        this.acronyms = acronyms;
        this.name_club = name_club;
        this.match = match;
        this.difference = difference;
        this.score = score;
    }

    public String getAcronyms() {
        return acronyms;
    }

    public void setAcronyms(String acronyms) {
        this.acronyms = acronyms;
    }
    
    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }
    
    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return acronyms + " " + name_club + " " + match + " " + difference + " " + score + "\n------------------";
    }

    @Override
    public int compareTo(EPL o) {
        if (this.score != o.score) return o.score - this.score;
        else if (this.difference != o.difference) return o.difference - this.difference;
        return this.getAcronyms().compareTo(o.getAcronyms());
    }
}