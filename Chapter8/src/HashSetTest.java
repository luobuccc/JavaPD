import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by PuFan on 2016/12/9.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> HS = new HashSet<>();
        for (int i = 0; i < 5; ++i) {
            HS.add(new String("This is " + i + " element"));
        }
        System.out.println("This HashSet have " + HS.size() + " elements.");
        Iterator<String> It = HS.iterator();
        while (It.hasNext())
            System.out.println(It.next());
    }
}
