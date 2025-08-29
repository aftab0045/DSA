public class practice {

    public static int Occ(int [] arr, int num){
        int count = 0;
        int LastOcc = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num) {
                LastOcc = i;
                count++;
            }
        }
        
        return LastOcc;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,6,4,3,6,4,2,4,3};
        int num = 3;

        System.out.println(Occ(arr,num));
        
    }
}
