public class problem6 {

    static int findIDX(int[][] arr, int target){
        int n = arr.length;
        int m = arr[0].length;
        int start = 0;
        int end = n*m-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            int midIDX = arr[mid/m][mid%m];

            if(midIDX == target){
                return mid;
            }
            if(midIDX > target){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,36}};
        int target = 23;

        System.out.println(findIDX(arr, target));
    }
}
