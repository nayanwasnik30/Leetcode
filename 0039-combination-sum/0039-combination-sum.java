class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans= new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(candidates,target,0,list);
        return ans;
    }
    public void helper(int []arr,int target,int idx,List<Integer> list){
        if(target<0){
            return ;
        }
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(arr[idx]);
        helper(arr,target-arr[idx],idx,list);
        list.remove(list.size()-1);

        helper(arr,target,idx+1,list);
    }
}