public class Insert {

    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    

    // Insert At Head Of Doubly Linkes List
    static Node inserAtHead(Node head, int val){
        Node temp = head;
        Node t = new Node(val);

        t.next = temp;
        temp.prev = t;
        head = t;

        return head;
    }

    // Insert At End
    static Node insertAtEnd(Node head, int val){
        Node temp = head;
        Node t = new Node(val);
        while (temp.next != null) {
            temp = temp.next;
        }
        // temp is at tail of linked list
        temp.next = t;
        t.prev = temp;

        return head;
    }

    //Insret In between the 2 nodes
    static Node inserAtIDX(int IDX, Node head, int random){
        Node t = new Node(random);
        Node temp = head;

        for(int i = 1; i <= IDX-1; i++){
            temp = temp.next;
        }
        // temp is at IDX-1 
        t.next = temp.next;
        temp.next.prev = t;
        temp.next = t;
        t.prev = temp;

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

        // Node ans = inserAtHead(a,0);
        // display(ans);

        // Node ans2 = insertAtEnd(a, 6);
        // display(ans2);

        Node ans3 = inserAtIDX(3, a, 99);
        display(ans3);
    }    
}
