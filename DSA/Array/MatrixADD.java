import java.util.Scanner;
public class MatrixADD {

    // Print 2d Array
    static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    static void addMatrix(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Addition Not Possible");
        }

        int [][] sum = new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum Of Matrix A and Matrix B is : ");
        print(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Matrix Data :");
        System.out.println("Enter R1 size");
        int r1 = sc.nextInt();
        System.out.println("Enter C1 size");
        int c1 = sc.nextInt();
        int[][] a = new int [r1][c1];
        System.out.println("Enter "+r1*c1+" Elements in 2d Array");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd Matrix Data :");
        System.out.println("Enter R2 size");
        int r2 = sc.nextInt();
        System.out.println("Enter C2 size");
        int c2 = sc.nextInt();
        int[][] b = new int [r2][c2];
        System.out.println("Enter "+r2*c2+" Elements in 2d Array");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }

        addMatrix(a, r1, c1, b, r2, c2);
    }
}
