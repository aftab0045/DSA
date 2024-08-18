import java.util.ArrayList;
import java.util.Scanner;
public class StringRecurssion3 {

    // 1st Approach with crating Arraylist
    static ArrayList<String> subSquence(String name){
        ArrayList<String> ans = new ArrayList<>();
        // Base Task
        if(name.length()==0){
            ans.add(" ");
            return ans;
        }
        // Recursive Task
        char curr = name.charAt(0);
        ArrayList<String> smallTask = subSquence(name.substring(1));
        // Self Task
        for(String ss:smallTask){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    // 2nd Approach without creating array list

    static void printSubSequence(String s,String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        // Self Taks
        char curr = s.charAt(0);
        String remString = s.substring(1);
        // Recursive TAsk
        printSubSequence(remString, currAns+curr);  // Add curr ti remaning string
        printSubSequence(remString, currAns);   //Not Add curr to remaing String
    }
    public static void main(String[] args){
        // ArrayList<String> ans = subSquence("abc");
        // for(String ss: ans){
        //     System.out.println(ss);
        // }

        printSubSequence("abc", "");
    }
}
