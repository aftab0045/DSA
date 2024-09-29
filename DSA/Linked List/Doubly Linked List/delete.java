public class delete {

    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node deleteAthead(Node head) {
        head = head.next;  // Move head to the next node
        
        
        head.prev = null;
        
        
        return head;
    }

    static Node deleteAtEnd(Node head){
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }
    
    static Node deleteAtIDX(int IDX,Node head){
        Node temp = head;
        for(int i = 1; i < IDX-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;

        return head;
    }

    static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        System.out.println("Orignal List is : ");
        display(a);

        System.out.println("After deletion At IDX : ");
        // Node ans = deleteAtEnd(a);
        // display(ans);

        Node ans1 = deleteAtIDX(3, a);
        display(ans1);
    }    
}
