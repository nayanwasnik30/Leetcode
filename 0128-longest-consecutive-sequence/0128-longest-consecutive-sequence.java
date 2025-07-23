class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer ,Boolean > map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)==true){
                map.put(nums[i],false);
            }
        }
        int max=0;
        for(int value:map.keySet()){
            if(map.containsKey(value-1)==true){
                map.put(value,false);
            }
            if(map.get(value)==true){
                int curr=1;
                while(map.containsKey(value + 1)!=false){
                    curr++;
                    value++;
                }
                max=Math.max(max,curr);
            }
           
        }


        return max;

    }
}