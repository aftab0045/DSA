public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {30,10,40,80,20};
        int n = arr.length;

        for(int i =1;i<n;i++){
            int temp = arr[i];
            int j = i;
            while( j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
