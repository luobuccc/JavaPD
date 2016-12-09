/**
 * Created by PuFan on 2016/11/16.
 *
 * @author PuFan
 */
public class StackTest {
    static public void main(String[] args) {
        Stack<String> S = new Stack<>();
        for (String s : "This is a Stack Test".split(" "))
            S.push(s);
        String st;
        while ((st = S.pop()) != null)
            System.out.println(st);
    }
}

class Stack<T> {
    Node<T> top = new Node<T>();//End sentinel 末端哨兵

    public void push(T element) {
        top = new Node<>(element, top);
    }

    public T pop() {
        T result = top.element;
        if (!top.end())
            top = top.next;
        return result;
    }

    static private class Node<T> {
        private T element;
        private Node<T> next;

        public Node() {
            this.next = null;
            this.element = null;
        }

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        boolean end() {
            return this.next == null && this.element == null;
        }
    }
}
