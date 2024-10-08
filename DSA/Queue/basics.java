// Basics of queue

import java.util.*;
public class basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q);          // Display

        q.remove();                     // Remove top element from queue 
        System.out.println(q);

        System.out.println(q.element());           // Display Top element

        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(" Size Is : "+q.size());
        
    }
}
