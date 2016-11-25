package Chapter6$1;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PuFan on 2016/11/23.
 */

public class StringUtils {
    static public void main(String[] args) {
        //7 24 41 46
        String test = "String testString StringtestString Stringtest test";
        String pat = "test";
        System.out.println(new P1().count(test, pat));//计算pat在test中出现多次的位置
        System.out.println(new P2().check("abcddcba"));//判断是否为回文字符串
        System.out.println(new P3().getUserName("01234ABCD@qq.com"));//截取Email用户名并返回 方法一
        System.out.println(new P3().getUserName1("01234ABCD@qq.com"));//截取Email用户名并返回 方法二
        System.out.println(new P4().count("abbaaccaaddeeaaffaa", 'a'));//统计字符在字符串中出现次数 方法一
        System.out.println(new P4().count1("abbaaccaaddeeaaffaa", 'a'));//统计字符在字符串中出现次数 方法二
        System.out.println(new P5().leftPad("ABCD", 5, '#'));//字符串左部填充
        System.out.println(Arrays.toString(new P3$().create(5)));//生成随机数组并排序
        getDate.printDate(new getDate().getFirstDayOfThisWeek());//获取本周第一天
        getDate.printDate(new getDate().getFirstDayOfLastWeek());//获取上周第一天
        getDate.printDate(new getDate().getFirstDayOfThisMouth());//获取本月第一天
        getDate.printDate(new getDate().getFirstDayOfLastMouth());//获取上月第一天
    }
}

class P1 {
    char[] count(String src, String pat) {
        List<Integer> L = new LinkedList<>();
        int i = src.indexOf(pat, 0);
        while (i != -1) {
            L.add(i);
            i = src.indexOf(pat, i + pat.length());
        }
        return Arrays.toString(L.toArray()).toCharArray();
    }
}

class P2 {
    boolean check(String src) {
        char[] str = src.toCharArray();
        for (int i = 0, j = str.length - 1; i < str.length / 2 - 1 && j >= str.length / 2 - 1; ++i, --j) {
            if (str[i] != str[j])
                return false;
        }
        return true;
    }
}

class P3 {
    String getUserName(String src) {
        String[] res = src.split("@");
        if (res.length != 0)
            return res[0];
        else
            return "UserName Not Found";
    }

    String getUserName1(String src) {
        Matcher m = Pattern.compile("(\\w+)(@)").matcher(src);
        if (m.find())
            return m.group(1);
        else
            return "UserName Not Found";
    }
}

class P4 {
    int count(String src, Character c) {
        String[] str = src.split(c.toString() + '+');
        if (src.charAt(src.length() - 1) == c)
            return str.length;
        else
            return str.length - 1;
    }

    int count1(String src, Character c) {
        int count = 0;
        char[] str = src.toCharArray();
        if (str[0] == c) ++count;
        for (int i = 1; i < str.length; ++i)
            if (str[i] == c && str[i - 1] != c)
                count++;
        return count;
    }
}

class P5 {
    String leftPad(String str, int length, char c) {
        StringBuilder sub = new StringBuilder();
        for (int i = 0; i < length; ++i)
            sub.append(c);
        String newS = sub.toString();
        return newS.concat(str);
    }
}

class P3$ {
    Character[] create(int i) {
        Set<Character> S = new TreeSet<>();
        Random ram = new Random(System.currentTimeMillis());
        while (S.size() < i)
            S.add((char) (ram.nextInt(26) + 'a'));
        return S.toArray(new Character[0]);
    }
}

class getDate {
    static public void printDate(Date src) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd E");
        System.out.println(sdf.format(src));
    }

    Date getFirstDayOfThisWeek() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.DAY_OF_WEEK, 2);
        return now.getTime();
    }

    Date getFirstDayOfLastWeek() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.DAY_OF_WEEK, 2);
        now.set(Calendar.WEEK_OF_MONTH, now.get(Calendar.WEEK_OF_MONTH) - 1);
        return now.getTime();
    }

    Date getFirstDayOfThisMouth() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.DAY_OF_MONTH, 1);
        return now.getTime();
    }

    Date getFirstDayOfLastMouth() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.MONTH, now.get(Calendar.MONTH) - 1);
        now.set(Calendar.DAY_OF_MONTH, 1);
        return now.getTime();
    }
}