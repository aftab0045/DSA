import java.util.Scanner;
public class StringRecurssion4 {

    // To find the sum of sub array
    static void subStringSum(int[] arr,int idx,int sum)
    {
        if(idx == arr.length){
            System.out.println(sum);
            return;
        }
        int curr = arr[idx];
        subStringSum(arr, idx+1, sum+curr);
        subStringSum(arr,idx+1,sum);
    }
    public static void main(String[] args){
        System.out.println("Enter Array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("ENtre the data in array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        subStringSum(arr, 0, 0);
    }
}