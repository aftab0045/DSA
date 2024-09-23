

class fractionCal {

    static fraction Addition(fraction f1, fraction f2){
        int numerator = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
        int denominator = f1.denominator * f2.denominator;

        fraction f3 = new fraction(numerator, denominator);

        return f3;
    }

    static fraction Multiplication(fraction f1, fraction f2){
        int numerator = f1.numerator*f2.numerator;
        int denominator = f1.denominator * f2.denominator;

        fraction f4 = new fraction(numerator, denominator);

        return f4;
    }

    static int GCD(int numerator,int denominator){
        // 1st Approach
        // while (numerator % denominator != 0) {
        // int reminder = numerator % denominator;
        // numerator = denominator;
        // denominator = reminder;
        // }
        // return denominator;

        // 2nd Approach
        int min = Math.min(numerator, denominator);

        for(int i = min; i >=1; i--){
            if(numerator%i == 0 && denominator%i == 0){
                return i;
            }
        }

        return 1;
    }

    static class fraction{
        int numerator;
        int denominator;

        public fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }

        

        public void simplify(){
            int hcf = GCD(numerator, denominator);
            numerator /= hcf;
            denominator /= hcf;
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(35,21);
        System.err.println(f1.numerator+"/"+f1.denominator);
        fraction f2 = new fraction(15,20);
        System.err.println(f2.numerator+"/"+f2.denominator);

        System.out.println("Addition Of Above To fractions Is : ");
        fraction f3 = Addition(f1, f2);
        System.err.println(f3.numerator+"/"+f3.denominator);

        System.out.println("Multiplication Of Above To fractions Is : ");
        fraction f4 = Multiplication(f1, f2);
        System.err.println(f4.numerator+"/"+f4.denominator);

    }   
}