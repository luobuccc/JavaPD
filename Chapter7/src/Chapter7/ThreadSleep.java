package Chapter7;

/**
 * Created by PuFan on 2016/11/30.
 *
 * @author PuFan
 */
public class ThreadSleep {
    static public void main(String[] args) {
        Thread t1 = new Thread(new SleepRunner());
        Thread t2 = new Thread(new SleepRunner1());
        t1.start();
        t2.start();
    }
}

class SleepRunner implements Runnable {
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 1000; ++i)
            System.out.println("Sleep " + i);
    }
}

class SleepRunner1 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; ++i)
            System.out.println("Normal " + i);
    }
}