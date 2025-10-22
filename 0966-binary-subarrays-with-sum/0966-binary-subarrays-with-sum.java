class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currsum=0; int count=0;
        map.put(0,1);
        for(int right=0;right<nums.length;right++){
            currsum+=nums[right];

            int beforSum=currsum-k;
            if(map.containsKey(beforSum)){
                count+=map.get(beforSum);
            }

            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }

        return count;
    }
}