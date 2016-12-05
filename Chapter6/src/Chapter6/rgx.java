package Chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PuFan on 2016/11/23.
 */

public class rgx {
    static public void main(String[] args) {
        int count = 0;
        String str = "java ajava bjavac djavadoc java";
        String pat = "java";
        Matcher m = Pattern.compile(pat).matcher(str);
        while (m.find())
            ++count;
        System.out.println(count);


    }
}
