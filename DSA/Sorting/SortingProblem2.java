public class SortingProblem2 {

    static void SortFruits(String[] fruits){
        int n = fruits.length;

        for(int i=0;i<n-1;i++){
            int minIDX = i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[minIDX]) < 0){
                    minIDX = j;
                }

                String temp = fruits[i];
                fruits[i] = fruits[minIDX];
                fruits[minIDX] = temp;
            }
        }
    } 
    public static void main(String[] args){
        String[] fruits = {"lichi","watermelon","mango","apple","lemon","papaya"};
        SortFruits(fruits);

        for(String val : fruits){
            System.out.print(val+" ");
        }
    }
}
