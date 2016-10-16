package Chapter2;

import java.util.Scanner;

/**
 * Created by PuFan on 2016/10/9.
 */
public class ScoreCal {
    /**
     * @noinspection Since15, Since15, Since15, Since15
     */
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入班级总人数：");
        int stuNum = in.nextInt();
        int count = 0;
        for (int i = 1; i <= stuNum; ++i) {
            System.out.print("请输入第" + i + "位学生的成绩：");
            int score = in.nextInt();
            if (score >= 80) {
                ++count;
            }
        }
        System.out.println("80分以上的学生人数是：" + count);
        double rate = (count * 100.0) / stuNum;
        System.out.print("80分以上学生所占的比例为：" + rate);
    }
}
