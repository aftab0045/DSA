import java.util.*;
public class strRecursion {

    // remove Occrance from string
    static String removwOccurence(String s, int idx, char cha){
        if(idx == s.length()){
            return "";
        }

        String smallAns = removwOccurence(s, idx+1, cha);
        if(s.charAt(idx) == cha){
            return smallAns;
        }
        else{
            return s.charAt(idx) + smallAns;
        }
    }

    // reverse string using recursion
    static String reverseString(String s, int idx){
        if(idx == s.length()){
            return "";
        }

        return reverseString(s, idx+1) + s.charAt(idx);
    }

    // check palindrome
    static boolean isPalindrome(String s, int idx){
        String rev = reverseString(s, idx);

        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }

    // 2nd Approach to check palindrome
    static boolean isPalindrome2(String s, int left, int right){
        if(left >= right){
            return true;
        }

        return isPalindrome2(s, left+1, right-1) && s.charAt(right) == s.charAt(left);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String s = sc.nextLine();

        // System.out.println(removwOccurence(s, 0, 'a'));

        // System.out.println(reverseString(s, 0));

        // System.out.println(isPalindrome(s, 0));

        System.out.println(isPalindrome2(s, 0, s.length()-1));
    }
}
