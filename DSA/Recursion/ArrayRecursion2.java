import java.util.Scanner;
public class ArrayRecursion2 {

    // target is present or not
    static boolean isPresent(int[] arr, int target, int idx){
        if(idx == arr.length-1){
            return false;
        }

        isPresent(arr, target, idx+1);

        if(arr[idx]==target){
            return true;
        }
        else{
            return false;
        }
    }

    // if present then find idx
    static int findIDX(int[] arr, int target, int idx){
        if(idx > arr.length){
            return -1;
        }

        if(arr[idx]==target){
            return idx;
        }

        return findIDX(arr, target, idx+1);

        
    }

    // if target id at more than 1 idx
    static void AllFindIDX(int[] arr, int target, int idx){
        if(idx > arr.length){
            return ;
        }

        if(arr[idx]==target){
            System.out.println(idx);
        }

        findIDX(arr, target, idx+1);
    }

    public static void main(String[] args){
        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fill the "+n+" Positions in array .");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        // System.out.println(isPresent(arr, 1, 0));
        // System.out.println(findIDX(arr, 10, 0));
        AllFindIDX(arr, 1, 0);
    }
}
