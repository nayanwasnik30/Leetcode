class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(nums[left]<=nums[right]){
            return nums[0];
        }
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]>=nums[0]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return nums[left];
    }
}