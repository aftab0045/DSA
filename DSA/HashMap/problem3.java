import java.util.HashMap;

public class problem3 {
    
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            Character Sch = s.charAt(i);
            Character Tch = t.charAt(i);

            if(mp.containsKey(Sch)){
                if(mp.get(Sch) != Tch){
                    return false;
                }
            }
            else if(mp.containsValue(Tch)){
                return false;
            }
            else{
                mp.put(Sch, Tch);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aftab";
        String t = "qpmqz";
        
        System.out.println(isIsomorphic(s,t));
    }
}

