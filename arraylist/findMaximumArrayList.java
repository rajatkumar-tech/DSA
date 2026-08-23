package arraylist;
import java.util.ArrayList;

public class findMaximumArrayList {


    public static int findMaximum(ArrayList<Integer> list){

        //store the maximum
        int max = Integer.MIN_VALUE;
        // iterate using loop
        for(int i =0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
    

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(22);
        list.add(10);
        list.add(29);
        list.add(2);
        
        System.out.println("Maximum is = "+ findMaximum(list));
    }
}
