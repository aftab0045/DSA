// Problem : arr is given we have to find the first occurence of given target 

public class Problem1 {
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int firstIDX = -1;
        while(start>end){
            return -1;
        }

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                firstIDX = mid;
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return firstIDX;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,4,6,8};
        int target = 0;
        System.out.println(BinarySearch(arr,target));
    }
}
