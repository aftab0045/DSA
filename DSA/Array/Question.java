import java.util.Scanner;

public class Question {

    static int [] reverseArray(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int k = 0;
        for(int i=n-1;i>=0;i--){
            ans[k++] = arr[i];
        }
        return ans;
    }

    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int [] sortArray(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int k = n-1;

        int left = 0, right = n-1;
        while(left<=right){

            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left]*arr[left];
                left++;
            }
            else{
                ans[k--] = arr[right]*arr[right];
                right--;
            }
        }
       

        return ans;
     }
    public static void main(String [] args){
        System.out.println("Enter size of array !!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter data in array !");

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans [] = sortArray(arr);
        
        System.out.println("Before sorting......");
        printArray(arr);

        System.out.println("After Sorting.......");
        printArray(ans);
    }
}
