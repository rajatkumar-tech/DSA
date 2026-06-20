import java.util.*;

public class trappingRainwater {
    
    public static int trappedRainwater(int height[]){
        // building is 2 this condition water id spill
        
        int n = height.length;
        if(n <= 2){
            return 0;
        }

        // find the maximum left boundary 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        // left start for the 1 index beacause 0 index is already define 
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // find the right maximum boundary

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        for(int i =0; i<n; i++){
            // find the minimum water store
             int waterlable = Math.min(rightMax[i], leftMax[i]);

             // find the how much water store in boundary

             int boundaryheight = waterlable - height[i];

             trappedWater += boundaryheight;
        }
        
       return trappedWater;


    }

    public static void main(String args[]){

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));
    }
}
