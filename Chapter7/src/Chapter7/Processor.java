package Chapter7;

/**
 * Created by PuFan on 2016/12/2.
 */
public class Processor extends Thread {
    private boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Running");
        }
    }

    public void shutdown() {
        running = false;
    }
}

class App3 {
    static public void main(String[] args) {
        Processor p = new Processor();
        p.start();
        try {
            p.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
