import java.util.*;
public class problem5 {

    static void copyEle(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
       // In temp elements reversly store 

        Stack<Integer> temp2 = new Stack<>();
        while(temp.size()>0){
            temp2.push(temp.pop());
        }
        System.out.println(temp2);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        copyEle(st);
    }
}
