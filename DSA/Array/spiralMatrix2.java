import java.util.*;
public class spiralMatrix2 {
    
    // Print given Matrix
    static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiral(int n){
        int [][] matrix = new int[n][n];
        int top_row = 0;
        int right_col = n-1;
        int bottom_row = n-1;
        int left_col = 0;
        int Num = 1;

        while(Num <= n*n){

            // Step 1: Print top row -> left_col to right_col
            
            for(int j = left_col; j <= right_col && Num<= n*n; j++){
                matrix[top_row][j] = Num++;
            }
            top_row++;

            // Step 2: print right_col -> top_row to bottom_row

            for(int i = top_row; i <= bottom_row && Num<= n*n; i++){
                matrix[i][right_col] = Num++;
            }
            right_col--;

            // Step 3: print bottom_row -> right_col to left_col

            for(int j = right_col; j >= left_col && Num<= n*n ; j--){
                matrix[bottom_row][j] = Num++;
            }
            bottom_row--;

            // step 4: print left_col -> bottom_row to top_row

            for(int i = bottom_row; i >= top_row && Num<= n*n; i--){
                matrix[i][left_col] = Num++;
            }
            left_col++;
        }

        return matrix;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of N : ");
        int n = sc.nextInt();

        System.out.println(" Generated Spiral Matrix Is : ");
        int[][] ans = generateSpiral(n); 
        print(ans);
    }
}
