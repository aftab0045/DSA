// check palindrome for linked list
public class problem12 {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static Node reveres(Node head){
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

    static boolean checkPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node end = reveres(slow.next);
        
        slow.next = end;

        Node p1 = head;
        Node p2 = slow.next;

        while(p2 != null){
            if(p1.data == p2.data){
                return true;
            }
        }

        return false;
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
        Node d = new Node(3);  
        Node e = new Node(2);
        Node f = new Node(1);
    
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Given Linked List Is : ");
        display(a);

        System.out.println("Given Linked List Is "+ checkPalindrome(a) +" Palindrome");

    }
}
