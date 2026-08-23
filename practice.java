import java.util.ArrayList;
import java.util.ArrayList;

public class practice{

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }



     public static void main(String args[]) {
      ArrayList<Integer> list = new ArrayList<>();

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);

     swap(list, 2, 3);
     System.out.println(list);
        
    }
}
    





    /*
    // intersection of two array for brute force approach
    public static void insertation(int arr1[], int arr2[]) {
        if (arr1.length == 0 || arr1 == null && arr2.length == 0 || arr2 == null) {
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            int ith = arr1[i];

            for (int j = 0; j < arr2.length; j++) {
                int jth = arr2[j];

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
             

    }
        */



    /*
    
    public class practice {

    public static int findMax(ArrayList<Integer> list){
        
        int max = Integer.MIN_VALUE;
        for(int i =0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
    
    */

   