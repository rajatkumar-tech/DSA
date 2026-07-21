here is the brute approach because arr iterate one by one index and the Timr complexity O(N* l) and the space complexity O(1)



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

add the string important talks