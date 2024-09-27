public class problem9 {
    public static class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
        }

    }
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(100);
        Node temp = head;
    
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                    temp.next = temp1;
                    temp = temp1;
                    temp1 = temp1.next;
            }
            else{
                    temp.next = temp2;
                    temp = temp2;
                    temp2 = temp2.next;
                }
            }
    
            if(temp1 == null){
                temp.next = temp2;
            }
            else{
                temp.next = temp1;
            }
    
            return head.next;
        
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
        
        Node a = new Node(11);
        Node b = new Node(32);
        Node c = new Node(63);
        Node d = new Node(4);  // This will be the intersection point
        Node e = new Node(52);
        Node f = new Node(66);
    
        
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;

        Node ans = mergeTwoLists(a,d);
        display(ans);
    }
}
