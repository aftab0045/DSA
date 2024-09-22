import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("Orignal String "+str);
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int asciValue = (int)c;            // asci val for A = 65 and a = 97 difference is 32

            if(asciValue >= 97){
                asciValue -= 32;
                char dh = (char)asciValue;
                str.setCharAt(i, dh);
            }
            else{
                asciValue += 32;
                char dh = (char)asciValue;
                str.setCharAt(i, dh);
            }
        }

        System.out.println("After Toggle : "+str);
        
    }
}
