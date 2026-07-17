

public class largestString {
    
    public static String larget(String str[]){

        if(str == null || str.length == 0){
            return "";
        }

        String largest = str[0];
        for(int i =1; i<str.length; i++){
            if(str[i].length() > largest.length()){
                largest = str[i];
            }
        }
        return largest;
    }


    public static void main(String args[]){
        String str[] = {"apple", "mango", "banana"};
        System.out.println(larget(str));
    }
}
