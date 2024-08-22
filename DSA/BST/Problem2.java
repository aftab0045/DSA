// Find the num which can be occure before any not SQRT num means if target is 10 then ans 3 if target is 21 ans is 4
import java.util.Scanner;
public class Problem2 {

    static int findSQRT(int target){
        int start = 0;
        int end = target;
        
        int ans = -1;

        while (start<=end) {
            int mid = start+(end-start)/2;
            int val = mid*mid;
            if(val == target){
                return mid;
            }
            else if(val > target){
                end = mid-1;
            }
            else{
                start = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("ENter the target");
        Scanner sc = new Scanner(System.in);


        int target = sc.nextInt();

        System.out.println(findSQRT(target));
    }
}
