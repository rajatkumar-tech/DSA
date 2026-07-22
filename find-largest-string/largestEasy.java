public class largestEasy {

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
