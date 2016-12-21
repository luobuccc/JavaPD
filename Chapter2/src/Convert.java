/**
 * Created by PuFan on 2016/9/23.
 *
 * @author PuFan
 */
public class Convert {
    static public void main(String[] args) {
        Outer O = new Outer();
        A c = O.getA();

    }
}

class A {
    public A() {
        System.out.println("A Construct");
    }
}

class Outer {
    public Outer() {
        System.out.println("Outer Construct");
    }

    public A getA() {
        return new A() {
            private int i = 0;

            {
                System.out.println("AA Construct");
            }
        };
    }

    private class Inner {
        public Inner() {
            System.out.println("Inner Construct");
        }
    }

}