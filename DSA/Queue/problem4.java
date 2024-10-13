// Implement Queue using stack 

import java.util.*;
public class problem4 {

    public static class QueueStack{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        // pop and peek efficent
        void add(int val){
            if(st.size() == 0){
                st.push(val);
            }

            else{
                while(st.size() != 0){
                    helper.push(st.pop());
                }
                st.push(val);
                while(helper.size() != 0){
                    st.push(helper.pop());
                }
            }
        }

        int top(){
            System.out.print("Top is : ");
            return st.peek();
        }

        int remove(){
            int data = st.peek();
            st.pop();
            return data;
        }

        void display(){
            while (st.size() != 0) {
                System.out.print(st.peek()+" ");
                helper.push(st.pop());
            }
            while (helper.size() != 0) {
                st.push(helper.pop());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueStack q = new QueueStack();
        q.add(1);
        q.add(2);
        q.display();
        System.out.println(q.top());
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.remove());
    }
}
