// Reverse Stack elements in orignal stack 

import java.util.*;
public class problem6 {

    static void revereEle(Stack<Integer> st){
        System.out.println("Orignal Stack : ");
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
       // In temp elements reversly store 

        Stack<Integer> temp2 = new Stack<>();
        while(temp.size()>0){
            temp2.push(temp.pop());
        }
        // In temp2 elements are stored same order as st

        while(temp2.size()>0){
            st.push(temp2.pop());
        }

        System.out.println("After Reverse In same Stack : ");
        System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        revereEle(st);
    }
}
