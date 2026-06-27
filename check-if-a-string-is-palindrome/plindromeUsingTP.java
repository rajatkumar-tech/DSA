public class plindromeUsingTP {

    // solve this question using two pointer approach

    public static boolean isPalindrome(String str){
        if(str == null || str.length() <=1){
            return true;
        }

        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]){
        String str = "faasdas";
        System.out.println(isPalindrome(str));
    }
    
}
