public class CountDigit {
    static int CountOfDigit(int n){
        
        // Base Case
        if(n == 0){
            return 0;
        }
        // Small task
        int digit = CountOfDigit(n/10);
        // Own task
        return 1 + digit;
        
    }
    public static void main(String[] args){
        System.out.println(CountOfDigit(5478));
    }
}
