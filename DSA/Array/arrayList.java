import java.util.*;
public class arrayList
{
    static void reverse(ArrayList<Integer> list){
        int i = 0;
        int j = list.size() - 1;
        
        while(i<j){
            
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            
            i++;
            j--;
        }
    }
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Orignal List : ");
		System.out.println(list);
		
		System.out.println("After Reverse List : ");
		reverse(list);
		System.out.println(list);
	}
}