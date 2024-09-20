public class problem7 {

    static boolean findIDX(int[][] arr , int target){
        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = m-1;

        while(i < n && j >= 0){
            if(arr[i][j] == target){
                return true;
            }

            if(arr[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        int target = 7;

        System.out.println(findIDX(arr,target));
    }
}
