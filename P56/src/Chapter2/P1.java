package Chapter2;

import java.util.Scanner;

/**
 * Created by PuFan on 2016/9/28.
 */
public class P1 {
    /**
     * @noinspection Since15, Since15, Since15
     */
    static public void main(String[] args) {
        System.out.println("Please input the number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean mark = false;
        for (int i = 2; i <= Math.sqrt(number); ++i) {
            if ((number % i) == 0) {
                mark = true;
            }
        }
        if (mark)
            System.out.print(number + " is not a prime");
        else
            System.out.print(number + " is a prime");
    }
}
