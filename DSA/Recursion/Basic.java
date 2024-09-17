import java.util.*;
public class Basic {

    // // FActorial
    // static int factiorial(int n){
    //     // Base Case
    //     if(n == 0){
    //         return 1;
    //     }
    //     // Recurssive work
    //     int previous = factiorial(n-1);
    //     // self work
    //     return n * previous;
    // }

    // Fibonacci Series
    static int fibonacci(int n){
        //base case
        if(n == 0 || n == 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value ");
        int n = sc.nextInt();

        // int ans = factiorial(n);
        // System.out.println(ans);

        for(int i = 0; i < n; i++){
            int ans = fibonacci(i);
            System.out.println(ans);
        }
    }
}
