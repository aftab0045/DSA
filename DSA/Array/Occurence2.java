import java.util.Scanner;

public class Occurence2 {

    // Find the last index of target
    static int lastOccurence(int[] arr,int T){
        int lastIDX = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == T){
                lastIDX = i;
            }
        }

        return lastIDX;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the Data");
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("ENter Tareget");
        int T = sc.nextInt();

        System.out.println(lastOccurence(arr, T));

    }
}
