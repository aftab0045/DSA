import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        // System.out.println(dq);
        dq.addFirst(0);
        System.out.println(dq);

        // dq.removeFirst();
        // System.out.println(dq);
        // dq.removeLast();
        // System.out.println(dq);

        // System.out.println(dq.peekFirst());
        // System.out.println(dq.peekLast());

        dq.add(5);
        dq.add(7);
        dq.add(9);
        dq.add(5);
        System.out.println(dq);
        dq.removeFirstOccurrence(5);
        // System.out.println(dq);
        dq.removeLastOccurrence(9);
        System.out.println(dq);
    }
}
