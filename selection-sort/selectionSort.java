

public class selectionSort {

    public static void selection(int arr[]){
       
        int n = arr.length;
        // outer loop
        for(int i =0; i<n-1; i++){
            // find out the smallest element for full length
            int smallestEl = i;
           // inner loop
            for(int j = i+1; j<n; j++){
                // comparison which element is smallest
                if(arr[smallestEl] > arr[j]){
                    smallestEl = j;
                }
            }

            // find out the smallest then swap the element
            int temp = arr[smallestEl];
            arr[smallestEl] = arr[i];
            arr[i] = temp;

           

        }
    }

    public static void main(String args[]){
        int arr[] = {5, 4,1, 3, 2};

        selection(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
