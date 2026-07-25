
public class upperCase {

    public static String upper(String str) {
        //build the empty string
        StringBuilder sb = new StringBuilder();

        //convert the first letter of string
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            // check the condition space and new word
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hi , i am shradha";

        System.out.println(upper(str));
    }

}
