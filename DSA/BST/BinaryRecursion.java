

public class BinaryRecursion {

    static boolean Binary(int[] arr,int start,int end, int target){
        // Base case
        if(start>end){
            return false;
        }
        // Recusive Task
        int mid = (start+end)/2;
        if(target == arr[mid]){
            return true;
        }
        else if(target > arr[mid]){
            return Binary(arr, mid+1, end, target);
        }
        else{
            return Binary(arr, start, mid-1, target);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,6,8,9};
        int n = arr.length;
        int target = 7;

        System.out.println(Binary(arr, 0, n-1, target));
    }
}
