   // middle node
 // leetcode problem 876
public class problem5 {
  
  
    public static class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
        }
    }
 

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

        Node ans = middleNode(a);
        System.out.println(ans.val);
    }



}