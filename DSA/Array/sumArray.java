import java.util.Scanner;
public class sumArray {

    // Sum of 2 numbers of arr is equa; to target
    static int sumOfArray(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Data in Array");
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();

        System.out.println(sumOfArray(arr, target));
    }
}
