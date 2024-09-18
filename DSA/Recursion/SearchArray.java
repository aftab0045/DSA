import java.util.ArrayList;
public class SearchArray {

    // check the target is present in array
    static boolean SearchArray(int[] arr, int target, int idx){
        if(idx == arr.length){
            return false;
        }

        if(arr[idx] == target){
            return true;
        }

       return SearchArray(arr, target, idx+1);
    }

    // print the idx where the target is present
    static void findAllIDX(int[] arr, int target, int idx){
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == target){
            System.out.println(idx);
        }

        findAllIDX(arr, target, idx+1);
    }

    // print the idx using ArrayList
    static ArrayList<Integer> findIDXs(int[] arr, int target, int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx == arr.length){
            return ans;
        }

        if(idx == target){
            ans.add(idx);
        }

        findAllIDX(arr, target, idx+1);

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,5};
        int target = 4;
        int idx = 0;

    // System.out.println(SearchArray(arr, target, idx));

    // findAllIDX(arr, target, idx);

    ArrayList<Integer> ans = findIDXs(arr, target, idx);
    for(Integer i:ans){
        System.out.println(i);
    }
    }
}
