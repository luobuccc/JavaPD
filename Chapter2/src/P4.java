/**
 * Created by PuFan on 2016/9/30.
 */
public class P4 {
    static public void main(String[] args) {
        char x = 'A';
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 2 * 7 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print(x + " ");
            System.out.println();
            x++;
        }
    }
}
