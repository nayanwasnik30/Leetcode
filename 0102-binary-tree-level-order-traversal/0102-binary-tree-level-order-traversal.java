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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
         Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ml = new LinkedList<List<Integer>>();
        if(root==null) return ml;
        queue.add(root);
        
        while(!queue.isEmpty()){
            int n =queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                root =queue.remove();
                list.add(root.val);
                
                if(root.left !=null){
                    queue.add(root.left);
                }
                if(root.right != null){
                    queue.add(root.right);
                }
            }
            ml.add(list);
            
        }
        return ml;
    }
}