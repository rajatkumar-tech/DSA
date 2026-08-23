import java.util.Arrays;



public class practice {


    public static int[] intersection(int num1[], int num2[]){
        Arrays.sort(num1);
        Arrays.sort(num2);

        int i =0, j =0, k =0;

        int temp[] =new int[Math.min(num1.length, num2.length)];

        while ( i < num1.length && j < num2.length) {
            if(num1[i] < num2[j]){
                i++;
            }else if(num2[j] < num1[i]){
                j++;
            }else if(num1[i]  == num2[j]){
                
                    temp[k] = num1[i];
                    k++;
                
                i++;
                j++;
            }
        }

        return Arrays.copyOf(temp, k);
    }

     public static void main(String args[]) {
        int arr1[] = { 2, 4, 2, 9 };
        int arr2[] = { 2, 9, 5, 2 };

        System.out.println(Arrays.toString(intersection(arr1, arr2)));
        
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

   