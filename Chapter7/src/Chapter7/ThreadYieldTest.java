package Chapter7;

/**
 * Created by PuFan on 2016/12/2.
 */
public class ThreadYieldTest implements Runnable {

    public void run() {
        for (int i = 0; i <= 20; ++i) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class V {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadYieldTest());
        t1.start();
        for (int i = 0; i < 50; ++i) {
            System.out.println(Thread.currentThread().getName());
            if (i == 30) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}