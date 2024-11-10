import java.util.HashMap;

public class Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> d = new HashMap<>();

        // Insert Elements In Key-Value 
        d.put("A", 22);
        d.put("B", 12);
        d.put("C", 23);
        d.put("D", 18);
        d.put("E", 13);

        // Get Value usinn key 
        System.out.println(d.get("A"));

        // Update Value Using Key
        d.put("A", 10);        // For updation
        System.out.println(d.get("A"));

        // Remove Pair
        d.remove("C");
        System.out.println(d.get("C"));     // Showing Null If Not present in HashMap

        // Check If Key is Present Or Not
        System.out.println(d.containsKey("C"));   // False
        System.out.println(d.containsKey("A"));   // True

        // Add Key If And Only If The Key Is Not Exist In HashMap
        // First Method
        if(!d.containsKey("Z")){
            d.put("Z", 3);
        }
        System.out.println((d.get("Z")));

        // Second Method
        d.putIfAbsent("Y", 2);

        System.out.println(d.get("Y"));



        // If You Just Want To See ALL Key Pairs
        System.out.println(d.keySet());

        // Just For All Values Pairs
        System.out.println(d.values());

        // For Printing All The key Values Pairs
        System.out.println(d.entrySet());


        // Traversing All Entities Of HashMap
        for(String str : d.keySet()){
            System.out.printf("Age Of %s Is %d\n",str,d.get(str));
        }
    }
}
