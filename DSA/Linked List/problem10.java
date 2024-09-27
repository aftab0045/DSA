// Remove duplicates from linkedlist
public class problem10{
    public static class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
        }
    }

    public static Node deleteDuplicates(Node head) {
        Node temp = head;

        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else if(temp.val != temp.next.val){
                temp = temp.next;
            }
        }

        return head;
    }

    
    static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // First linked list
        
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(4);  // This will be the intersection point
        Node e = new Node(5);
        Node f = new Node(5);
    
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


        Node ans = deleteDuplicates(a);
        display(a);
    }
    
        
}