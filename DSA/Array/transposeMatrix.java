import java.util.Scanner;
public class transposeMatrix {

    static void print(int[][] matrix){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] Transpose(int[][] matrix,int r,int c){
        int[][] ans = new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }
    public static void main(String[]args){
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
        int[][] ans = Transpose(matrix,r,c);
        print(ans);
    }
}
