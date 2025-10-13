class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-ans)>Math.abs(target-sum)){ //(2-1)>(2-4)// means your are not closet to the sum
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