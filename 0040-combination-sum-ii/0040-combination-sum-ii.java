class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
        if(target==0){
            ans.add(new ArrayList<>(list));
        }
        
       for(int i=idx;i<arr.length;i++){
        if(i>idx && arr[i]==arr[i-1]){
            continue;
        }
        list.add(arr[i]);
        helper(arr,target-arr[i],i+1,list);
        list.remove(list.size()-1);
       }
    }
}