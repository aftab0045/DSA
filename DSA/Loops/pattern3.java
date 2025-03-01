import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wnter N value");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 2; j <= n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*

* 
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

 */
