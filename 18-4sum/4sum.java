class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        //suppose array length is less then 4 for this condition work 
        if(nums == null && nums.length < 4){
            return result;
        }

        // sort the array 
        Arrays.sort(nums);
        int n = nums.length;

        // outer loop 
        for(int i =0; i<n-3; i++){
            //check the duplicate for ith index
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            // inner loop 
            for(int j =i+1; j<n-2; j++){
                // check the duplicate of j
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                // apply the two pointer approach then find the left and right
                int left = j+1;
                int right = n-1;

                while (left < right){

                    // long datatype use for the protected overflow 
                    long sum =(long) nums[i] + nums[j]+ nums[left]+ nums[right];

                    if(sum < target){
                        left++;
                    } else if(sum > target){
                        right--;
                    }else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // skip the duplicate number
                        while (left < right && nums[left] == nums[left+1]){
                            left++;
                        }
                        // skip the duplicate number
                        while(left < right  && nums[right] == nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }

        return result;
    }
}