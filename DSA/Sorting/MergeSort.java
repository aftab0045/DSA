public class MergeSort {

    // Method for print Array
    static void printArray(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    // Method for merge left and right array in sorting order
    static void merge(int[] arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        int i,j,k;

        for(i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
        for(j=0;j<n2;j++){
            right[j] = arr[mid+1+j];
        }

        i =0;
        j =0;
        k =l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }

    // Main recurssion method
    static void mergeSort(int[] arr, int l, int r){
        // BAse case
        if(l >= r){
            return;
        }

        // Recurssive Task
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);

        // Self Task
        merge(arr, l, mid, r );
    }
    public static void main(String[] args){
        int[] arr = {5,3,1,4,2,9,7};
        int n = arr.length;
        System.out.println("Before Sort");
        printArray(arr);

        System.out.println();
        System.out.println("After Merge Sort");
        mergeSort(arr, 0, n-1);
        printArray(arr);
    }
}
