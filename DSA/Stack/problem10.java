import java.util.Stack;

public class problem10 {

    public static class MinStack{
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty()){
            min.push(val);
        }
        else{
            if(st.peek()>min.peek()){
                min.push(min.peek());
            }
            else{
                min.push(val);
            }
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
    }
    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(7);
        st.pop();
        st.getMin();
        st.top();
    }
}
