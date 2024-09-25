

public class ClassLL {
    // Node Class
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // Linked List Class
    public static class linkedList{
        Node head = null;
        Node tail = null;

        // Add At Last 
        void addAtlast(int val){
            Node temp = new Node(val);
            if(head == null){
               head = temp;
               tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
        }
        // Add Node At Beginning
        void addAtFirst(int val){
            Node temp = new Node(val);
            if(head == null){
                temp = head = tail;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        // Add Node at IDX in between head and tail
        void addAtIDX(int IDX, int val){
            Node temp = new Node(val);
            Node t = head;
            for(int i = 1; i <= IDX-1; i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }
        // size of linked list
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        // Display Linked list
        void display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addAtlast(1);
        ll.addAtlast(2);
        ll.addAtlast(3);
        // ll.display();
        // System.out.println();
        ll.addAtFirst(0);
        // ll.display();
        // System.out.println();
        ll.addAtIDX(3, 5);
        ll.display();
        System.out.println();
        System.out.println("Size : "+ll.size());
    }    
}