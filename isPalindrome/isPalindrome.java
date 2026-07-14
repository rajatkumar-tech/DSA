import java.util.*;

public class isPalindrome{


    public static boolean isPalindrome(String str){

        String reversed = "";
        for(int i =str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    public static void main(String args[]){
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}