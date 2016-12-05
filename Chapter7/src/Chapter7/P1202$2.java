package Chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by PuFan on 2016/12/2.
 *
 * @author PuFan
 */
public class P1202$2 {
    static public void main(String[] args) {
        match m = new match();
        ExecutorService exc = Executors.newCachedThreadPool();
        exc.execute(m.new rabbit());
        exc.execute(m.new tortoise());
        exc.shutdown();
    }
}

class match {
    private static int time = 0;
    private int meters = 1000;
    private boolean flag = true;

    private synchronized int getTime() {
        try {
            Thread.sleep(1000);
            return ++time;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public class rabbit extends Thread {
        private int nowmeters = 0;
        private int rabbitSpeed = 5;
        private int rab_restM = 20;

        public rabbit() {
            //start();
        }

        public void run() {
            while (flag) {
                if (nowmeters >= meters) {
                    System.out.println("Rabbit Win!");
                    flag = false;
                    return;
                }
                nowmeters = rabbitSpeed * getTime();
                System.out.println("Rabbit running " + nowmeters + " meters");
                if (nowmeters % rab_restM == 0)
                    try {
                        TimeUnit.MILLISECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
    }

    public class tortoise extends Thread {
        private int nowmeters = 0;
        private int tortoiseSpeed = 1;
        private int tor_restM = 100;

        public tortoise() {
            //start();
        }

        public void run() {
            while (flag) {
                if (nowmeters >= meters) {
                    System.out.println("Tortoise Win!");
                    flag = false;
                    return;
                }
                nowmeters = tortoiseSpeed * getTime();
                System.out.println("Tortoise running " + nowmeters + " meters");
                if (nowmeters % tor_restM == 0)
                    try {
                        TimeUnit.MILLISECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
    }
}
