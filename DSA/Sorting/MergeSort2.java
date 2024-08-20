import java.util.Scanner;
public class MergeSort2 {

    static void merge(int[] arr, int l,int mid,int r){
        // finding length of left and rigth arr
        int n1 = mid-l+1;
        int n2 = r-mid;

        // Declaring left and rigth arr
        int left[] = new int[n1];
        int right[] = new int[n2];

        // FIll the values of left and rigth arr 
        for(int i=0;i<n1;i++){
            left[i] = arr[i+l];
        }
        for(int j =0;j<n2;j++){
            right[j] = arr[mid+1+j];
        }

        int i =0;
        int j =0;
        int k =0;
        // Checking the condition whether right[0] > left[o] or vise versa and small value should fill in main arr
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        // If right arr is fully filled in main arr then remaing left should directly fill in main arr without any cconditions
        while (i<n1) {
            arr[k++] = left[i++];
        }

        // If left arr is fully filled in main arr then remaing right should directly fill in main arr without any cconditions
        while (j<n2) {
            arr[k++] = right[j++];
        }


    }

    // Merge sort Using Recurssion 
    static void mergeSort(int[] arr, int l, int r){
        // Base Case
        if(l>=r){
            return;
        }
        // Recurssive Task
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        // Self Task
        merge(arr,l,mid,r);
    }

    // For Printing Array
    static void PrintArray(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] arsg){
        // Taking input from array
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the data in array");
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting ");
        PrintArray(arr);
        System.out.println();
        System.out.println("After Merge Sort");
        mergeSort(arr, 0, n-1);
        PrintArray(arr);
    }
}
