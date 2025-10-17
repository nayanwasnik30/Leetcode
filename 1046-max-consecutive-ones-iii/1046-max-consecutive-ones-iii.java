class Solution {
    public int longestOnes(int[] nums, int k) {
      int left=0;
      int right=0;
      int max=0;
      int n=nums.length;
      int zero=0;
      while(right<n){
       if(nums[right]==0) zero++;
        while(zero>k){
           if(nums[left]==0) zero--;
           left++;
        }
        max=Math.max(max,right-left+1);
        right++;
      }  
      return max;
    }
}