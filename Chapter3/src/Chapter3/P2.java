package Chapter3;

/**
 * Created by PuFan on 2016/10/14.
 */
public class P2 {
    static public void main(String[] args) {
        Counter ct = new Counter();
        System.out.println(ct);
        ct.incretment();
        ct.incretment();
        System.out.println(ct);
        ct.reset();
        System.out.println(ct);
    }
}

class Counter {
    private int count = 0;

    public Counter() {
        count = 0;
    }

    public void reset() {
        count = 0;
    }

    public void incretment() {
        ++count;
    }

    public void decrement() {
        if (count > 0) --count;
    }

    public String toString() {
        return "Count: " + count;
    }
}
