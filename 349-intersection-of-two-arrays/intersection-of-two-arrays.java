class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


        Arrays.sort(nums1);  // sort the numbers
        Arrays.sort(nums2);   // sort the numbers

        int i = 0;
        int j =0;
        int k =0;


        int temp[] = new int[Math.min(nums1.length, nums2.length)];  // store the minimum length

        while(i <nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums2[j] < nums1[i]){
                j++;
            }else if(nums1[i] == nums2[j]){

                // match the number avoid he Duplicates number
                if( k == 0 || temp[k-1] != nums1[i]){
                    temp[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            }
        } 

        // fast copy added side result array 
        return Arrays.copyOf(temp, k);
        
    }
}