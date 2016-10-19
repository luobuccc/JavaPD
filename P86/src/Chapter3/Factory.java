package Chapter3;

/**
 * Created by PuFan on 2016/10/19.
 */
public class Factory {
    static public void main(String[] args) {
        Product p = new Factor1().gengerate();
        Product p0 = new Factor2().gengerate();
        p.showName();
    }
}

interface Product {
    void showName();
}

interface Factor {
    Product gengerate();
}

class Product1 implements Product {
    Product1() {
        System.out.println("Product1");
    }

    public void showName() {
        System.out.print("I'm P1");
    }
}

class Product2 implements Product {
    Product2() {
        System.out.println("Product2");
    }

    public void showName() {
        System.out.print("I'm P1");
    }
}

class Factor1 implements Factor {
    public Product gengerate() {
        return new Product1();
    }
}

class Factor2 implements Factor {
    public Product gengerate() {
        return new Product2();
    }
}