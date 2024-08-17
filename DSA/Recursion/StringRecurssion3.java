import java.util.ArrayList;
import java.util.Scanner;
public class StringRecurssion3 {

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
    public static void main(String[] args){
        ArrayList<String> ans = subSquence("abc");
        for(String ss: ans){
            System.out.println(ss);
        }
    }
}
