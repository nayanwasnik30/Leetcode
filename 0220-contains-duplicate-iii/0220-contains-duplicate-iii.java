class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int idx, int vdf) {
        TreeSet<Long> map= new TreeSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
        
            if(i-idx-1>=0){
                map.remove((long)nums[i-idx-1]);
            }
            Long floor=map.floor((long)nums[i]);
            Long ceil=map.ceiling((long)nums[i]);
            if(floor != null && nums[i]-floor <=vdf){
                return true;
            }
            if(ceil !=null && ceil-nums[i]<=vdf){
                return true;
            }
             map.add((long)nums[i]);
        }

        return false;
    }
}