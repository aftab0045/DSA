import java.util.*;
public class removeParenthe {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0; // Track the depth of parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                // If depth > 0, it means we are inside a primitive part, so we can keep this '('
                if (depth > 0) {
                    result.append(c);
                }
                depth++; // Increase depth as we encounter an opening parenthesis
            } else {
                depth--; // Decrease depth as we encounter a closing parenthesis
                // If depth > 0 after decrementing, it means we are still inside a primitive part
                if (depth > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Parentheses : ");
        System.out.println("Ex : (()())(())");
        
        String parentheses = sc.nextLine();

        System.out.println(removeOuterParentheses(parentheses));
    }
}
