import java.util.Scanner;

public class GCDcal {
    // Euclids approach
    static int GCDcal(int x,int y){
        if(y == 0){
            return x;
        }
        return GCDcal(y,x%y);
    }

    public static void main(String[] args){
        System.out.println("Enter the value of x and y ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(GCDcal(x, y));

    }
}
