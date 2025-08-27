import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        String[] arrString = sc.nextLine().split(" ");

        int result = countConnectedComponents(arrString);
        System.out.println(result);
    }

    static int countConnectedComponents(String[] arrString) {
        Set<String> uniqueKeys = new HashSet<>();

        for (String word : arrString) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray); // Sorted version is the "anagram key"
            uniqueKeys.add(key); // Add the unique sorted key
        }

        return uniqueKeys.size(); // Each unique key represents one connected component
    }
}
