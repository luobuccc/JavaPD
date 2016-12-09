package Chapter7;

/**
 * Created by PuFan on 2016/12/7.
 */
public class Repertory {
    private int product = 0;

    public synchronized void addProduct() {
        if (product >= 5) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            ++product;
            System.out.println("生产了第 " + product + " 个产品...");
            this.notifyAll();
        }
    }

    public synchronized void getProduct() {
        if (product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("消费者消费了 " + product + " 个产品");
            --product;
            notifyAll();
        }
    }
}

class Produc implements Runnable {
    private Repertory rep;

    public Produc(Repertory rep) {
        this.rep = rep;
    }

    public void run() {
        System.out.println("开始生产...");
        while (true)
            rep.addProduct();

    }

}

class Consum implements Runnable {
    private Repertory rep;

    public Consum(Repertory rep) {
        this.rep = rep;
    }

    public void run() {
        System.out.println("消费者开始取产品...");
        while (true)
            rep.getProduct();
    }
}

class Tet {
    public static void main(String[] args) {
        Repertory rep = new Repertory();
        new Thread(new Produc(rep)).start();
        new Thread(new Consum(rep)).start();
    }

}
