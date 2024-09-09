public class reverseArray{

    // Print Method
    static void print(int[] arr){
        for(int print:arr){
            System.out.print(print+" ");
        }
        System.out.println();
    }

    // Swap using temp
    static void swapNum(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap Valuse are a : "+a+" , b : "+b);
        
    }

    // swap using add and sub method
    static void swapNum2(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap Valuse are a : "+a+" , b : "+b);
    }

    // Aray Reverse Using Reverse read of arr and print in another arr
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] arr2 = new int[n];
        int j =0;

        for(int i=n-1;i>=0;i--){
            arr2[j++] = arr[i];
        }
        return arr2;
    }

    // Array Reverse Using Swap method
    static void reverseArray2(int[] arr2){
        int a = 0;
        int b = arr2.length-1;
        for(int i=0;i<arr2.length;i++){
            while(a<b){
                int temp = arr2[a];
                arr2[a] = arr2[b];
                arr2[b] = temp;
                a++;
                b--;
        }
    }
    
    }
    public static void main(String[] args){

        // Swap method
        swapNum(5, 8);
        swapNum2(7, 9);

        // Reverse Array using Reverse read method
        int[] arr = {1,2,3,4,5};
        int [] ans = reverseArray(arr);
        System.out.print("Reverse Array Is : ");
        print(ans);
        

        // Reverse Array using swap method
        int [] arr2 = {1,2,3,4,5};
        reverseArray2(arr2);
        System.out.print("Reverse Array 2 Is : ");
        print(arr2);
    }
}
