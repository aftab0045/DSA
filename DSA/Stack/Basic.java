import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Size is : "+st.size());
        // push operation
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println("Size is : "+st.size());
        st.pop();
        // peek gives you head of stack
        System.out.println("Current Head Is : "+st.peek());

        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        // we can do multiple pop in loop
        while(st.size()>2){
            st.pop();
        }

        System.out.println(st);

        while(st.size()<5){
            st.push(3);
        }

        System.out.println(st);
    }
}
