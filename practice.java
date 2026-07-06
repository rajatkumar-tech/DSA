public class practice{


    public static void miss (int arr[]){

        for(int i =0; i< arr.length-1; i++){
           
            int stVal = arr[i];

            for(int j =i+1; j<arr.length; j++){
                int jth = arr[j];

                System.out.print(stVal+jth+" ");
            }
        }

    }
    public static void main(String args[]){
        int arr[] = {2,3,1};

        

        
    }
}