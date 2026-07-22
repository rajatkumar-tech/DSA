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



// this function working on the first character 

public class largestEasy {

    // this method comparing to the word only 
    // "banana" = first word is 'b'
    // "mango"  = first word is 'm'  == M is greater to another word
    // "apple" = first word is 'a' 
    public static String largest(String str[]) {
        if (str == null || str.length == 0) return "";

        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(largest) > 0) {
                largest = str[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        String str[] = { "banana", "mango", "apple" };

        System.out.println(largest(str));
    }
}
