import java.util.Scanner;
public class StringRecurssion {

    // Reverse Array Problem
    static String ReverseArray(String name, int idx){
        // Base task
        if(idx == name.length()){
            return "";
        }
        // Recursive Task
        String smallTask = ReverseArray(name, idx+1);
        char curr = name.charAt(idx);
        // Self Task
        return smallTask+curr; 
    }

    // This code is reverse array without idx in para

    // static String ReverseArrayWithoutIDX(String name){
    //     // Base task
    //     if(name.length() == 0){
    //         return "";
    //     }
    //     // Recursive Task
    //     String smallTask = ReverseArrayWithoutIDX(name.substring(1));
    //     char curr = name.charAt(0);
    //     // Self Task
    //     return smallTask+curr; 
    // }


    // Remove a specific Char in the Array
    static String RemoveChar(String name,int idx){
        // Base Case
        if(idx == name.length()){
            return "";
        }
        // Recusive Task
        String small = RemoveChar(name, idx+1);
        char curr = name.charAt(idx);
        // Self Task
        if(curr != 'a'){
            return curr+small;
        }
        else{
            return small;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(RemoveChar(name, 0));
        System.out.println(ReverseArrayWithoutIDX(name));
    }
}
