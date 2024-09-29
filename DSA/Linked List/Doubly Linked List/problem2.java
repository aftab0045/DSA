public class problem2 {

    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static void twoSum(Node head,Node tail, int target){
        Node p1 = head;
        Node p2 = tail;

        while (p1.data < p2.data) {
            if(p1.data + p2.data == target){
                System.out.println(p1.data +" and "+p2.data);
                break;
            }
            else if(p1.data + p2.data > target){
                p2 = p2.prev;
            }
            else{
                p1 = p1.next;
            }
        }

        
        
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(12);
        Node e = new Node(18);
        Node f = new Node(23);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = null;

        twoSum(a, f, 2);
    }
}
