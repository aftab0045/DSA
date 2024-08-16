public class PowerOf {

    static int PowerOfDigit(int p, int q){
        // BAse COnd
        if(q == 0){
            return 1;
        }
        // Recursive Task - Small task
        int power = PowerOfDigit(p,q-1);
        // Own task
        return p * power;
    }
    public static void main (String[] args){
        System.out.println(PowerOfDigit(5,2));
    }
}
