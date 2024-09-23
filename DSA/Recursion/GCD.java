import java.util.Scanner;

public class GCD {
    // Euclids approach
    static int GCDcal(int x,int y){
        if(y == 0){
            return x;
        }
        return GCDcal(y,x%y);
    }

    // Brute force approach
    static int GCDcalculate(int x, int y){
        while (x%y !=0) {
        int rem = x%y;
        x = y;
        y = rem;   
        }
        return y;
    }

    // 2nd Appraoch
    static int GCD2(int numerator, int denominator){
        int min = Math.min(numerator, denominator);

        for(int i = min; i >=1; i--){
            if(numerator%i == 0 && denominator%i == 0){
                return i;
            }
        }

        return 1;
    }
    public static void main(String[] args){
        System.out.println("Enter the value of x and y ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(GCDcalculate(x, y));
        System.out.println(GCDcal(x, y));

        System.out.println(GCD2(x, y));

    }
}
