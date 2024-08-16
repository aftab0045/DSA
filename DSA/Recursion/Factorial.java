import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        // Base class
        if(n ==0 || n==1){
            return 1;
        }
        // Small recursive task
        int subans = factorial(n-1);
        // own task
        int ans = n*subans;

        return ans;
    }
    public static void main(String [] args){
        System.out.println("Enter the value of N : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}
