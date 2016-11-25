package Chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PuFan on 2016/11/23.
 */

public class rgx {
    static public void main(String[] args) {
        String str = "java ajava bjvac djavadoc java";
        String str1 = "Lcmaasasa";
        String pat = "\\.*java\\.*";
        String pat1 = "^[a-zA-z]\\w{5,19}";
        Matcher m = Pattern.compile(pat1).matcher(str1);

        System.out.println(m.matches());
    }
}
