import java.util.Scanner;
public class SumOfArray {

    // Sum of array
    static int SumOfArray(int[] arr){
        int sum = 0;
        int n = arr.length;

        for(int i =0;i<n;i++){
            sum += arr[i];
        }

        return sum;
    }

    // Find Max of Array
    static int MaxOfArr(int[] arr){
        int max = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the Data");
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(SumOfArray(arr));
        System.out.println(MaxOfArr(arr));
    }
}
