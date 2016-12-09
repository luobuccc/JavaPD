package Chapter7.P20161207$1;

/**
 * Created by PuFan on 2016/12/7.
 */
public class BankCard {
    private String cardID;
    private volatile int balance = 0;

    public BankCard(String cardID) {
        this.cardID = cardID;
    }

    public synchronized void deposit(int money) {
        if (balance >= 5000) {
            System.out.println("Balance Overflow!");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            balance += money;
            System.out.println(this);
            this.notifyAll();
        }
    }

    public synchronized void withdrawals(int money) {
        if (money > balance) {
            System.out.println("Balance Insufficient!");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            balance -= money;
            System.out.println(this);
            this.notifyAll();
        }
    }

    @Override
    public String toString() {
        return "BankCard{" + "cardID='" + cardID + '\'' + ", balance=" + balance + '}';
    }
}
