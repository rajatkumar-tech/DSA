class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        if(n == 0 || nums == null) return 0;

        int sum =0;

        int actualSum = n*(n+1)/2;

        for(int i =0; i<n; i++){
            sum = sum + nums[i];
        }

        int diff = actualSum - sum;
        return diff;
    }
}