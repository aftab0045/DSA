// Printing the doubly linked list
public class Basic {

    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    static void displayrev(Node tail){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }

    static void display2(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        // So temp is at head

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
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

        // System.out.println("Doubly Linked List Is : ");
        // display(a);

        // System.out.println("Reverse Of Doubly Linked List Is : ");
        // displayrev(e);

        System.out.println("Display Doubly when random node is given ");
        display2(e);
    }
}
