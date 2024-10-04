import java.util.*;
public class problem7 {

    static boolean balancedBracket(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);

            if(ch == '('){
                st.push('(');
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek() == '('){
                    st.pop();
                }
            }
        }

        if(st.size() > 0){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String : ");
       String str = sc.nextLine(); 

       System.out.println(balancedBracket(str));
    }
}
