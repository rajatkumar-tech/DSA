public class bubbleSortOptimised {


    // this bubble sort is optimised because suppose arr is already sorted so program not run numbers of time;
    public static void bubble(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            // firstly all is false 
            boolean alreadySorted = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // suppose any one swap then this condition is true otherwise all is false
                    alreadySorted = true;
                }

            }
            // checkint no any swap this condition time complexity is O(n)
            if (alreadySorted == false) {
                break;
            }

        }
    }

    public static void main(String args[]){
        int arr[] = {4, 5, 1, 3, 2};

        bubble(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
