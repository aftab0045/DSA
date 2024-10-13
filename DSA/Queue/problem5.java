// reorder Queue 
// i/p = 1 2 3 4 5 6 7 8
// o/p = 1 5 2 6 3 7 4 8

import java.util.*;
public class problem5 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        
        System.out.println("Orignal Queue is : "+ q);          // 1 2 3 4 5 6 7 8

        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i = 1; i <= n/2; i++){
            st.push(q.remove());             // q = 5 6 7 8       st = 4 3 2 1
        }
        
        while(st.size() != 0){
            q.add(st.pop());               // q = 5 6 7 8 4 3 2 1
        }

        for(int i = 1; i <= n/2; i++){
            st.push(q.remove());            // q = 4 3 2 1     st = 8 7 6 5
        }

        while (st.size() != 0) {
            q.add(st.pop());               
            q.add(q.remove());
        }

        while (q.size() != 0) {
            st.push(q.remove());
        }

        while (st.size() != 0) {
            q.add(st.pop());
        }

        System.out.println("After Reorder Queue Is : "+ q);
        
    }
}
