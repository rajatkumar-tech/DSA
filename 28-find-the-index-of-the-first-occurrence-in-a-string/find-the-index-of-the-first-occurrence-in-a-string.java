class Solution {
    public int strStr(String haystack, String needle) {
        // find the diffrence for the how much move the string 

        int diffLength = haystack.length() - needle.length();

        for(int i =0; i<= diffLength; i++){
            // find the length which string moving how much steps
            String findSubstring = haystack.substring(i, i + needle.length());

            //check the equal condition match or not
            if(findSubstring.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}