import java.util.Scanner;

public class rotateMatrix{

    static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeINplace(int[][] matrix,int r,int c){
        for(int i =0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverse(int[] matrix){
        int i = 0;
        int j = matrix.length-1;
        
        while (i<j) {
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateMatrix(int[][] matrix,int r,int c){
        // Take transpoe Of matrix
        transposeINplace(matrix,r,c);

        // Take reverse of each row of matrix and then you get rotate of matrix
        for(int i=0;i<r;i++){
            reverse(matrix[i]);
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

        System.out.println("Transpose Of Matrix Is : ");
        rotateMatrix(matrix,r,c);
        print(matrix);
    }
}