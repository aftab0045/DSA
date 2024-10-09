import java.util.LinkedList;
import java.util.Queue;

public class problem3 {

    public static class StackUsingQueue{
    Queue<Integer> q = new LinkedList<>();

    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for(int i = 1; i <= q.size()-1; i++){
            q.add(q.remove());
        }

        int val = q.peek();
        q.remove();
        return val;
    }
    
    public int top() {
        for(int i = 1; i <= q.size()-1; i++){
            q.add(q.remove());
        }

        int top = q.peek();

        q.add(q.remove());

        return top;
    }
    
    public boolean empty() {
        if(q.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void display(){
        for(int i = 1; i <= q.size(); i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }
    }
    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue();
        st.push(1);
        st.push(2);
        st.push(3);
        
        st.display();
    }
}
