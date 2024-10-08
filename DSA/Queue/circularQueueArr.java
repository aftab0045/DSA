public class circularQueueArr {

    public static class CircularQueue{
        int front = -1;
        int rear = -1;
        int size = 0;

        int [] arr = new int[5];

        void add(int val) throws Exception {
            if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(size == arr.length){
                throw new Exception("Queue is full !");
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            else if(rear < arr.length-1){
                arr[++rear] = val;
            }

            size++;
        }

        int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty !");
            }
            else{
                int data = arr[front];
                if(front == arr.length-1) {
                    front = 0;
                }
                else{
                    front++;
                }
                size--;
                return data;
            }
        }

        int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty !");
            }
            return front;
        }

        boolean isEmpty(){
            if(size == 0)  return true;
            else   return false;
        }

        void display() {
            if(size == 0){
                System.out.println("[]");;
            }

            else if(front < rear){
                for(int i = front; i <= rear; i++){
                    System.out.print(arr[i]+" ");
                }

                System.out.println();
            }

            else{
                for(int i = front; i < arr.length; i++){
                    System.out.print(arr[i]+" ");
                }

                for(int i = 0; i <= rear; i++){
                    System.out.print(arr[i]+" ");
                }

                System.out.println();
            }
        }

    }
    public static void main(String[] args) throws Exception {
        CircularQueue q = new CircularQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();

        q.remove();
        q.remove();
        q.display();
    }
}
