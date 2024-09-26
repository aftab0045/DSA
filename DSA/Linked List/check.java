public class check {
    public static class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
        }
    }
        public static Node detectCycle1(Node head) {
    
            if (head == null || head.next == null) {
                return null;
            }
    
            Node slow = head;
            Node fast = head;
    
            // Detect cycle using the fast and slow pointers
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) {
                    break;
                }
            }
    
            // Check if no cycle was detected
            if (fast == null || fast.next == null) {
                return null;
            }
    
            // Find the entry point of the cycle
            Node temp = head;
            while (temp != slow) {
                slow = slow.next;
                temp = temp.next;
            }
    
            return slow; // Cycle entry point
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
            Node g = new Node(7);
        
            
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next = g;
            g.next = e;

            Node ans = detectCycle1(a);
            System.out.println(ans.val);
    
        
        }
        
}
