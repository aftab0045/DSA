public class sudokuSolver {

    public static boolean isValid(char[][] board, int row, int col, int num) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num)
                return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }

        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;

        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void solver(char[][] board, int row, int col, char[][] grid) {

        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    grid[i][j] = board[i][j];
                }
            }
        } else if (board[row][col] != '.') {
            if (col != 8) {
                solver(board, row, col + 1, grid);
            } else {
                solver(board, row + 1, 0, grid);
            }
        } else {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(board, row, col, ch)) {
                    board[row][col] = ch;
                    if (col != 8) {
                        solver(board, row, col + 1, grid);
                    } else {
                        solver(board, row + 1, 0, grid);
                    }
                    board[row][col] = '.';
                }
            }
        }
    }

    public void solveSudoku(char[][] board) {
        char[][] grid = new char[9][9];
        solver(board, 0, 0, grid);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = grid[i][j];
            }
        }
    }

    public static void main(String[] args) {
        sudokuSolver solver = new sudokuSolver();
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Sudoku board before solving:");
        printBoard(board);

        solver.solveSudoku(board);

        System.out.println("\nSudoku board after solving:");
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
