package Chapter7;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by PuFan on 2016/12/2.
 */
public class P1202$1 {
    static public void main(String[] args) {
        ExecutorService exc = Executors.newCachedThreadPool();
        exc.execute(new printNum().new printEven());
        exc.execute(new printNum().new printOdd());
        exc.shutdown();
        System.out.println("The other way----------:");
        new printNum1().printEven().start();
        new printNum1().printOdd().start();

    }
}

class printNum {
    private Random ram = new Random();
    private int bound = 500;
    private int limit = 20;

    private boolean isFlag(int count) {
        if (count < limit)
            return true;
        else
            return false;
    }

    class printOdd implements Runnable {
        private int count = 0;

        public void run() {
            while (isFlag(count)) {
                int t = ram.nextInt(bound);
                if (t % 2 == 1) {
                    ++count;
                    System.out.println("Odd: " + t);
                }
            }
        }
    }

    class printEven implements Runnable {
        private int count = 0;

        public void run() {
            while (isFlag(count)) {
                int t = ram.nextInt(bound);
                if (t % 2 == 0) {
                    ++count;
                    System.out.println("Even: " + t);
                }
            }
        }
    }
}

class printNum1 {
    private Random ram = new Random();
    private int bound = 500;
    private int limit = 20;

    public boolean isFlag(int count) {
        if (count < limit)
            return true;
        else
            return false;
    }

    public Thread printOdd() {
        return new Thread() {
            private int count = 0;

            public void run() {
                while (isFlag(count)) {
                    int t = ram.nextInt(bound);
                    if (t % 2 == 1) {
                        ++count;
                        System.out.println("Odd : " + t);
                    }
                }
            }
        };
    }

    public Thread printEven() {
        return new Thread() {
            private int count = 0;

            public void run() {
                while (isFlag(count)) {
                    int t = ram.nextInt(bound);
                    if (t % 2 == 0) {
                        ++count;
                        System.out.println("Even : " + t);
                    }
                }
            }
        };
    }
}