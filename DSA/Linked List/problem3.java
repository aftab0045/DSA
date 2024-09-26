public class problem3 {

    // Node Class
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node deleteNthFromTail(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        // if you are deleting head node
        if(fast == null){
            head = head.next;
            return head;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
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
       Node f = new Node(6);

       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = f;

       display(a);
       a = deleteNthFromTail(a, 6);
       display(a);
    }
}
