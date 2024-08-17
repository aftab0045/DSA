import java.util.Scanner;
public class FindLastIDX {

    static int FindLastIDX(int[] arr, int target,int idx){
        if(idx < 0){
            return -1; 
        }
        // self task
        if(arr[idx] == target){
            return idx;
        }
        // Recursive Task
        return FindLastIDX(arr, idx-1, target);
    }
    public static void main (String[] args){
        System.out.println("Enter the array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" positions ");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int[] arr = {1,2,4,3,5}; 
        int target = 4;
        System.out.println(FindLastIDX(arr, target,arr.length-1));
    }
}
