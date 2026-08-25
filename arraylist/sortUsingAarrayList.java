package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class sortUsingAarrayList {
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(7);

        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted list = "+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse Order = "+ list);
    }
}
