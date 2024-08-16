public class Sum{

    static int SumOfDigits(int n){
        // Base case
        if(n>=0 && n<=9){
            return n;
        }
        // Samll task
        int digit = SumOfDigits(n/10);
        // Own task
        return digit + n%10;
    }
    public static void main(String [] args){
        System.out.println(SumOfDigits(643));
    }
}