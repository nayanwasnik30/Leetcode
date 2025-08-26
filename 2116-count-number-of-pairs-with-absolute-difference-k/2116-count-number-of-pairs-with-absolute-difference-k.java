class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(map.containsKey(n-k)==true){
                count+=map.get(n-k);
            }if(map.containsKey(n+k)){
                count+=map.get(n+k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}