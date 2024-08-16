 import java.util.Scanner;

// public class Array {

//     static int sumArray(int[] array, int target){
//         int count =0 ;
//         for(int i=0;i<array.length;i++){
//             for(int j=i+1;j<array.length;j++){
//                 if(array[i]+array[j] == target){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter The Size of array !! ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         System.out.println("Enter the value of array");
//         int [] array = new int [n];
//         for(int i=0;i<n;i++){
//             array[i] = sc.nextInt();
//         }
//         System.out.println("Enter target");
//         int target = sc.nextInt();


//         System.out.println(sumArray(array, target));

        
//     }
// }


public class Array{

    static void printArray(int [] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int [] reverseArr(int [] arr){
        int n = arr.length;
        int ans [] = new int[n];
        int k = 0;

        for(int i=n-1; i>=0; i--){
            ans[k++] = arr[i];
        }
        return ans;
    }
    public static void main(String [] args){

        System.out.println("Enter the size of array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ans = new int[n];
        System.out.println("Enter the data in array");
        for(int i=0;i<n;i++){
            ans[i] = sc.nextInt();
        }

        System.out.println("Before reverse...........");
        printArray(ans);

        System.out.println("After Reverse...........");
        int [] prt = reverseArr(ans);
        printArray(prt);
    }
}