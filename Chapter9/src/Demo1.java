import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PuFan on 2016/12/16.
 */
public class Demo1 {
    public static void main(String[] args) {
        String things[] = {"eggs", "water", "fish", "meat", "apples"};
        List<String> L = new ArrayList<>(Arrays.asList(things));
        //Collections.addAll(L,things);
        System.out.println(L);

        String things1[] = {"eggs", "water", "fish", "EHE"};
        List<String> L2 = new ArrayList<>(Arrays.asList(things1));
        Iterator<String> it = L2.iterator();
        while (it.hasNext())
            if (L.contains(it.next()))
                it.remove();
        System.out.println(L2);


    }
}
