import java.util.HashMap;

public class problem1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,3,4,1,4,2,4,2,4,5,2};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int e : arr){
            
            if(!freq.containsKey(e)){
                freq.put(e, 1);
            }
            else{
                freq.put(e, freq.get(e) + 1);
            }
        }

        System.out.println(freq);

        int maxKey = 0;
        int anKey = 0;

        for(int key : freq.keySet()){
            if(freq.get(key) > maxKey){
                maxKey = freq.get(key);
                anKey = key;
            }
        }

        System.out.printf("At Key %d Max Frequency Is %d",anKey,maxKey);
    }
}
 