import java.util.Scanner;
public class ArrayManipulation {

    // Find out the unique num from the given arr , arr contains only 1 uniqw NUM
    static int ArrManupulation(int[] arr){
        int n = arr.length;
        int ans =0;

        for(int i =0; i<n ;i++){
            for(int j =i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i =0; i<n ;i++){
            if(arr[i] != -1){
                ans = arr[i];
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

        System.out.println(ArrManupulation(arr));
    }
}
