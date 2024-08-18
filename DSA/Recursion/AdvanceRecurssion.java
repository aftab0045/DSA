public class AdvanceRecurssion {

    // Frog just jump from idx 0 to idx1 or idx2 then at array.length we have to calculate min cost in form of |h[idx]-h[idx+1]|
    static int JumpFrog(int[] h, int n,int idx){
        if(idx == n-1){
            return 0;
        }

        int opt1 = Math.abs(h[idx]-h[idx+1])+JumpFrog(h,n,idx+1);
        if (idx == n-2) {
            return opt1;
        }
        int opt2 = Math.abs(h[idx]-h[idx+2])+JumpFrog(h,n,idx+2);

        return Math.min(opt1, opt2);
    }
    public static void main(String[] args){
        int [] h = {10,30,40,20,60,34,22};

        System.out.println(JumpFrog(h, h.length, 0));
    }
}
