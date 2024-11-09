public class NQueen2{

    public static boolean isSafe(int[][] board, int row, int col){

        int n = board.length;
        for(int i = 0; i < n; i++){
            if(board[i][col] == 'Q')
            return false;
        }

        for(int j = 0; j < n; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
            
        }

        // North - East
        int i = row;
        int j = col;
        while(i>=0 && j < n){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;
        }


        // East -  South
        i = row;
        j = col;
        while(i < n && j < n){
            if(board[i][j] == 'Q'){
                return false;
            }
            i++;
            j++;
        }

        // South - West
        i = row;
        j = col;
        while(i < n && j >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i++;
            j--;
        }

        // West - North
        i = row;
        j = col;
        while(i>=0 && j >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }



        return true;
    }

    public static void nQueen(int [][] board, int row){
        int n = board.length;

        if(row == n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.println(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            return;
        }

        for(int j = 0; j < n; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = '.';
            }
        }
    }

    public static void main(String[] args){
        int n = 4;
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] ='.';
            }
        }

        nQueen(board,0);
    }
}