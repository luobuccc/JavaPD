/**
 * Created by PuFan on 2016/11/16.
 *
 * @author PuFan
 */
public class StackTest {
    static public void main(String[] args) {
        ListStack<String> S = new ListStack<>(10);
        for (String s : "This is a LinkedStack Test".split(" "))
            S.push(s);
        String st;
        while ((st = S.pop()) != null)
            System.out.println(st);
    }
}

class LinkedStack<T> {
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

class ListStack<T> {
    private int top = -1;
    private int maxsize;
    private Object[] element;

    public ListStack(int maxsize) {
        this.maxsize = maxsize;
        element = new Object[maxsize];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == maxsize - 1;
    }

    public boolean push(T val) {
        if (isFull()) return false;
        else {
            element[++top] = val;
            return true;
        }
    }

    public T peek() {
        if (!isEmpty())
            return (T) element[top];
        else return null;
    }

    public T pop() {
        if (!isEmpty()) {
            return (T) element[top--];
        } else return null;
    }
}

