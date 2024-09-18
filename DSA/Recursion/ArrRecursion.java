public class ArrRecursion {

    static void printArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }

        System.out.println(arr[idx]);

        printArray(arr, idx+1);
    }

    // Find Max In array
    static int findMax(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        return Math.max(findMax(arr, idx+1), arr[idx]);
    }

    // Sum of elements in arr
    static int sumOfArray(int [] arr, int idx){
        if(idx == arr.length-1)
            {return arr[idx];}

        return sumOfArray(arr, idx+1) + arr[idx];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int idx = 0;

        // printArray(arr,idx);

        // System.out.println(findMax(arr, idx));

        System.out.println(sumOfArray(arr, idx));
    }
}
