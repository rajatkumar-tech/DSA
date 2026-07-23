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
