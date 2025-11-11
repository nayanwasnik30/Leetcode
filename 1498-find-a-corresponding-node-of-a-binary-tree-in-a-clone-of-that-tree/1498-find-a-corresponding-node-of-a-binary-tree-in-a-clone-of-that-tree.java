class Solution {
    public final TreeNode getTargetCopy(final TreeNode og, final TreeNode cl, final TreeNode target) {
        return find(og,cl,target);
    }

    public TreeNode find(TreeNode og,TreeNode cl,TreeNode target){
        if(og == null || cl== null) return null; 
        if(og==target) return cl ;
        TreeNode left=find(og.left,cl.left,target);
        if(left != null) return left;
       
        return find(og.right,cl.right,target);
    }
}