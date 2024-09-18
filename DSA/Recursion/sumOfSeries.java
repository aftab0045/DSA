import java.util.*;
public class sumOfSeries {

    // Print K multiples of Num -> if num = 5 and k = 4 output is -> 5 10 15 20
    static void multiplesOfK(int n, int k){
        if(k == 1){
            System.out.print(n +" ");
            return;
        }

        multiplesOfK(n, k-1);

        System.out.print(n * k+" ");
    }

    // calculate sum of N natural nummmber
    static int sum(int n){
        if(n == 1){
            return n;
        }

        return sum(n-1) + n;
    }

    // calculate sum of N natural numbers with given conditions
    // if n = 8 output is -> 1-2+3-4+5-6+7-8+9-10 = -5
    static int sumOfSeries(int n){
        if(n == 1){
            return n;
        }

        if(n % 2 == 0){
            return sumOfSeries(n-1) - n;
        }
        else{
            return sumOfSeries(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of N  ");
        int n = sc.nextInt();
        // int k = sc.nextInt();

        // multiplesOfK(n, k);

        // System.out.print("Sum of first "+n+" numbers Is : ");
        // System.out.println(sum(n));

        System.out.print("Sum Of First "+n+" Numbers Is : ");
        System.out.println(sumOfSeries(n));
    }
}
