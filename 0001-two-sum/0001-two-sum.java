class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)==true){
                x=map.get(temp);
                y=i;
            }
            map.put(nums[i],i);
        }
        int [] arr= new int [2];
        arr[0]=x;
        arr[1]=y;

        return arr;
    }
}