// import java.util.Scanner;

// public class first {
//     public static void main (String [] args){

//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter your num : ");

//        int num = sc.nextInt();
//        int  digit;
//        int count = 0;
//        while(num>0){
//         digit = num % 10;
//         count = count + 1;
//         num = num / 10;
//        }
//        System.out.println(count);
//     }
// }



import java.util.Scanner;

public class fisrt {
    public static void main(String [] args){

        System.out.println("Enter the binary Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pw = 1;
        int ans =0;
        while(num>0){
            int r = num % 10;
            ans = ans + (r*pw);
            num = num / 10;
            pw = pw*2;

        }

        System.out.println(ans);
    }
}