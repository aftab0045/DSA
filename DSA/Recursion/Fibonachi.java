import java.util.Scanner;

public class Fibonachi {

    static int Fibbo(int n){
        // Base Case
        if(n == 0 || n == 1){
            return n;
        }
        // Recursiv task
        int prev = Fibbo(n-1);
        int prePrev = Fibbo(n-2);
        // own task

        return prePrev + prev;

    }
    public static void main(String [] args){
        System.out.println("Enter The IDX No.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            System.out.println(Fibbo(i));
        }
        
    }
}
