// Intersection of 2 linked list leetcode 160
public class problem4 {
    

  public static class Node {
      int val;
      Node next;
      Node(int x) {
          val = x;
          
      }
  }
 

    public static Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int lengthA = 0;
        int lengthB = 0;

        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        }

        while(tempB != null){
            lengthB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        if(lengthA > lengthB){
            int step = lengthA - lengthB;

            for(int i = 1; i <= step; i++){
                tempA = tempA.next;
            }
        }
        else{
            int step = lengthB - lengthA;

            for(int i = 1; i <= step; i++){
                tempB = tempB.next;
            }
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
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
        Node x = new Node(97);
        Node y = new Node(98);
        Node z = new Node(99);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);  // This will be the intersection point
        Node e = new Node(5);
        Node f = new Node(6);
    
        x.next = y;
        y.next = z;
        z.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
    
        display(x);
    
        // Second linked list
        Node g = new Node(11);
        Node h = new Node(12);
        Node i = new Node(13);
    
        g.next = h;
        h.next = i;
    
        // Make the second list intersect the first one at node 'd'
        i.next = d;
    
        display(g);
    
        // Find the intersection point
        Node ans = getIntersectionNode(x, g);
        if (ans != null) {
            System.out.println("Intersection at node with value: " + ans.val);
        } else {
            System.out.println("No intersection");
        }
    }
    
}

