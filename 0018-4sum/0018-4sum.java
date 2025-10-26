class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int ans=0;
        int n=nums.length;
         List<List<Integer>> list= new ArrayList<>();
        if(n<4){
            return list;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if (j>i+1&& nums[j]==nums[j-1]) continue;
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        list.add(Arrays.asList(nums[left],nums[right],nums[i],nums[j]));
                        // now to skip same element ;
                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(right>left && nums[right]==nums[right-1]){
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
        }

          return list;
    }
}