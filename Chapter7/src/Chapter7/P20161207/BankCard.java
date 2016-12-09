package Chapter7.P20161207;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by PuFan on 2016/12/7.
 */
public class BankCard {
    private String cardID;
    final private CustomerQueue que = new CustomerQueue(cardID);
    private int balance = 0;

    public BankCard(String cardID) {
        this.cardID = cardID;
        try {
            que.put(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CustomerQueue getQue() {
        return que;
    }

    public int getBalance() {
        return balance;
    }

    private boolean deposit(int money) {
        if (balance >= 5000) {
            System.out.println("Balance Overflow!");
            return false;
        } else {
            balance += money;
            return true;
        }
    }

    private boolean withdrawals(int money) {
        if (money > balance) {
            System.out.println("Balance Insufficient!");
            return false;
        } else {
            balance -= money;
            return true;
        }
    }

    public boolean operate(int money) {
        if (money >= 0)
            return deposit(money);
        else
            return withdrawals(Math.abs(money));
    }

    @Override
    public String toString() {
        return "BankCardInf: {" + "cardID='" + cardID + '\'' + ", balance=" + balance + "￥}";
    }

    public class CustomerQueue extends LinkedBlockingQueue<BankCard> {
        private final String id;

        private CustomerQueue(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }
}
