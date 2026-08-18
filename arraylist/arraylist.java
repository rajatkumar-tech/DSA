package arraylist;
import java.util.ArrayList;


public class arraylist{

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);


        //get elements
        int getElements = list.get(2);
        System.out.println("Get elements = "+ getElements);

        //remove elements 
        int removeElements = list.remove(0);
        System.out.println("Remove elements = "+removeElements);
        System.out.println("Currents List = "+ list);

        // set elements
        int changeElements = list.set(1, 11);
        System.out.println("change elemensts ="+ changeElements );
        System.out.println("current list = "+ list);

        // contain elements
        /*  contain means any number exist in array. suppose exist 2 in array then return is 
        true otherwise other number like 22 not exist in array then return is false */
        System.out.println(list.contains(2));
        System.out.println(list.contains(22));
        
    }
}