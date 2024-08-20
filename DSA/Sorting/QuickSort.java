public class QuickSort {

    // Print the given Array
    static void PrintArray(int [] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Swap method
    static void Swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // Partion method 
    static int partision(int[] arr, int start,int end){
        int pivot = arr[start];
        int count = 0;

        for(int i=start+1;i<=end;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIDX = start+count;
        Swap(arr,start,pivotIDX);

        int i = start;
        int j = end;
        while(i<pivotIDX && pivotIDX<j){
            while (arr[i]<=pivot) {
                i++;
            }
            while (arr[j]>pivot) {
                j--;
            }

            if(i<pivotIDX && j>pivotIDX){
                Swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIDX;
    }

    // Quick sort using Recurssion
    static void QuickSort(int[] arr,int start, int end){
        // BAse case
        if(start>=end){
            return;
        }
        int pi = partision(arr,start,end);
        QuickSort(arr, start, pi-1);
        QuickSort(arr, pi+1, end);
    }
    public static void main(String[] args){
        int [] arr = {5,3,7,2,9,1,4};
        int n = arr.length;
        System.out.println("Before Sort");
        PrintArray(arr);
        System.out.println();
        System.out.println("After Quick Sort ");
        QuickSort(arr,0,n-1);
        PrintArray(arr);
    }
}
