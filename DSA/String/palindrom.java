import java.util.*;
public class palindrom{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = sc.nextLine();

        // 1st Approach
        // StringBuilder rev = new StringBuilder(name);
        // String revName = rev.reverse().toString();

        // if(name.equals(revName)){
        //     System.out.println("Palindrom");
        // }
        // else{
        //     System.out.println("Not Palindrom");
        // }

        

        // 2nd Approach
        int i = 0;
        int j = name.length()-1;
        while (i <= j) {
            if(name.charAt(i) != (name.charAt(j))){
                System.out.println(" Not Palindrom");
                i++;
                j--;
            }
            
        
            
        }

        System.out.println("Palindrom");
    }
}