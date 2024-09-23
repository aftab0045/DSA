import java.util.*;
public class revLine {

    public static String reverseWords(String s) {
        // Trim leading and trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder reversed = new StringBuilder();
        
        // Traverse the array of words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add space between words
            }
        }
        
        return reversed.toString();

    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Line : ");

        String line = sc.nextLine();

        System.out.println("After Reverse Line : ");
        System.out.println(reverseWords(line));
    }
}
