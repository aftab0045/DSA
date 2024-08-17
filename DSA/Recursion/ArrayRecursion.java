import java.util.Scanner;
public class ArrayRecursion {

    static int MaxElementOfArray(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        // Small task
        int samllTask = MaxElementOfArray(arr, idx+1);
        int max = Math.max(arr[idx], samllTask);
        return max;
    }

    static int sumOfArray(int[] arr,int idx){
        // Base case
        if(idx == arr.length-1){
            return arr[idx];
        }
        // Recursive task
        int subSum = sumOfArray(arr, idx+1);
        // Self task
        int sum = arr[idx] + subSum;
        
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Enter the size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" places in array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumOfArray(arr, 0));
        System.out.println(MaxElementOfArray(arr,0));
        
    }
}
