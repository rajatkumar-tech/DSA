// package convert-a-given-string-first-latter-uppercase;

public class upperCase {
    
    public static String upper(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

         return sb.toString();
    }

    public static void main(String args[]){
        String str = "hi , i am rajat";
        System.out.println(upper(str));
    }
   
}
