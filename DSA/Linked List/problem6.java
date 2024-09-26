// delete midle node of linkedlist leetcoed 2095
public class problem6 {
    public static class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
        }
    }
 

    public static Node deleteMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        if(head.next == null){
            return null;
        }

        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
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
        Node c = new Node(3);
        Node d = new Node(4);  // This will be the intersection point
        Node e = new Node(5);
        Node f = new Node(6);
    
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);

        Node ans = deleteMiddle(a);
        System.out.println(ans.val);
        display(a);
    }
}
