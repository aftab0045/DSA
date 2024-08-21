public class CountSort2 {

    // For print array function
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // find the max element in the array
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // count sort
    static void countSort(int[] arr){
        int MaxVal = findMax(arr);
        int [] count = new int[MaxVal+1];  // create an count arr 

        // store the data in frequency arr 
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // sort the arr 
        int k = 0;
        for(int i=0;i<count.length;i++){
            for(int j =0;j<count[i];j++){
                arr[k++] = i;
            }
        }
    }
    public static void main(String[] args){
        int [] arr = {1,8,5,4,1,2,3,5};
        countSort(arr);
        printArray(arr);
    }
}
