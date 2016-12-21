import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PuFan on 2016/12/16.
 */
public class Main {
    public static void main(String[] args) {
        String rx = "QunHe";
        String rx1 = "^[//w]*QunHe", rx2 = "^Q[//w*]*unHe", rx3 = "^Qu[//w*]nHe", rx4 = "^Qun[//w*]He", rx5 = "^QunH[//w*]e", rx6 = "^QunHe[//w*]";
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String src = in.nextLine();
            Matcher m1 = Pattern.compile(rx1).matcher(src);
            Matcher m2 = Pattern.compile(rx2).matcher(src);
            Matcher m3 = Pattern.compile(rx3).matcher(src);
            Matcher m4 = Pattern.compile(rx4).matcher(src);
            Matcher m5 = Pattern.compile(rx5).matcher(src);
            Matcher m6 = Pattern.compile(rx6).matcher(src);
            int flag = 0;
            if (m1.find()) ++flag;
            if (m2.find()) ++flag;
            if (m3.find()) ++flag;
            if (m4.find()) ++flag;
            if (m5.find()) ++flag;
            if (m6.find()) ++flag;
            System.out.println(flag);
            if (flag == 1 || flag == 0)
                System.out.println("Yes");
            else
                System.out.println("No");


        }


    }
}
