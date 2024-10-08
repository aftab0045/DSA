public class Implimentation2 {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class queueLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }

            else{
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        int peek(){
            if(size == 0){
                System.out.println("Queue is empty !");
                return -1;
            }
            return head.val;
        }

        int remove(){
            if(size == 0){
                System.out.println("Queue is empty !");
                return -1;
            }

            else{
                int data = head.val;
                head = head.next;

                size--;
                return data;
            }
        }

        void display(){
            if(size == 0){
                System.out.println("Queue is empty !");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }

            System.out.println();
        }

        boolean isEmpty(){
            if(size == 0) {
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        queueLinkedList q = new queueLinkedList();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        
        q.remove();
        q.display();

        System.out.println(q.peek());
        
    }
}
