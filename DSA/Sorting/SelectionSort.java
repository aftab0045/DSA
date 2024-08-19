
import java.util.Scanner;

public class SelectionSort {

    // Selection Sort
    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            // Swap the min value and curr value
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args){
        // Given I/P from user
        System.out.println("Enter the arr size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the data in array");
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        SelectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
