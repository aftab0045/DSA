import java.util.Scanner;
public class sumOfNum {
    
    // 1-2+3-4+5 
     static int sumOfNum(int N){
         if(N == 1){
             return 1;
         }
         //even case 
         if(N%2 == 0){
             return sumOfNum(N-1) - N;
         }
         else{  // Odd case
             return sumOfNum(N-1) + N;
         }
     }

    // 1+2+3+4+5
    static int sumOf(int N){
        // Base Case
        if(N == 1){
            return 1;
        }
        // Small task
        return sumOf(N-1)+N;

    }
    public static void main(String [] args){
        System.out.println("Enter the Num N : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(sumOf(N));
        System.out.println(sumOfNum(N));
    }
}
