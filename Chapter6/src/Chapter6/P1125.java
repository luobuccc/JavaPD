package Chapter6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PuFan on 2016/11/25.
 */
public class P1125 {
    static String[] Split(String src) {
        return src.split("[,|.|\\s]");
    }

    static String[] Split1(String src) {
        List<String> L = new LinkedList<>();
        Matcher m = Pattern.compile("(\\w*)[,|.|\\s]").matcher(src);
        while (m.find())
            L.add(m.group(1));
        return L.toArray(new String[0]);
    }

    static String encrypt(String src) {
        char[] sc = src.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sc.length; ++i) {
            if (sc[i] == 'z')
                sb.append('a');
            else if (sc[i] == 'Z')
                sb.append('A');
            else
                sb.append((char) (sc[i] + 1));
        }
        return sb.toString();
    }

    static String decrypt(String src) {
        char[] sc = src.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sc.length; ++i) {
            if (sc[i] == 'a')
                sb.append('z');
            else if (sc[i] == 'A')
                sb.append('Z');
            else
                sb.append((char) (sc[i] - 1));
        }
        return sb.toString();
    }

    static public void main(String[] args) {
        String test = "a<tr>aava </tr>abb ";
        String test2 = "<tr>";
        String reg = "<.++>";
        String reg2 = "<tr>";
        System.out.println(test.replaceAll(reg, "###"));
        System.out.println(test2.replaceAll(reg2, "###"));
        System.out.println(Arrays.toString(Split("no pains,no gains")));
        System.out.println(Arrays.toString(Split1("no pains,no gains.")));//修改源字符串符合语法规则。
        System.out.println(decrypt(encrypt("abcdeABCDEzZ")));
    }
}
