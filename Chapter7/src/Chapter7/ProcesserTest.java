package Chapter7;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by PuFan on 2016/12/7.
 */
public class ProcesserTest {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("producer thread running...");
            wait();
            System.out.println("resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        TimeUnit.SECONDS.sleep(2);
        synchronized (this) {
            System.out.println("waiting for return key...");
            in.nextLine();
            System.out.println("return key pressed...");
            notify();
            TimeUnit.SECONDS.sleep(5);
        }
    }

}

class Test {
    static public void main(String[] args) {
        ProcesserTest pro = new ProcesserTest();
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pro.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pro.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        th2.start();
        th1.start();

    }
}
