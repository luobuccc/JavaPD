package Chapter7.P20161207$1;

/**
 * Created by PuFan on 2016/12/7.
 */
public class Children extends Thread {
    private String name;
    private int time;
    private int money;
    private BankCard bc;

    public Children(String name, int time, int money, BankCard bc) {
        this.name = name;
        this.time = time;
        this.money = money;
        this.bc = bc;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bc.withdrawals(money);
            System.out.println(name + " " + money + "￥");
        }
    }
}
