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


    // 2nd Approach 
    // Calculate prefix sum matrix

    static void prefixSum(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    static int sumOfRectangle2(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        prefixSum(matrix);

        for(int i = l1; i <= l2; i++){

            if( r1 >= 1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else{
                sum += matrix[i][r2] ;
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

        System.out.println("Sum Of Rectangle is : ");
        System.out.println(sumOfRectangle2(matrix, l1, r1, l2, r2));
    }
}
