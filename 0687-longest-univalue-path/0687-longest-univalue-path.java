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
     int maxNodesCount;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        
        maxNodesCount = 0;
        
        findNodesCount(root);
        
        return maxNodesCount - 1;
    }
    
    private int[] findNodesCount(TreeNode node){
        if(node == null) return new int[]{0, 0};
        
        int[] left  = findNodesCount(node.left);
        int[] right = findNodesCount(node.right);
        
        
        int leftCount = (left[0] == node.val) ? left[1] : 0;
        int rightCount = (right[0] == node.val) ? right[1] : 0;
        
        maxNodesCount = Math.max(maxNodesCount, 1 + leftCount + rightCount);
        
        return new int[]{node.val, 1 + Math.max(leftCount, rightCount)};
    }
}