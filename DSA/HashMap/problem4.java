import java.util.HashMap;

public class problem4 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] arr = {15,-2,2,-8,1,7,10,23};
        int max = 0;
        int prefixSum = 0;

        mp.put(0, -1);
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            if(mp.containsKey(prefixSum)){
                max = Math.max(max, i - mp.get(prefixSum));
            }
            else{
                mp.put(prefixSum,i);
            }
        }
       
        System.out.println("Max SubArray Is : ");
        System.out.println(max);
    }
}
