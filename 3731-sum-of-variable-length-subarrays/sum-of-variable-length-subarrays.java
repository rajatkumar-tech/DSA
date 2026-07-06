class Solution {
    public int subarraySum(int[] nums) {
        // store sum total 
        int totalSum =0;
        // iterate loop one by one index
        for(int i =0; i<nums.length; i++){
            // find out the maximum 
            int start = Math.max(0, i -nums[i]);

            int subArraySum = 0;
            // second loop store iterate ith to jth index
            for(int j = start; j<=i; j++){
                // sum or totel subarray
                subArraySum = subArraySum + nums[j];
            }

            // sum of total sum and subarray
            totalSum = totalSum + subArraySum; 
            
        }
        return totalSum;
    }
  
}