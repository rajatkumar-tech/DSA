class Solution {
    public boolean repeatedSubstringPattern(String s) {

        // create the double string for checking the two pointer approach

        String doubled = s +s;

        // remove the first and last character
        String middle = doubled.substring(1, doubled.length()-1);

        // check the in the middle string existing my 's' 
        if(middle.contains(s)){
            return true;
        }else{
            return false;
        }
    }
}