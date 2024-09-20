public class Problem5 {

    static int findIDX(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                ++start;
                --end;
            }
            else if(arr[mid] <= arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
                
            } 
            else{
                if(target >= arr[start] && target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,3,1,1};
        int target = 2;

        System.out.println(findIDX( arr, target ));
    }
}
