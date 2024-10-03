// Remove from bottom
import java.util.*;
public class problem4 {

    static void removeAtIDX(Stack<Integer> st, int IDX){
        Stack<Integer> temp = new Stack<>();

        while(st.size()>IDX){
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size()>0) {
            st.push(temp.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        removeAtIDX(st, 2);
        System.out.println(st);
    }
}
