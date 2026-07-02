class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        if(n == 0) return result;

        for(int i =0; i<n; i++){
            int start = nums[i];

            while(i+1 < n && nums[i+1] == nums[i] +1){
                i++;
            }

            StringBuilder sb = new StringBuilder();

            if(start == nums[i]){
                sb.append(start);
            }else{
                sb.append(start).append("->").append(nums[i]);
            }

            result.add(sb.toString());
        }
        return result;
    }
}