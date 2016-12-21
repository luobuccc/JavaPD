import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by PuFan on 2016/12/16.
 */
public class Demo3 {

    public static void main(String[] args) {

        String s[] = {"aa", "bb", "cc", "dd", "ee"};
        LinkedList<String> L = new LinkedList<>(Arrays.asList(s));
        System.out.println(Collections.max(L));
        System.out.println(Collections.min(L));
        Collections.sort(L);
        System.out.println(Collections.binarySearch(L, "dd"));
        Collections.shuffle(L);
        System.out.println(L);
        L.toArray(new String[1]);

    }

}
