import java.util.Scanner;

public class Occurence {

    static int count(int[] arr,int T){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == T){
                count++;
            }
        }
        return count;
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

        System.out.println("Enter target");
        int T = sc.nextInt();

        System.out.println(count(arr, T));

    }
}
