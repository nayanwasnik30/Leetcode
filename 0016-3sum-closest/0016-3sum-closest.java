class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        
        for(int i=nums.length-1;i>=1;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return ans;
    }
}