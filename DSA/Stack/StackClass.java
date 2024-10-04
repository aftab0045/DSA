public class StackClass {

    public static class stack{
        int [] arr = new int[4];
        int idx = 0;

        // Push Method
        void push(int val){
            if(size() == arr.length){
                System.out.println("Stack Is Full !");
                return;
            }

            arr[idx] = val;
            idx++;
        }

        // return size 
        int size(){
            return idx;
        }

        // pop elemnets 
        int pop(){
            if(size() == 0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        // peek element
        int peek(){
            if(size() == 0){
                System.out.println("Stack Is Empty !");
                return -1;
            }
            return arr[idx-1];
        }

        // check isFull
        boolean isFull(){
            if(size() == arr.length){
                return true;
            }
            else{
                return false;
            }
        }


        // display
        void display(){
            for(int i = 0; i <= idx-1; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }






    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();         // 1 2 3

        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isFull());
    }
}
