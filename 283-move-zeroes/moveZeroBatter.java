import java.util.*;

public class moveZeroBatter{

    public static void moveZeroforBatter(int arr[]){
        if(arr == null || arr.length == 0) return;

        int nonZero =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] != 0){
            
            int temp = arr[i];
            arr[i] = arr[nonZero];
            arr[nonZero] = temp;

            nonZero++;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {0, 1, 0, 13, 3};
        moveZeroforBatter(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}