class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); int target=0;
        List<List<Integer>> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if(sum==target){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[right]){
                        left++;
                    }
                    while(right>left && nums[right-1]==nums[right]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return list;
    }
}