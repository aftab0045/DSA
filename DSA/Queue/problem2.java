// Revrese First k elements

import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        int k = 3;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Orignal Queue : ");
        System.out.println(q);

        Stack<Integer> st = new Stack<>();

        
        while (q.size() >= k) {
            st.push(q.remove());
            }

        while (st.size() > 0) {
            q.add(st.pop());
            }
        

        int x = q.size();
        
        for(int i = 1; i <= x-k; i++){
            q.add(q.remove());
        }

        System.out.println("After Reverse Queue");
        System.out.println(q);
    }
}
