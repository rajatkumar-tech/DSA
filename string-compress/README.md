// this question solutation time complexity is O(n^2) and space complexity O(n) 


public class compress{

    public static String compressString(String str){
        // empty the string
        String newStr = "";

        for(int i =0; i<str.length(); i++){
            //already decalered the count is 1
            Integer count =1;

            //1st condition to find not show the error out of boundary
            //2nd condition to match the current character and next character 
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            //match the next current and add the empty string
            newStr += str.charAt(i);
            if(count > 1){
                //greater count is 1 then increate the count
                newStr += count;
            }
        }
        return newStr;
    }

    public static void main(String args[]){
        String str = "aaabbcc";

        System.out.println(compressString(str));
    }
}









//  this question time complexity is O(n) and space complexity is o(n) so there optimized to the previous code 

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
