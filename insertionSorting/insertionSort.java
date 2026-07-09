public class insertionSort{

    public static void insertion(int arr[]){
        
        
        int n = arr.length;

        if(arr == null || n <= 1){
            return;
        }
        
        for(int i=1; i<n; i++){
            // find the curr 
            int curr = arr[i];
            // find the previous 
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                //shifting the larger to end 
                arr[prev+1] = arr[prev];
                prev--;

                
            }
            // this line is actual insertion sort
            arr[prev+1] = curr; 
        }
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};

        insertion(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}