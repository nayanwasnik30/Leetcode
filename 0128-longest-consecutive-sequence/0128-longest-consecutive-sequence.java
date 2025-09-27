class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Boolean> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],false);
        }
        int lseq=0;
        for(int i=0;i<n;i++){
            int curr=1;

            int next=nums[i]+1;
            while(map.containsKey(next) && map.get(next)==false){
                curr++;
                map.put(next,true);
                next++;
            }
            int prev=nums[i]-1;
            while(map.containsKey(prev) && map.get(prev)==false){
                curr++;
                map.put(prev,true);
                prev--;
            }

            lseq=Math.max(lseq,curr);
        }

        return lseq;
    }
}