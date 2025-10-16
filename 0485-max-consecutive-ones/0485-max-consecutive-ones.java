class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int left=0;
        int right=0;

        while(right<nums.length){
            int count=0;
            if(nums[left]==0){
                left++;
                right++;
            }

            while(right<nums.length && nums[right]==1 ){
                count++;
                right++;
            }
            max=Math.max(max,count);
            left=right;
        }

        return max;
    }
}