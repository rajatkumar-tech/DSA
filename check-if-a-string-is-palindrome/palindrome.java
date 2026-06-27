public class palindrome {

    public static boolean isPalindrome(String str) {

        int n = str.length();

        // string is null and the character only 1
        if (str == null || n <= 1) {
            return true;
        }

        //inration the loop of middle 
        for (int i = 0; i < n / 2; i++) {
            // check the one by one charcter start to end 
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
            
        }
       return true;

    }

    public static void main(String args[]) {
        String str = "";
        System.out.println(isPalindrome(str));
    }

}
