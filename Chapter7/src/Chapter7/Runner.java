package Chapter7;

/**
 * Created by PuFan on 2016/12/2.
 */
public class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 100; ++i)
            System.out.println(i);
    }
}


class App1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner());
        t1.start();
        Thread t2 = new Thread(new Runner());
        t2.start();
    }
}

class App2 {
    public static void main(String[] args) {
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i)
                    System.out.println(i);
            }
        });
    }
}