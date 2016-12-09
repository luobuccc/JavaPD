package Chapter7.P20161207;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by PuFan on 2016/12/7.
 */
public class CheckInOut {
    public static void main(String[] args) {
        //using BlockingQueue
        //
        BankCard BC = new BankCard("0000001");
        ExecutorService exc = Executors.newCachedThreadPool();
        exc.execute(new BankCustomers("爸爸", +1500, 500, BC));
        exc.execute(new BankCustomers("妈妈", +1000, 800, BC));
        exc.execute(new BankCustomers("爷爷", +800, 1000, BC));
        exc.execute(new BankCustomers("大女儿", -400, 600, BC));
        exc.execute(new BankCustomers("二女儿", -300, 600, BC));
        exc.execute(new BankCustomers("三儿子", -500, 600, BC));
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exc.shutdownNow();
    }
}
