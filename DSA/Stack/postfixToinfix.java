import java.util.*;
public class postfixToinfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";

        Stack<String> val = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>= 48 && ascii<= 57){
                val.push(ch+"");
            }

            else if(ch == '-' || ch == '+' || ch == '*' || ch == '/'){
                String v2 = val.pop();
                String v1 = val.pop();

                String ans =  v1 + ch + v2;

                val.push(ans);
            }

        }

        System.out.println("Postfix To Infix Is  : ");
        System.out.println(val.peek());
    }
}
