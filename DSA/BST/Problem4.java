public class Problem4 {

    static int searchIDX(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<arr[end]){
                if(target>arr[mid] && arr[end]>=target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target>=arr[start] && arr[mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main (String[] args){
        int[] arr = {4,5,6,1,2,3};

        System.out.println(searchIDX(arr, 4));
    }
}
