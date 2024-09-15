import java.util.Scanner;

public class RectangleSum2 {

    static void prefixSum(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int RectangeSum(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0, ans = 0, top = 0, left = 0, topLeft = 0;

        prefixSum(matrix);

        sum = matrix[l2][r2];
        if(l1 >= 1){
            top = matrix[l1-1][r2];
        }
        if(r1 >= 1){
            left = matrix[l2][r1-1];
        }
        if(l1 >= 1 && r1 >= 1){
            topLeft = matrix[l1-1][r1-1];
        }

        ans = sum - top - left + topLeft;

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The values Of Row and Column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter "+r*c+" Elements In Matrix : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter The Value Of L1 , R1 , L2 , R2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("The Sum Is : ");
        System.out.println(RectangeSum(matrix,l1,r1,l2,r2));
    }
}
