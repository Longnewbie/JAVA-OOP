package OOP1.Set1;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;

    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }
    
    public IntSet(int a[]) {
        set = new TreeSet<>();
        for (int x : a) this.set.add(x);
    }
    
    public IntSet intersection(IntSet b) {
        TreeSet<Integer> intersection = new TreeSet<>();
        for (int x : this.set) {
            if (b.set.contains(x)) intersection.add(x);
        }
        IntSet res = new IntSet(intersection);
        return res;
    }
    
    @Override
    public String toString() {
        String res = "";
        for (int x : this.set) res += x + " ";
        return res.toString();
    }
}
