// finding Nth Node from the end of Linked List



public class problem1 {
    // Node Class
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    // Brute force Approach
    static Node nthNode(Node head, int n){
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n +1;
        temp = head;
        for(int i = 1; i <= m-1; i++){
            temp = temp.next;
        }
        return temp;
    }
    
    // Optimize solution in one travels
    static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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

       
       Node ans = nthNode(a, 3);
       System.out.println(ans.data);

       Node ans2 = nthNode2(a, 3);
       System.out.println(ans2.data);
    }
}
