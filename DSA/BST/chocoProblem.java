public class chocoProblem {

    static boolean divisionPosiible(int[] arr, int numOfStudents , int maxchocoAllocat){
        int numOfStudent = 1;
        int choco = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxchocoAllocat){
                return false;
            }

            if(choco + arr[i] <= maxchocoAllocat){
                choco += arr[i];
            }
            else{
                numOfStudent++;
                choco = arr[i];
            }
        }

        return numOfStudent<=numOfStudents;
    }

    static int chocoDistribution(int[] arr, int numOfStudents){
        int start = 1;
        int end = (int)1e9;
        int ans = 0;

        if(arr.length < numOfStudents){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;
            if(divisionPosiible(arr,numOfStudents,mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {12,34,67,90};
        int numOfStudents = 2;

        System.out.println(chocoDistribution(arr,numOfStudents));
    }
}
