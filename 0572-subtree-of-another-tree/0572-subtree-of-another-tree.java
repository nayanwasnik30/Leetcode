class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return false;
        if(root==null || subRoot==null) return false;
        
        return  dfs(root,subRoot)||isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }

    public boolean dfs(TreeNode root,TreeNode  sub){
        if(root == null && sub==null)  return true;
        if(root==null || sub==null) return false;
        if(root.val !=sub.val) return false;

        return dfs(root.left,sub.left) && dfs(root.right,sub.right);
    }
}