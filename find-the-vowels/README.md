// this question already have hai good time complexity but one problem in this question this solution not convert to uppercase 

// package find-the-vowels;

public class findVowels {

    public static int vowel(String str){
        int count =1;
        
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }


    public static void main(String args[]){
        String str = "aaacctou";

        System.out.println("All vowels = "+ vowel(str));
    }
    
}



//