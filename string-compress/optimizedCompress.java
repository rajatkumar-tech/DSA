public class optimizedCompress {

    public static String compressOptimized(String str){
        // use the already empty stringBuilder method
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<str.length(); i++){
            int count =1;

            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            // fill the empty string
            sb.append(str.charAt(i));
            if(count >1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String str = "aaabbcc";

        System.out.println(compressOptimized(str));
    }
    
}
