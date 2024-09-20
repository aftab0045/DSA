public class problem8 {

    static int findIDX(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }
            if(arr[mid] > arr[mid-1]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,4,6,5,2,1};
    
        System.out.println(findIDX(arr));
    }
}
