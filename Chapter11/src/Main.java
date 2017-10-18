import java.util.Scanner;

/**
 * Created by PuFan on 2017/5/20 20:32 /JavaPD
 */
public class Main {
    public static void main(String[] args) {
        String t;
        int n, a, b, l, r;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();
        t = sc.nextLine();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int temp = (i + b) % n;
            if ((temp >= l && temp <= r) && (temp % 2 == 0))
                s.append('A');
            if ((temp >= l && temp <= r) && (temp % 2 == 1))
                s.append('T');
            if ((temp < l || temp > r) && (temp % 2 == 0))
                s.append('G');
            if ((temp < l || temp > r) && (temp % 2 == 1))
                s.append('C');
        }


        String parent = s.toString();
        //String child = "e";

        String[] arr = ("," + parent.toLowerCase() + ",").split(t);
        System.out.println(arr.length - 1);
        //System.out.println(s);

    }
}
