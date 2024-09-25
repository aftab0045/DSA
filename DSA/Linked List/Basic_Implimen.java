
public class Basic_Implimen {

    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
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

        // System.out.println(a.data);       // print data at node a
        // System.out.println(b.data);       // print data at node b
        // System.out.println(a.next.data);  // print data at next node without need of actual data
        
        // print the whole linkedList

        // Node temp = a;                                  // use only when you know the number of nodes
        // for(int i = 1; i <= 4; i++){
        //     System.err.print(temp.data+" ");
        //     temp = temp.next;
        // }

        // if you dont know the number of nodes use while loop

        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    } 
}
