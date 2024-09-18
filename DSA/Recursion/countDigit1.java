import java.util.*;
public class countDigit1 {

    // Sum Of Digits Of given number
    static int SOD(int n){
        if(n/10 == 0){
            return n;
        }

        return SOD(n/10) + n % 10;
    }

    // Count digits of given number
    static int countDigit(int n){
        if(n/10 == 0){
            return 1;
        }

        return countDigit(n/10) + 1;
    }

    // find the value of p^q
    // 1st Approach
    static int POW(int p, int q){
        if(q == 1){
            return p;
        }

        return POW(p, q-1) * p;
    }

    // 2nd Approach
    static int POW2(int p, int q){
        if(q == 1 || q == 0){
            return p;
        }
        int smallAns = POW2(p, q/2);

        if(q % 2 == 0){
            return smallAns * smallAns;
        }
        else{
            return p * smallAns * smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Numbers p & q:");
        int p = sc.nextInt();
        int q = sc.nextInt();

        // System.out.println("The Sum Of "+n+" Number Is ");
        // System.out.println(SOD(n));

        // System.out.println("Number Of Digits In "+n);
        // System.out.println(countDigit(n));

        System.out.println("The Value Of "+p+"^"+q+" Is : ");
        System.out.println(POW2(p, q));
    }
}
