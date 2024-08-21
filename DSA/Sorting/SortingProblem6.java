public class SortingProblem6 {

    static void displayArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Sort using count sort
    static void sortArr(int[] arr){
        int [] count = new int[3];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int k = 0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++] = i;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,0,1,2,1,0};

        sortArr(arr);
        displayArr(arr);
    }
}
