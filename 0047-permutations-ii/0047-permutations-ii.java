class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
    ans = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        boolean [] bool = new boolean[nums.length];
        helper(nums,0,bool,list);
        return ans;
    }
    public void helper(int [] arr,int idx,boolean [] bool,List<Integer> list){
        if(arr.length==list.size()){
            if(ans.contains(list)){
                return;
            }
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int i=0;i<arr.length;i++){
            if(bool[i]==true)continue;

            list.add(arr[i]);
            bool[i]=true;
            
            helper(arr,idx,bool,list);
            
            bool[i]=false;
            list.remove(list.size()-1);

        }
    }
    
}
