public class practice{


    public static void miss (int str[]){

        int left =0;
        int right = str.length-1;


        while(left < right){
            int temp = left;
            left = right;
            right = temp;

            left++;
            right--;
        }

       

    }
    public static void main(String args[]){
     int str[] = {2,7,56, 100};
     int arr[] = miss(str);
     for(int i=0; i<arr.length;i++){
        System.out.print(str[i]+" ");
     }
    }
}