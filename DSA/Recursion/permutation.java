public class permutation {

    public static void printPermutation(String str, String t){
        if(str.equals("")){
            System.out.println(t);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String total = left + right;
            printPermutation(total, t+ch);
        }
    }
    public static void main(String[] args) {
        String str = "123";
        printPermutation(str, "");

    }
}
