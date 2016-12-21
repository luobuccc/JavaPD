import java.util.LinkedList;

/**
 * Created by PuFan on 2016/12/16.
 */
public class P20161216_2 {
    public static void main(String[] args) {
        LinkStack<Character> LS = new LinkStack<>();
        for (int i = 0; i < 10; ++i)
            LS.push((char) ('A' + i));
        while (!LS.isEmpty())
            System.out.println(LS.pop());
    }
}

class LinkStack<T> {
    private LinkedList<T> array = new LinkedList<T>();

    public int size() {
        return array.size();
    }

    public boolean isEmpty() {
        return array.size() == 0;
    }

    public boolean push(T val) {
        array.add(val);
        return true;
    }

    public T peek() {
        return array.get(array.size() - 1);
    }

    public T pop() {
        return array.remove(array.size() - 1);
    }
}
