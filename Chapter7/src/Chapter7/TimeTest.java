package Chapter7;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by PuFan on 2016/12/7.
 */
public class TimeTest extends TimerTask {

    @Override
    public void run() {
        System.out.println("起床...");
    }
}

class Te {
    public static void main(String[] args) {
        Timer t = new Timer();
        t.schedule(new TimeTest(), 0, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.cancel();
    }
}
