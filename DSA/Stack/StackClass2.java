public class StackClass2 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LLStack{
        Node head = null;
        int size = 0;

        // push method
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        // pop method
        int pop(){
            if(size == 0){
                System.out.println("Stack Is Empty !");
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        // peek method
        int peek(){
            if(size == 0){
                System.out.println("Stack Is Empty !");
                return -1;
            }

            return head.data;
        }

        // return size of linkedlit
        int size(){
            return size;
        }

        // isEmpty
        boolean isEmpty(){
            if(size == 0)  return true;
            else return false;
        }

        // display reversw
        void displayrev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        // display in order 
        void displayRecursive(Node head){
            Node temp = head;
            if(temp == null)  return;

            displayRecursive(temp.next);
            System.out.print(temp.data+" ");
        }

        void display(){
            displayRecursive(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();

        st.push(1);
        st.push(2);
        st.push(3);

        st.display();
        System.out.println("Top : "+st.peek());

        st.pop();
        System.out.println("Top : "+st.peek());

        st.pop();
        System.out.println(st.size);

    }
}


