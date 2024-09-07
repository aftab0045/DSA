import java.util.Scanner;
public class FindNum {

    // Find number is present or not
    static int find(int[] arr,int T){
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(T == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the data in Array");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target");
        int T = sc.nextInt();

        System.out.println(find(arr, T));
    }
}
