// check palindrome
public class problem1 {

    
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    static boolean isPalindrome(Node head){
        Node p1 = head;

        while (p1.next != null) {
            p1 = p1.next;
        }
        Node tail = p1;
        Node p2 = tail;
        p1 = head;

        while (p1 != p2) {
            if(p1.data != p2.data){
                return false;
            }
            p1 = p1.next;
            p2 = p2.prev;

        }

        return true;

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
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

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

        System.out.println(isPalindrome(a));

    }    
}
