package OOP1.Set3;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;
    private String s;
    
    public WordSet(TreeSet<String> set) {
        this.set = set;
    }
    
    public WordSet(String s) {
        this.s = s;
        set = new TreeSet<>();
        for (String x : s.split("\\s+")) this.set.add(x);
    }

    public String union(WordSet b) {
        TreeSet<String> se = new TreeSet<>();
        for (String x : this.set) se.add(x);
        for (String x : b.set) se.add(x);
        String res = "";
        for (String x : se) res += x + " ";
        return res.toString();
    }
    
    public String intersection(WordSet b) {
        String res = "";
        for (String x : this.set) {
            if (b.set.contains(x)) res += x + " ";
        }
        return res.toString();
    }
}
