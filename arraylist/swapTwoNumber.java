package arraylist;

import java.util.ArrayList;

public class swapTwoNumber {
    
    public static void swap(ArrayList<Integer> list , int idx1, int idx2){

        // list [1, 2, 3, 4]
        int temp = list.get(idx1);        // Step 1: Temp variable mein idx1 ki value (3) store ki
        list.set(idx1, list.get(idx2));  // Step 2: idx1 par idx2 ki value (4) daal di -> List: [1, 2, 4, 4]
        list.set(temp, idx2);            // Step 3: idx2 par temp ki value (3) daal di -> List: [1, 2, 4, 3]
    }

    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        swap(list, 2, 3);
        System.out.println(list);
    }
}
