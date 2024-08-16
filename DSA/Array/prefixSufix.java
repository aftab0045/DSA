import java.util.Scanner;

public class prefixSufix {
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int [] prefixSum(int [] arr){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for(int i=1;i<n;i++){
            pref[i] = arr[i] + arr[i-1];
        }
        return pref;

    }

    static int [] suffixSum(int [] arr){
        int n = arr.length;
        int suff[] = new int[n];
        suff[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i] = arr[i] + arr[i+1];
        }
        return suff;
    }

    static int checkSum(){
        int pref[] = prefixSum(arr);
        int suff[] = suffixSum(arr);
        int i = 0;
        while(i<arr.length){
            if(pref[i] == suff[i+1]){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
    }
    public static void main (String[] args){
        System.out.println("Enter the size of array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the "+n+" elments in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int pref[] = prefixSum(arr);
        int suff[] = suffixSum(arr);
        
        checkSum(arr);
        
    }
}
