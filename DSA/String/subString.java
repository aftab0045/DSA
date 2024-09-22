import java.util.*;
public class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");

        String name = sc.nextLine();

        for(int i = 0; i < name.length(); i++){
            for(int j = i+1; j < name.length()+1; j++){
                System.out.print(name.substring(i, j)+" ");
            }
        }
    }
}
