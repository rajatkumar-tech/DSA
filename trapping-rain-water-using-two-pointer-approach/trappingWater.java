import java.util.*;

public record trappingWater() {

<<<<<<< HEAD
    
    
    public static void main(String args[]){
       int height[] = {4, 2, 0, 6, 3, 2, 5};
=======
    public static int trappedWater(int height[]) {
        int n = height.length;
        int left = 0, right = n - 1;
        int maxLeft = 0, maxRight = 0;

        int waterLevel = 0;

        if (n <= 2)
            return 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    waterLevel += maxLeft - height[left];
                }
                left++;
                
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    waterLevel += maxRight - height[right];
                }
                right--;
            }
        }
        return waterLevel;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedWater(height));
>>>>>>> 22ec309b72d3b836c9e1e81a011e81c402b64b9c
    }
}
