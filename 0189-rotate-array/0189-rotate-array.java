class Solution {
    public void rotate(int[] nums, int k) {
       ArrayList<Integer> list= new ArrayList<>();
       int n=nums.length;
       k=k%n;
       int idx=n+1;
       idx=n-k;

       for(int i=idx;i<nums.length;i++){
            list.add(nums[i]);
       }
       for(int i=0;i<idx;i++){
            list.add(nums[i]);
       }
       for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
       }
    }
}