

public class Binary {

    static boolean BinarySearch(int[] arr, int start, int end,int target){
        while(start>end){
            return false;
        }

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,6,8};
        int target = 0;
        System.out.println(BinarySearch(arr,0,arr.length-1,target));
    }
}

 