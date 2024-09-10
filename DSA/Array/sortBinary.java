
import java.util.Scanner;
public class sortBinary {

    // Print Method
    static void print(int[] arr){
        for(int print:arr){
            System.out.print(print+" ");
        }
        System.out.println();
    }

    // Sort Zeros and ones in brute force approach
    static void sortBinary(int[] arr){
        int n = arr.length;                       
        int Zeros = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){                                          // count zeros 
                Zeros++;
            }
        }

        for(int i=0;i<n;i++){
            if(i<Zeros){                           // Add zeors which counted
                arr[i] = 0;
            }
            else{
                arr[i] = 1;                        // After That add 1
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
        sortBinary(arr);
        print(arr);
    }
}

  
 