import java.util.*;
public class spiralMatrix {

    // Print given Matrix
    static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void spiralmatrix(int[][] matrix, int r, int c){
        int top_row = 0;
        int right_col = c-1;
        int bottom_row = r-1;
        int left_col = 0;
        int total_Nums = 0;

        while(total_Nums < r*c){

            // Step 1: Print top row -> left_col to right_col
            
            for(int j = left_col; j <= right_col && total_Nums<r*c; j++){
                System.out.print(matrix[top_row][j]+" ");
                total_Nums++;
            }
            top_row++;

            // Step 2: print right_col -> top_row to bottom_row

            for(int i = top_row; i <= bottom_row && total_Nums<r*c; i++){
                System.out.print(matrix[i][right_col]+" ");
                total_Nums++;
            }
            right_col--;

            // Step 3: print bottom_row -> right_col to left_col

            for(int j = right_col; j >= left_col && total_Nums<r*c ; j--){
                System.out.print(matrix[bottom_row][j]+" ");
                total_Nums++;
            }
            bottom_row--;

            // step 4: print left_col -> bottom_row to top_row

            for(int i = bottom_row; i >= top_row && total_Nums<r*c; i--){
                System.out.print(matrix[i][left_col]+" ");
                total_Nums++;
            }
            left_col++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Rows : ");
        int r = sc.nextInt();
        System.out.println("The Number Of Coloms : ");
        int c = sc.nextInt();
        System.out.println("Enter Total "+r*c+" Elements in Matrix : ");
        int matrix[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Orignal Matrix Is : ");
        print(matrix);

        System.out.println("Spial Order Is : ");
        spiralmatrix(matrix, r, c);
    }
}
