// Rat in a maze problem we have to find thw ways rat only goes right or down in 2d matrix
// Youtube CW = 67 Q = 1

public class problem1 {

    static int maze(int sr, int sc, int er, int ec){
        if(sr > er || sc > ec){
            return 0;
        }

        if(sr == er && sc == ec){
            return 1;
        }

        int downway = maze(sr+1, sc, er, ec);
        int rightway = maze(sr, sc+1, er, ec);

        int totalways = downway + rightway;
        
        return totalways;
    }
    public static void main(String[] args) {
        int er = 3;
        int ec = 3;
        int count = maze(1, 1, er, ec);
        
        System.out.println(count);
    }
}
