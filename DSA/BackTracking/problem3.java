// Rat problems with blockers and 4 directions 

public class problem3 {

    static void print(int sr, int sc, int er, int ec, String s, int[][] maze){
        if(sr < 0 || sc < 0){
            return;
        }
        if(sc > er || sr > ec){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        if(maze[sr][sc] == 0){
            return;
        }
        if(maze[sr][sc] == -1){
            return;
        }

        maze[sr][sc] = -1;

        print(sr, sc+1, er, ec, s+"R", maze);       //  right
        print(sr+1, sc, er, ec, s+"D", maze);       // down
        print(sr, sc-1, er, ec, s+"L", maze);       //  left
        print(sr-1, sc, er, ec, s+"U", maze);        // up

        maze[sr][sc] = 1;
    }
    public static void main(String[] args) {
        int er = 3;
        int ec = 4;

        int[][] maze = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};

        print(0, 0, er-1, ec-1, "", maze);                

    }
}
