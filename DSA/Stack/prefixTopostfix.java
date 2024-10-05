import java.util.*;
public class prefixTopostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";

        Stack<String> val = new Stack<>();

        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>= 48 && ascii<= 57){
                val.push(ch+"");
            }

            else if(ch == '-' || ch == '+' || ch == '*' || ch == '/'){
                String v1 = val.pop();
                String v2 = val.pop();

                String ans = v1 + v2 + ch;

                val.push(ans);
            }

        }

        System.out.println("Prefix To Postfix Is  : ");
        System.out.println(val.peek());
    }
}
