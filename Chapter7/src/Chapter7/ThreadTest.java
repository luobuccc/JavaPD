package Chapter7;

import java.util.Date;

/**
 * Created by PuFan on 2016/11/30.
 *
 * @author PuFan
 */
public class ThreadTest extends Thread {
    private String user;
    private int time;

    public ThreadTest(int time, String str) {
        this.user = str;
        this.time = time;
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest(5000, "Jack");
        ThreadTest t2 = new ThreadTest(3000, "Tom");
        t1.start();
        t2.start();

    }

    public void run() {
        while (true) {
            System.out.println(user + " Sleep" + time + new Date());
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
