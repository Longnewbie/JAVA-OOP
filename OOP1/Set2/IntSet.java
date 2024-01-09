package OOP1.Set2;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;
    
    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }
    
    public IntSet(int a[]) {
        set = new TreeSet<>();
        for (int x : a) set.add(x);
    }
    
    public IntSet union(IntSet b) {
        for (int x : b.set) {
            this.set.add(x);
        }
        IntSet res = new IntSet(this.set);
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for (int x : this.set) res += x + " ";
        return res.toString();
    }
}
