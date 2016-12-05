package Chapter7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by PuFan on 2016/12/2.
 */
public class TicketOfficeTest {
    static public void main(String[] args) {
        TicketOffice off = new TicketOffice();
        Thread t1 = new Thread(off);
        t1.start();
        Thread t2 = new Thread(off);
        t2.start();
        Thread t3 = new Thread(off);
        t3.start();
        Thread t4 = new Thread(off);
        t4.start();

    }
}

class TicketOffice implements Runnable {
    private int tickets = 0;
    private Lock lock = new ReentrantLock();

    private boolean sell() {
        boolean flag = true;
        lock.lock();
        if (tickets < 100) {
            ++tickets;
            System.out.println(Thread.currentThread().getName() + " sell " + tickets);
        } else
            flag = false;
        lock.unlock();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    public void run() {
        boolean flag = true;
        while (flag) {
            flag = sell();
        }
    }
}
