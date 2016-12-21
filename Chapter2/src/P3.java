/**
 * Created by PuFan on 2016/9/28.
 */
public class P3 {
    static public void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(b);
        for (int i = 1; i < 20; ++i) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}


