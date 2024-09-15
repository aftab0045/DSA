import java.util.*;
public class rectangleSum {

    // 1st Approach to calculate the sum of rectangle 
    // Brute force 
    static int sumOfRectangle(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of Row and Column :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter "+r*c+" Elements In Matrix : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter The Values Of L1 , R1 , L2 , R2 ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Sum Of Rectangle is : ");
        System.out.println(sumOfRectangle(matrix, l1, r1, l2, r2));
    }
}
