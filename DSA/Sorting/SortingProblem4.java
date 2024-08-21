/*Given an arr of positive and negative integ, segregate them in linear time and cnst space.
      the output should print all negative num followed by all positivw num.
      i/p = {19,-20,7,-4,-13,11,-5,3}
      o/p = {-20,-4,-13,-5,7,11,19,3}              */ 

public class SortingProblem4 {

    static void sortArray(int [] arr, int start, int end){
        int i = 0, j = arr.length-1;
        while(i<j){
            while(arr[i]<0) i++;
            while (arr[j]>0) j--;
            
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        
    }
    public static void main(String[] args){
        int[] arr = {19,7,-4,-13,11,-5,3};

        int n = arr.length;
        sortArray(arr,0,n-1);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
