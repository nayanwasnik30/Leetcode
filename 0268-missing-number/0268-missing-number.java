class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int flag=1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                flag=i;
                return flag;
            }
        }
        return nums.length;
    }
}