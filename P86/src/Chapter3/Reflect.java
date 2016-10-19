package Chapter3;

import java.lang.reflect.Method;

/**
 * Created by PuFan on 2016/10/19.
 */
public class Reflect {
    static public void main(String[] args) {
        Class<?> c = String.class;
        Method[] m = c.getMethods();
        for (Method a : m) {
            System.out.println(a.toString());

        }
    }
}

class T1 {
    public T1() {
    }

    public void f1() {
    }

    ;

    public void f2() {
    }

    ;

}