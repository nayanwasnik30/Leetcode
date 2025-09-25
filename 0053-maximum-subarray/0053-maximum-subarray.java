class Solution {
    public int maxSubArray(int[] nums) {
       
       int currsum = nums[0];   // current subarray sum
        int maxsum = nums[0];    // best sum so far
        for(int i=1;i<nums.length;i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            maxsum=Math.max(currsum,maxsum);
        }

        return maxsum;
    }
}