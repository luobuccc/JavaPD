package Chapter2;

import java.util.Scanner;

/**
 * Created by PuFan on 2016/10/4.
 */
public class ArrayTest {
    static public void main(String[] args) {
        boolean mark = UserLogin.Login();
        System.out.println("Your accessable is " + mark);

    }
}

class UserLogin {
    static private String[][] ST = new String[][]{{"1", "Harry", "harry12345"}, {"2", "张三", "zhangsan"}, {"3", "李四", "李四"}};

    /**
     * @noinspection Since15, Since15, Since15, Since15
     */
    static public boolean Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input username:");
        String username = sc.nextLine();
        System.out.println("Please input password:");
        String password = sc.nextLine();
        boolean mark = false;
        for (int i = 0; i < ST.length; ++i) {
            if (ST[i][1].equals(username) && ST[i][2].equals(password))
                mark = true;
        }
        return mark;

    }
}

