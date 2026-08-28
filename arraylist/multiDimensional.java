package arraylist;

import java.sql.Array;
import java.util.ArrayList;

public class multiDimensional {

    public static void main(String args[]){
        ArrayList<ArrayList <Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(9);
        mainlist.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(6);
        list1.add(10);
        mainlist.add(list1);

        System.out.println(list);
        System.out.println(list1);
        System.out.println(mainlist);
    }
    
}
