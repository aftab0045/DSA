import java.util.Scanner;
public class StringRecurssion2 {

    // Palindrome Question Approach 1
    static String Palindrome(String name){
        if(name.length() == 0){
            return "";
        }
        // Recursive Task
        String smallTask = Palindrome(name.substring(1));
        // Self Task
        return smallTask+name.charAt(0);
    }

    // Palindrome Question Approach 2
    static boolean isPalindrome(String name,int l,int r){
        if(l>=r){
            return true;
        }
        return (name.charAt(l)==name.charAt(r) && isPalindrome(name, l+1, r-1));
    }
    public static void main(String[] args){
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // 1st approach
        String reverse = Palindrome(name);

        if(name.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT Palinteome");
        }

        // 2nd approach
        System.out.println(isPalindrome(name, 0, name.length()-1));
    }
}
