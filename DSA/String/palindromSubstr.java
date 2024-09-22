import java.util.Scanner;

public class palindromSubstr {

    static boolean isPalindrom(String name){
        int i = 0;
        int j = name.length()-1;

        while(i < j){
            if(name.charAt(i) != name.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Name :");
        String name = sc.nextLine();

        int count = 0;
        for(int i = 0; i < name.length(); i++){
            for(int j = i+1; j < name.length()+1; j++){
                if(isPalindrom(name.substring(i, j)) == true){
                    System.out.print(name.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Number of palindromic substrings");
        System.out.println(count);
    }
}
