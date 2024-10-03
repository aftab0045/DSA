//Move elemets of stack 1 to stack 2

import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> st = new Stack<>();

            System.out.println("Enter The No. Of Elemnets :");
            int n = sc.nextInt();
            System.out.println("Enter The Elements : ");

            for(int i = 1; i <= n; i++){
                int x = sc.nextInt();
                st.push(x);
            }
            System.out.println("Orignal Stack");
            System.out.println(st);

            Stack<Integer> gt = new Stack<>();
            while (st.size()>0) {
                gt.push(st.pop());
            }
            

            Stack<Integer> rt = new Stack<>();
            while (gt.size()>0) {
                rt.push(gt.pop());
            }
            System.out.println("Move Elements From Stack 1 to Stack 2");
            System.out.println("This Is Stack 2 : "+rt);
            System.out.println("This is size of orignal stack 1 : "+st.size());
        }
    }
}
