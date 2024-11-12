import java.util.HashMap;

public class problem2 {
    

    public static HashMap<Character, Integer> makefreq (String str){
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch , 1);
            }
            else{
                mp.put(ch , mp.get(ch) + 1);
            }
        }

        return mp;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character , Integer> mp1 = makefreq(s);
        HashMap<Character , Integer> mp2 = makefreq(t);

        return mp1.equals(mp2);

    }

    public static void main(String[] args){
        String s = "aftab";
        String t = "bataf";

        System.err.println(isAnagram(s, t));
    }
}

