class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int ans=0;
        int n=nums.length;
         List<List<Integer>> list= new ArrayList<>();
        if(n<4){
            return list;
        }
        Arrays.sort(nums);
        for(int i=n-1;i>=3;i--){
            if (i < n - 1 && nums[i] == nums[i + 1]) continue;
            for(int j=i-1;j>=2;j--){
                if (j < i - 1 && nums[j] == nums[j + 1]) continue;
                int left=0;
                int right=j-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        list.add(Arrays.asList(nums[left],nums[right],nums[i],nums[j]));
                        // now to skip same element ;
                        while(nums[left]==nums[left+1] && left<right){
                            left++;
                        }
                        while(nums[right]==nums[right-1] && left<right){
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