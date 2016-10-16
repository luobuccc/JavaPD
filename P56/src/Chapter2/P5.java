package Chapter2;

/**
 * Created by PuFan on 2016/9/30.
 */
public class P5 {
    static public void main(String[] args) {
        int k = 1;
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j < i; ++j)
                System.out.print((k++) + " ");
            System.out.println();
        }
    }
}
