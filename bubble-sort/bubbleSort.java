

public class bubbleSort {
    
    public static void bubble(int arr[]){
        int n = arr.length;
        // outer loop 
        for(int i=0; i<arr.length; i++){
            // inner loop check index is big
            for(int j =0; j<n-i-1; j++){


                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};

       bubble(arr);
        
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
