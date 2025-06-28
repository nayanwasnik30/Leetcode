class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans= new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        makeCombiUtil(n, 1, k,list);
        return ans;
    }
    public static void makeCombiUtil(int n,int idx,int k,List<Integer> list){
        if(k==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(k>n || n==0){
            return ;
        }

        list.add(idx);
        makeCombiUtil(n-1,idx+1,k-1,list);
        list.remove(list.size()-1);// backtracking
        
        makeCombiUtil(n-1,idx+1,k,list);

    }
    
}