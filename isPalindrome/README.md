// isPalindrome.java

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

this code id a brote force approach beacause fistly this loop fill the reserved variable 
then {equal} method check the string is same or not 


// optimized isPalindrome code  

public class optimizedisPalindrome {

    public static boolean optimizedisPalindrome(String str) {
        if (str.length() == 0 || str == null) {
            return true;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        String str = "MADAM";
        System.out.println(optimizedisPalindrome(str));
    }

}


this code is optimized this code time complexity is O(N) and space complexity is O(1)
how can improve it 

// fistly str is null and str.length() is null then back the method 

// secondly loop is running to half of the string the improve the time complexity and also we use the two pointer approach 

// compair first and last method is same of not that is why improve the time complexity
