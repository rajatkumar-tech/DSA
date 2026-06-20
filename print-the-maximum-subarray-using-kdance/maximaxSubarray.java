import java.util.*;

public class maximaxSubarray {
    
    public static void prefixSum(int arr[]){
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            curr = curr + arr[i];

            if (curr > maxSum){
                maxSum = curr;
            }

            if(curr < 0){
                curr = 0;
            }
        }

        System.out.println("maximum subarray = "+maxSum);

    }

    public static void main(String args[]){
        int arr[] = {1, -2, 6, -1, 3};
        prefixSum(arr);
    }
}
