

public class largestString {
    
    public static String larget(String str[]){

        // this work for the condition is null also the length is empty
        if(str == null || str.length == 0){
            return "";
        }

        // suppose the first element is largest the iterate
        String largest = str[0];

        // loop start for the 1th index the start comparision
        for(int i =1; i<str.length; i++){
            //start comparision
            if(str[i].length() > largest.length()){
                largest = str[i];
            }
        }

        // print the output
        return largest;
    }


    public static void main(String args[]){
        String str[] = {"apple", "mango", "banana"};
        System.out.println(larget(str));
    }
}
