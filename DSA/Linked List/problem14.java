/* odd even linked list in that we have to link the linkedlist in that way
 such that odd IDX connet to odd and even IDX conct to even and at last odd end connet to even head 
 EX .
  I/P : 1 -> 2 -> 3 -> 4 -> 5
  O/P : 1 -> 3 -> 5 -> 2 -> 4
  */ 
public class problem14 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node oddEvenList(Node head) {
        Node odd = new Node(0);
        Node even = new Node(0);
        Node tempo = odd;
        Node tempe = even;
        Node temp = head;

        while(temp != null){
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;

            tempe.next = temp;
            if(temp == null){
                break;
            }
            temp = temp.next;
            tempe = tempe.next;
        }

        odd = odd.next;
        even = even.next;

        tempo.next = even;

        return odd;
    }

    static void display(Node head){
        Node temp = head;
        if(temp == null){
            System.out.println();
            return;
        }

        System.out.print(temp.data+" ");

        display(temp.next);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);  
        Node e = new Node(5);
        Node f = new Node(6);
    
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Given Linked List Is :");
        display(a);

        System.out.println("Odd Even List Is :");
        Node ans = oddEvenList(a);
        display(ans);
    }
}
