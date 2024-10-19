// if print the path

public class problem2 {

    static void printpath(int sr, int sc, int er, int ec, String s){
        if(sr > er || sc > ec){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        printpath(sr, sc+1, er, ec, s+"R");

        printpath(sr+1, sc, er, ec, s+"D");
    }
    public static void main(String[] args) {

        int er = 2;
        int ec = 3;

        printpath(1, 1, er, ec, "");

    }
}
