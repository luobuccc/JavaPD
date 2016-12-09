package Chapter7.P20161207$1;

/**
 * Created by PuFan on 2016/12/7.
 */
public class CheckInOut {
    public static void main(String[] args) {
        BankCard bc = new BankCard("0000001");
        Thread t1 = new Thread(new Parent("爸爸", 500, 1000, bc));
        Thread t3 = new Thread(new Parent("妈妈", 600, 500, bc));
        Thread t2 = new Thread(new Children("儿子", 200, 700, bc));
        Thread t4 = new Thread(new Children("女儿", 300, 700, bc));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
