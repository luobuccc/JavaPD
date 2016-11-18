package Chapter5;

/**
 * Created by PuFan on 2016/11/11.
 */
public class ExceptionDemo {
    public static void test(String src) {
        int length = src.length();
        try {
            System.out.println(length);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }

    }

    static public void main(String[] args) {
        String str = null;
        test(str);

    }


}
