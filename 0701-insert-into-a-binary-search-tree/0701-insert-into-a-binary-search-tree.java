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
    public TreeNode insertIntoBST(TreeNode root, int key) {
          
        if(root == null){
            TreeNode nn= new TreeNode(key);
            return nn;
        }
        if(key == root.val){
            return root;
        }
        if(root.val<key){
            root.right=insertIntoBST(root.right,key);
        }
        else{
            root.left=insertIntoBST(root.left,key);
        }
        return root;
    }
}