import java.util.*;
public class pascalsTriangle {

    static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] pascalsTriangle(int n){
        // create jagged arr for pascals tree where colums are not fixed
        int [][] ans = new int[n][];

        for(int i=0;i<n;i++){

            // Pascal trangle has jagged arr so we manusally created each column first 
            ans[i] = new int[i+1];

            // In pascals tree 1st and last element in arr is 1 
            ans[i][0] = ans[i][i] = 1;
            

            for(int j = 1 ;j < i; j++){

                // Every elements except 1st and last is addition of its parents node
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
            
        }

        return ans;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The vlaue of N :");
        int n = sc.nextInt();

        System.out.println("Pascal's Tree for "+n+" Numbers Is : ");
        int[][] ans = pascalsTriangle(n);
        print(ans);
    }
}
