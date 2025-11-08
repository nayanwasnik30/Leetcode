/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static class pair{
        int height;
        boolean balance;
        pair(int height, boolean balance){
            this.height=height;
            this.balance=balance;
        }
    }
    private pair dfs(TreeNode root){
        if(root==null) return new pair(0,true);
        pair left=dfs(root.left);
        pair right=dfs(root.right);

        if(left.balance==false || right.balance==false){
            return new pair(0,false);
        }

        if(Math.abs(left.height-right.height)>1) 
        return new pair(0,false);

        return new pair(Math.max(left.height,right.height)+1,true);

    }

    public boolean isBalanced(TreeNode root) {
        boolean bool=dfs(root).balance;
        return bool;
    }
}