class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int ans=0;
        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            int smax=nums[i]+1;
            if(map.containsKey(smax)){
                ans=Math.max(ans,map.get(max)+map.get(smax));
            }
        }

        return ans;
    }
}