/**
 * Created by PuFan on 2016/11/2.
 */
public class StaticTest {
    static public void main(String[] args) {
        new B() {
            void f() {
                System.out.print("X");
            }
        }.f();

    }

    static class B {
        void f() {
            System.out.println("H1");
        }
    }

}

class A {

}
