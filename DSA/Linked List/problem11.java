public class problem11 {

    public static class Node{
        int val;
        Node next;

        Node(int data){
            this.val = data;
        }
    }

    // Brute Force Approach
    public static Node reverseLinkedList(Node head){
        if(head.next == null){
            return head;
        }
        Node newHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Optimal Solution
    static Node reverseLinkedList2(Node head){
        Node prev = null;
        Node curr = head;
        Node Next = null;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
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

        System.out.println("Orignal List");
        display(a);

        // System.out.println("Reverse By Recursion");
        // Node ans = reverseLinkedList(a);
        // display(ans);

        System.out.println("Reverse By 3 pointer");
        Node ans2 = reverseLinkedList2(a);
        display(ans2);

    }

    
}