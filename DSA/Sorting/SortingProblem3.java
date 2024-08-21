// we have given sorted array in increasing manner but at one point the array must be swapped check that point and swap the 2 elements

public class SortingProblem3 {

    static void sortArray(int[] arr){
        int n = arr.length;
        int x = -1, y = -1;
        for(int i =1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x == -1){
                    x = i-1;
                    y = i;
                }
                else{
                    y = i;
                }
            }
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args){
        int [] arr = {10,3,5,6,1};

        sortArray(arr);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
