// delete the node which gives itself as parameter we dont know the head and tail of LinkedList
public class problem2 {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static void deleteNode(Node n){
        n.data = n.next.data;
        n.next = n.next.next;
    }

    static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        
        deleteNode(b);
        display(a);
    }
}
