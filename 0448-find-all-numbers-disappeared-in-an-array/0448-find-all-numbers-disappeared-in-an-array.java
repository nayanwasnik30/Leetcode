class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n=nums.length;
        for(int i=0;i<n;i++){
          int val=nums[i]%(n+1);
         // if (val == 0) continue;
          nums[val-1]+=(n+1);
        }
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<=n) list.add(i+1);
        }
        return list;
    }
}