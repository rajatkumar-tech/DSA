

public class countingSort {
    
    public static void counting(int arr[]){
        // empty conditon
        if(arr == null || arr.length <= 1){
            return;
        }
        
        int n  = arr.length;
        // store the largest
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){

            // find the largest value
           largest = Math.max(largest, arr[i]);
        }
        // create the new array to count the value
        int count[] = new int[largest+1];

        for(int i =0; i<arr.length; i++){
         
            count[arr[i]]++;
        }

        int j =0; 

        for(int i =0; i<count.length; i++){
            // checking the value and arrange the sorting method
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 3, 1, 4};

        counting(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
