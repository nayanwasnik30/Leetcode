class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxfreq=0;
        int maxele=nums[0];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
           if(maxfreq<=map.get(nums[i])){
            maxfreq=map.get(nums[i]);
            maxele=nums[i];
           }
        }
        int total=0;
        for(int val:map.values()){
            if(val==maxfreq){
                total=total+val;
            }
        }
        return total;
    }
}