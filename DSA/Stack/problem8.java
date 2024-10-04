// balanced brackets 
import java.util.*;
public class problem8 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  // Correct variable name and type
 
         for (char c : s.toCharArray()) {
             // If the character is an opening bracket, push to the stack
             if (c == '(' || c == '{' || c == '[') {
                 stack.push(c);
             } 
             // If the character is a closing bracket, check for matching opening bracket
             else {
                 // Stack should not be empty and the top must match the closing bracket
                 if (stack.isEmpty()) {
                     return false;
                 }
                 char top = stack.pop();  // Correct method on the stack
                 if ((c == ')' && top != '(') || 
                     (c == '}' && top != '{') || 
                     (c == ']' && top != '[')) {
                     return false;
                 }
             }
         }
 
         // If stack is empty, all brackets matched, otherwise invalid
         return stack.isEmpty();
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter String : ");
       String str = sc.nextLine(); 

       System.out.println(isValid(str));
    }
}
