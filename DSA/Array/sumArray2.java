import java.util.Scanner;
public class sumArray2 {

    // Find the 3 Num in arr whose sum is equal to target
    static int sumOdArray2(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements of Array");
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target");
        int target = sc.nextInt();

        System.out.println(sumOdArray2(arr, target));
    }
}
