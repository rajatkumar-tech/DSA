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
