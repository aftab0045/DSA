
public class display {

    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // print using recursion
    static void displayRecursivaly(Node head){
        Node temp = head;
        
        if(temp == null)  return;

        System.out.print(temp.data+" ");

        displayRecursivaly(temp.next);
    }

    public static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(7);
        Node d = new Node(3);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Display Usnig For Loop Linked List is : ");
        display(a);
        System.out.println();
        System.out.println("Display Linked List Using Recursion");
        displayRecursivaly(a);
    }    
}
