//display Stack using various methodes

import java.util.*;
public class problem3 {

    // Display using another stack
    static void display(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();

        while(st.size()>0){
            temp.push(st.pop());
        }

        while(temp.size()>0){
            System.out.print(temp.peek()+" ");
            st.push(temp.pop());
        }
    }

    // Display using Array
    static void display2(Stack<Integer> st){
        int n = st.size();
        int[] arr = new int[n];

        for(int i = n-1; i >= 0; i--){
            arr[i] = st.pop();
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }

    // Display using recurssion
    static void display3(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        display3(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        display3(st);
    }
}
