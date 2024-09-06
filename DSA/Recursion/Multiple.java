import java.util.Scanner;
public class Multiple{

    static void multipleOfK(int num,int k){
        // Base case
        if(k == 1){
            System.out.println(num);
            return ;
        }
        // small task
        multipleOfK(num, k-1);
        // self work
        System.out.println(num*k);
    }
    
    public static void main(String[] args){
        System.out.println("Enter The valur of num and k");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();

        multipleOfK(num, k);
    }
}