import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by PuFan on 2016/12/16.
 */
public class Demo2 {
    public static void main(String[] args) {
        String things[] = {"eggs", "water", "fish", "meat", "apples"};
        List<String> L = new LinkedList<>(Arrays.asList(things));
        String things1[] = {"BACON", "BOOKS"};
        List<String> L1 = new LinkedList<>(Arrays.asList(things1));
        L.addAll(L1);
        System.out.println(L);
        remove(L, 2, 5);
        ListIterator<String> LS = L.listIterator(3);


    }

    private static void remove(List<String> l, int i, int k) {
        l.subList(i, k).clear();
    }

}
