package Chapter7.P20161207;

import java.util.concurrent.TimeUnit;

/**
 * Created by PuFan on 2016/12/7.
 */
public class BankCustomers implements Runnable {
    private final String name;
    private final BankCard.CustomerQueue customerQueue;
    private int amount;
    private int frequency;

    public BankCustomers(String name, int amount, int frequency, BankCard bc) {
        this.name = name;
        this.amount = amount;
        this.frequency = frequency;
        this.customerQueue = bc.getQue();
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(frequency);
                BankCard account = customerQueue.take();
                account.operate(amount);
                System.out.println(name + " " + amount + "￥");
                System.out.println(account);
                customerQueue.put(account);
            }
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
    }
}
