public class Implimentaion {

    public static class queueArray{
        int f = -1;
        int r = -1;
        int size = 0;
        int [] arr = new int[10];

        // Add Elemets in Queue 
        void add(int val){

            if(r == arr.length-1){
                System.out.println("Queue Is Full !");
                return;
            }
            if(f == -1){
                f = r = 0;
                arr[0] = val;
            }

            else{
                arr[++r] = val;
            }

            size++;
        }

        // Remove Elements in queue
        int remove(){
            if(size == 0){
                System.out.println("Queue Is Empty !");
            }
            f++;
            size--;
            return f-1;
        }

        // Return Peek
        int peek(){
            if(size == 0){
                System.out.println("Queue Is Empty !");
            }
            return f;
        }

        // Check is empty
        boolean isEmpty(){
            if(size == 0)   return true;
            else  return false;
        }

        // display function
        void display(){
            if(size == 0){
                System.out.println("[]");
            }

            else{

                for(int i = f; i <= r; i++){
                    System.out.print(arr[i]+" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();

        
    }
}
