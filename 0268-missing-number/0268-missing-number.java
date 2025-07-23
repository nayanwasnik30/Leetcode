class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%(n+1)<n){
                int value=nums[i]%(n+1);
                nums[value]=nums[value]+(n+1);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]<(n+1)) return i;
        }
        return n;
    }
}