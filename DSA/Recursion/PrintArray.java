public class PrintArray {

    static void printArray(int [] arr, int idx){
        // Base case
        if(idx == arr.length){
            return;
        }
        // Own task
        System.out.print(arr[idx]+" ");
        // Samll Task
        printArray(arr, idx+1);
        
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        printArray(arr, 0);
    }
}
