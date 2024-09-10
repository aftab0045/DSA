
import java.util.Scanner;
public class sortBinary2 {

    // Print Method
    static void print(int[] arr){
        for(int print:arr){
            System.out.print(print+" ");
        }
        System.out.println();
    }

    

    // Sort Zeros and ones using 2 pointer approach
    static void sortBinary2(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        for(int i=0;i<n;i++){
            while(left<right){
                if(arr[left] == 1 && arr[right] == 0){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                if(arr[left] == 0){
                    left++;
                }

                if(arr[right] == 1){
                    right--;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Size Of Array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" Elements In Array ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Origanl Array : ");
        print(arr);

        System.out.println("After Sort : ");
        sortBinary2(arr);
        print(arr);
    }
}

  
 