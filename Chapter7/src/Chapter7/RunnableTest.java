package Chapter7;

/**
 * Created by PuFan on 2016/11/30.
 *
 * @author PuFan
 */
public class RunnableTest implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; ++i) {
            System.out.println(i);
        }
    }
}

class T {
    static public void main(String[] args) {
        RunnableTest r = new RunnableTest();
        Thread th = new Thread(r);
        th.setName("蛤");
        th.start();
        System.out.println(Thread.currentThread().getState());
        System.out.println(th.getName());
        System.out.println(th.getState());
    }
}
