class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int count =0;

        for(int i =0; i<nums1.length; i++){
            for(int j =0; j<nums2.length; j++){
                int sum = nums1[i] + nums2[j];

                hm.put(sum,hm.getOrDefault(sum, 0)+1);

            }
        }

                for(int k = 0; k<nums3.length; k++){
                    for(int l =0; l<nums4.length; l++){
                        int sum2 = nums3[k] + nums4[l];

                        if(hm.containsKey(-sum2)){
                            count += hm.get(-sum2);
                        }
                    }
                }
                return count;
    }
}