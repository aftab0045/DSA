// Insert element at IDX 

import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        int num = 10;
        int IDX = 3;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>=IDX){
            temp.push(st.pop());
        }
        st.push(num);

        while (temp.size()>0) {
            st.push(temp.pop());
        }

        System.out.println("After Insert At IDX "+IDX+" Stack Is : ");
        System.out.println(st);
    }
}
