import java.util.Scanner;

public class revWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Str : ");
        String str = sc.nextLine();
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }

        }
        sb.reverse();
        ans += sb;

        System.out.println(ans);
    }
}
