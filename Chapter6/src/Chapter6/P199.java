package Chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PuFan on 2016/11/18.
 */
public class P199 {
    static public void main(String[] args) {
        String test = "String testString StringtestString Stringtest test";
        System.out.println(new P1().count(test));
        System.out.println(new P1().count1(test));
        System.out.println(new P2().count(test, "test"));
        System.out.println(new P2().count1(test, "test"));
        System.out.println(new P2().count2(test, "test"));
        // System.out.println(Arrays.toString(new P3().create(5)));
    }
}

class Tuple3<U, V, T> {
    public final U item1;
    public final V item2;
    public final T item3;

    public Tuple3(U item1, V item2, T item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return "Tuple3{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                '}';
    }
}

class P1 {
    Tuple3<Integer, Integer, Integer> count(String src) {
        int a = 0, b = 0, c = 0;
        for (char s : src.toCharArray()) {
            if (s >= 'A' && s <= 'Z')
                ++a;
            else if (s >= 'a' && s <= 'z')
                ++b;
            else
                ++c;
        }
        return new Tuple3<>(a, b, c);
    }

    Tuple3<Integer, Integer, Integer> count1(String src) {
        int a = 0, b = 0, c = 0;
        Matcher m1 = Pattern.compile("[A-Z]").matcher(src);
        Matcher m2 = Pattern.compile("[a-z]").matcher(src);
        Matcher m3 = Pattern.compile("[^A-Za-z]").matcher(src);
        while (m1.find())
            ++a;
        while (m2.find())
            ++b;
        while (m3.find())
            ++c;
        return new Tuple3<>(a, b, c);
    }
}

class P2 {
    int count(String src, String pat) {
        int count = 0;
        Matcher m = Pattern.compile(pat).matcher(src);

        while (m.find())
            ++count;
        return count;
    }

    int count1(String src, String pat) {    //BFMatch
        int count = 0;
        int i, j;
        for (i = 0; i <= src.length() - pat.length(); ++i) {
            for (j = 0; j < pat.length(); ++j) {
                if (src.charAt(i + j) != pat.charAt(j))
                    break;
            }
            if (j == pat.length())
                ++count;
        }
        return count;
    }

    int count2(String src, String pat) {
        int count = 0;
        int i = src.indexOf(pat);
        while (i != -1) {
            src = src.substring(i + pat.length());
            count++;
            i = src.indexOf(pat);
        }
        return count;
    }

}

class P3 {
    private char[] array = new char[26];

    {                                       //实例初始化
        for (int i = 0; i < 26; i++)
            array[i] = (char) ('a' + i);
    }
/*
    char[] create(int i) {
        char dst[] = new char[i];
        Random ram = new Random(System.currentTimeMillis());
        for (int j = 0; j < i; j++)
            dst[j] = array[ram.nextInt(26)];
        Arrays.sort(dst);
        return dst;
    }
    */
}
